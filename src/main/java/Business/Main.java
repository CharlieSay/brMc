package Business;

import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Main extends JavaPlugin{

    public static void main(String[] args) {

    }

    @Override
    public void onEnable(){
        PluginLogger.getGlobal().log(Level.INFO,"Enabled - brMc");
    }

    @Override
    public void onDisable(){
    }

}
