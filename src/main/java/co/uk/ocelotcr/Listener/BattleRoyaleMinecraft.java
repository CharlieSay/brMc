package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BattleRoyaleMinecraft extends JavaPlugin{

    public static void main(String[] args) {
    }

    @Override
    public void onEnable(){
        PluginLogger.getGlobal().log(Level.INFO,"Enabled - brMc");
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PickupListener(),this);
    }

    @Override
    public void onDisable(){
    }

}
