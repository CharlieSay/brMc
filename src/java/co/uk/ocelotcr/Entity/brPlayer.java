package co.uk.ocelotcr.Entity;

import org.bukkit.entity.Player;

/*
This class is ONLY FOR WHEN THE GAME HAS STARTED HENCE BRPLAYER.

Do NOT Use this outside of the game STARTING.

 */

public class brPlayer {

    private int playerHealth;
    private int playerShield;
    private Player bukkitPlayer;

    public brPlayer(Player bukkitPlayer){
        this.bukkitPlayer = bukkitPlayer;
        playerHealth = 100;
        playerShield = 0;
    }

}
