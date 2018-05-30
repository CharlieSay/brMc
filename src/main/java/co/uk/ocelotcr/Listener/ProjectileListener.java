package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Controller.ItemController;
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

    @EventHandler
    public void projectileLaunch(ProjectileLaunchEvent e){
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (projectileSource instanceof Player) {
            Player player = (Player) projectileSource;
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            Bukkit.getLogger().log(Level.INFO, itemInMainHand.getItemMeta().toString());
            if (ItemController.isItemOnlist(itemInMainHand.getType())) {
                Bukkit.getLogger().log(Level.INFO," Is On List");
            }
            else {
                Bukkit.getLogger().log(Level.INFO," Isnt On List");
            }
        }

    }

    @EventHandler
    public void EntityDamageByEntityEvent(EntityDamageByEntityEvent e){
        if (e.getEntity() instanceof Player){
            e.setCancelled(true);
            Player p = (Player) e.getEntity();

        }
    }
}
