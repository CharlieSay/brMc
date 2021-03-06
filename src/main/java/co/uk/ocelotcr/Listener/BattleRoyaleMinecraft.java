package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Commands.ArrowRain;
import co.uk.ocelotcr.Commands.CleanTest;
import co.uk.ocelotcr.Controller.GameController;
import co.uk.ocelotcr.Controller.GameState;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Scoreboard;

import java.util.logging.Level;

public class BattleRoyaleMinecraft extends JavaPlugin{

    private BukkitScheduler scheduler;

    public static BattleRoyaleMinecraft getBrInstance() {
        return brInstance;
    }

    private static BattleRoyaleMinecraft brInstance;

    public BukkitScheduler getScheduler() {
        return scheduler;
    }

    @Override
    public void onEnable(){
        PluginLogger.getGlobal().log(Level.INFO,"Enabled - brMc");
        GameController.setGameState(GameState.PRE_LOBBY);
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PickupListener(),this);
        pluginManager.registerEvents(new ProjectileListener(),this);
        pluginManager.registerEvents(new StateListener(),this);
        Bukkit.setDefaultGameMode(GameMode.ADVENTURE);
        scheduler = Bukkit.getScheduler();
        brInstance = this;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && GameController.getCurrentState() == GameState.IN_LOBBY){
            Player p = (Player) sender;
            if (command.getName().equalsIgnoreCase("cleantest")){
                 new CleanTest().PerformCommand(p);
            }else if(command.getName().equalsIgnoreCase("arrowrain")){
                new ArrowRain().PerformCommand(p);
            }
        }else{
            Bukkit.getLogger().log(Level.INFO, "Illegal Command Sender");
        }
        return false;
    }
}
