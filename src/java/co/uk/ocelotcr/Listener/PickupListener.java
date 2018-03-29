package co.uk.ocelotcr.Listener;

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
        }
    }

}
