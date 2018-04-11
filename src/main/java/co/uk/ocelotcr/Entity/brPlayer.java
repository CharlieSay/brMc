package co.uk.ocelotcr.Entity;

import org.bukkit.entity.Player;

/**
 * This is only used when game has started.
 *
 * @Param bukkitPlayer - usage of Bukkit Player, not custom player.
 * @Param playerHealth - Current Health
 * @Param playerShield - Current Shield
*/

public class brPlayer{

    private int playerHealth;
    private int playerShield;

    private Player bukkitPlayer;

    public brPlayer(Player bukkitPlayer){
        this.bukkitPlayer = bukkitPlayer;
        playerHealth = 100;
        playerShield = 0;
    }

    public Player getBukkitPlayer() {
        return bukkitPlayer;
    }

}
