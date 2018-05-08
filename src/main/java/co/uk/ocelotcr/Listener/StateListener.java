package co.uk.ocelotcr.Listener;

import co.uk.ocelotcr.Entity.BrPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class StateListener implements Listener {

    private static final HashMap<Player, BrPlayer> currentPlayerList;

     static {
        currentPlayerList = new LinkedHashMap<>();
    }

    public static HashMap<Player, BrPlayer> getCurrentPlayerList() {
        return currentPlayerList;
    }

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        BrPlayer brPlayer = new BrPlayer(player);
        currentPlayerList.put(player,brPlayer);
     }

    @EventHandler
    public void playerLeave(PlayerQuitEvent e)
    {
        e.getPlayer().getInventory().clear();
        currentPlayerList.remove(e.getPlayer());
    }

}
