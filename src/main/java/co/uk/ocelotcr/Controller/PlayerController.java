package co.uk.ocelotcr.Controller;

import co.uk.ocelotcr.Entity.BrPlayer;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class PlayerController {

    private List<BrPlayer> playerList = new LinkedList();

    public void putPlayerInList(Player player){
        playerList.add(new BrPlayer(player));
    }

    //Get Player via DisplayName
    public Player getPlayerFromList(String name){
        for (BrPlayer p : playerList){
            if (p.getBukkitPlayer().getDisplayName().equalsIgnoreCase(name)){
                return p.getBukkitPlayer();
            }
        }
        return null;
    }

    public void setShieldOnPlayer(Player player){
        for (BrPlayer brPlayer : playerList){
            if (brPlayer.getBukkitPlayer().equals(player)){
                brPlayer.setPlayerShield(brPlayer.getPlayerShield()+50);
            }
        }
    }

    public void removeShield(Player player){
        for (BrPlayer brPlayer : playerList){
            if (brPlayer.getBukkitPlayer().equals(player)){
                brPlayer.setPlayerShield(brPlayer.getPlayerShield()-25);
            }
        }
    }

}
