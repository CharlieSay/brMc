package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Items.Weapon.Assault.AssaultRifle;
import co.uk.ocelotcr.Items.Weapon.Assault.CommonAssault;
import co.uk.ocelotcr.Items.Weapon.Assault.RareAssault;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.LinkedList;
import java.util.List;

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
        AssaultRifle rareAssault = new RareAssault();
        ItemStack rareAr = new ItemStack(rareAssault.getItemMaterial());
        rareAr.getItemMeta().setDisplayName(rareAssault.getMetaStringName());
        player.getInventory().setItem(1,rareAr);
        player.sendRawMessage("Welcome Child.");
        player.sendRawMessage("Take Dis AR..");
    }

    @EventHandler
    public void playerLeave(PlayerQuitEvent e)
    {
        e.getPlayer().getInventory().clear();
        currentPlayerList.remove(e.getPlayer());
    }

}
