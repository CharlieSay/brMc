package co.uk.ocelotcr.Controller;

import co.uk.ocelotcr.Entity.brPlayer;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class PlayerController {

    private List<brPlayer> playerList = new LinkedList();

    public void putPlayerInList(Player player){
        playerList.add(new brPlayer(player));
    }

    //Get Player via DisplayName
    public Player getPlayerFromList(String name){
        for (brPlayer p : playerList){
            if (p.getBukkitPlayer().getDisplayName().equalsIgnoreCase(name)){
                return p.getBukkitPlayer();
            }
        }
        return null;
    }

}
