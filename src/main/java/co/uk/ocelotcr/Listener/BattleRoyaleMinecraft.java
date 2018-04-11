package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Controller.ScoreboardController;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
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

    private Scoreboard scoreboard;
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
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PickupListener(),this);
        pluginManager.registerEvents(new ProjectileListener(),this);
        pluginManager.registerEvents(new StateListener(),this);
        Bukkit.setDefaultGameMode(GameMode.ADVENTURE);
        ScoreboardController scoreboardController = new ScoreboardController();
        scoreboard = scoreboardController.getScoreBoard();
        scheduler = Bukkit.getScheduler();
        brInstance = this;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (command.getName().equalsIgnoreCase("cleantest")){
                Location location = p.getLocation();
                location.getWorld().playEffect(location,Effect.ANVIL_BREAK,100);
                p.setTotalExperience(1000);
                Bukkit.getLogger().log(Level.INFO, "Clean Test execute");
            }else if(command.getName().equalsIgnoreCase("arrowrain")){
                funnyShoot FunnyShoot = new funnyShoot();
                FunnyShoot.shootemUp((Player) sender);
                Bukkit.getLogger().log(Level.INFO, "Rain Arrows execute");
            }
        }else{
            Bukkit.getLogger().log(Level.INFO, "Illegal Command Sender");
        }
        return false;
    }
}
