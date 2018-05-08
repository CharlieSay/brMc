package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;

import java.util.logging.Level;

import static co.uk.ocelotcr.Listener.ProjectileListener.shootTimer;

public class FunnyShoot {

    public void shootemUp(Player p, int RateOfFire){
        Bukkit.getLogger().log(Level.INFO,"ShootEmEUp");
        Bukkit.getScheduler().scheduleSyncRepeatingTask(BattleRoyaleMinecraft.getBrInstance(),
                () -> {
                    shootTimer -= 1;
                    p.launchProjectile(Arrow.class).setCritical(true);
                    if (shootTimer==0){
                        shootTimer = RateOfFire;
                        Bukkit.getScheduler().cancelAllTasks();
                    }
                },0L,16L);
    }

}
