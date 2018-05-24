package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Items.ItemList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

import java.util.logging.Level;

public class PickupListener implements Listener{

    @EventHandler
    public void whatWeapon(EntityPickupItemEvent e){
        if (e instanceof Player){
            Player player = (Player) e;
            Item itemPickup = e.getItem();
            if (ItemList.isItemOnlist(itemPickup.getItemStack().getType())){
                player.sendRawMessage("Is an item that we made.");
            }else{
                player.sendRawMessage("Isnt an item that we made.");
                e.setCancelled(true);
            }
        }
    }

}
