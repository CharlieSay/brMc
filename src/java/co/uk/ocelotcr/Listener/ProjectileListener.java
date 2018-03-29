package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

public class ProjectileListener implements Listener {

    @EventHandler
    public void projectileLaunch(ProjectileLaunchEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
            Player p = (Player) projectileSource;
            Bukkit.broadcastMessage("Projectile Launch Event by " + p.getDisplayName());
        }

    }

    @EventHandler
    public void projectileHit(ProjectileHitEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
            Player p = (Player) projectileSource;
            Bukkit.broadcastMessage("Projectile Hit Event by" + p.getDisplayName());
            Bukkit.broadcastMessage(e.getHitBlock().toString());
        }

    }

}
