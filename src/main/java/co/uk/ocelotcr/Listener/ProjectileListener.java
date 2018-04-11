package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

import java.util.logging.Level;

public class ProjectileListener implements Listener {

    @EventHandler
    public void projectileLaunch(ProjectileLaunchEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
            Player p = (Player) projectileSource;
            Bukkit.broadcastMessage("Projectile Launch Event by " + p.getDisplayName());
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                    == (ChatColor.BLUE+"Assault Rifle - Rare")){
                Bukkit.broadcastMessage("He Had an rare AR");
            }
        }

    }

    @EventHandler
    public void projectileHit(ProjectileHitEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
            Bukkit.getLogger().log(Level.INFO, "Hit by " + ((Player) projectileSource).getDisplayName());
        }

    }

}
