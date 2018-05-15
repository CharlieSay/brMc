package co.uk.ocelotcr.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.projectiles.ProjectileSource;

import java.util.logging.Level;

public class ProjectileListener implements Listener {

    public static int shootTimer = 20;

    @EventHandler
    public void projectileLaunch(ProjectileLaunchEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
            Player player = (Player) projectileSource;
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            Bukkit.getLogger().log(Level.INFO,itemInMainHand.getItemMeta().toString());
        }

    }

    private void runTask(Player p){
        if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() == (ChatColor.BLUE+"Assault Rifle - Rare")){
            Bukkit.getScheduler().scheduleSyncRepeatingTask(BattleRoyaleMinecraft.getBrInstance(),
                    () -> {
                        shootTimer -= 1;
                        p.launchProjectile(Arrow.class).setCritical(true);
                        if (shootTimer==0){
                            Bukkit.getScheduler().cancelAllTasks();
                        }
                    },0L,10L);
        }
    }

    @EventHandler
    public void projectileHit(ProjectileHitEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player){
           Player player = (Player) projectileSource;
        }
    }

    @EventHandler
    public void EntityDamageByEntityEvent(EntityDamageByEntityEvent e){
        if (e.getEntity() instanceof Player){
            Player p = (Player) e.getEntity();
            e.setCancelled(true);
        }
    }
}
