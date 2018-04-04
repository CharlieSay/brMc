package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Items.Weapon.Assault.AssaultRifle;
import co.uk.ocelotcr.Items.Weapon.Assault.RareAssault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class StateListener implements Listener {

    private static final List<Player> currentPlayerList;

     static {
        currentPlayerList = new LinkedList<>();
    }

    public static List<Player> getCurrentPlayerList() {
        return currentPlayerList;
    }

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        currentPlayerList.add(player);
        if (player.getName().equalsIgnoreCase("ocelotcr")) {
            player.getInventory().clear();
            AssaultRifle rareAssault = new RareAssault();
            ItemStack rareAr = new ItemStack(rareAssault.getItemMaterial());
            ItemMeta rareArItemMeta = rareAr.getItemMeta();

            rareArItemMeta.setDisplayName(rareAssault.getMetaStringName());
            rareArItemMeta.setLore(Arrays.asList("Damage : "+rareAssault.getDamage(),"DPS : "+rareAssault.getDamagePerSecond(),"Rarity : " + rareAssault.getItemRarity()));
            rareAr.setItemMeta(rareArItemMeta);

            Bukkit.getLogger().log(Level.INFO,"Item Name " + rareAr.getItemMeta().getDisplayName());
            player.getInventory().setItemInMainHand(rareAr);
            player.sendMessage("Take an AR Mate.");
            Bukkit.broadcastMessage("What AN AR");
        }
     }

    @EventHandler
    public void playerLeave(PlayerQuitEvent e)
    {
        e.getPlayer().getInventory().clear();
        currentPlayerList.remove(e.getPlayer());
    }

}
