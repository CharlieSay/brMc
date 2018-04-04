package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class funnyShoot {

    public void shootemUp(Player p){
        Bukkit.getLogger().log(Level.INFO,"ShootEmEUp");
        for (int i = 0;i<30;i++){
            p.launchProjectile(Arrow.class);
        }
    }

}
