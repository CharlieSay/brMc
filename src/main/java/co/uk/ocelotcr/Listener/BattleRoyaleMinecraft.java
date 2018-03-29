package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

import static co.uk.ocelotcr.Listener.StateListener.*;

public class BattleRoyaleMinecraft extends JavaPlugin{

    public static void main(String[] args) {
    }

    @Override
    public void onEnable(){
        PluginLogger.getGlobal().log(Level.INFO,"Enabled - brMc");
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PickupListener(),this);
        pluginManager.registerEvents(new ProjectileListener(),this);
        pluginManager.registerEvents(new StateListener(),this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("rainDownMan")){
            Player p = getCurrentPlayerList().get(0);
            Location location = p.getLocation();
            location.getWorld().playEffect(location,Effect.ANVIL_BREAK,100);
        }
        return super.onCommand(sender, command, label, args);
    }


    @Override
    public void onDisable(){
    }

}
