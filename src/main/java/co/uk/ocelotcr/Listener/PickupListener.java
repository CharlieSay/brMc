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
                Bukkit.getLogger().log(Level.INFO,"Is an item that we made.");
            }else{
                e.setCancelled(true);
                Bukkit.getLogger().log(Level.INFO,"Isnt an item that we made.");
            }
        }
    }

}
