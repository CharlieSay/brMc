package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Controller.ItemController;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class PickupListener implements Listener{

    @EventHandler
    public void whatWeapon(EntityPickupItemEvent e){
        if (e instanceof Player){
            Player player = (Player) e;
            Item itemPickup = e.getItem();
            if (ItemController.isItemOnlist(itemPickup.getItemStack().getType())){
                player.sendRawMessage("Is an item that we made.");
            }else{
                player.sendRawMessage("Isnt an item that we made.");
                e.setCancelled(true);
            }
        }
    }

}
