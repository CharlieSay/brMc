package co.uk.ocelotcr.Entity;

import co.uk.ocelotcr.Items.Weapon.Assault.AssaultRifle;
import co.uk.ocelotcr.Items.Weapon.Assault.RareAssault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * This is only used when game has started.
 *
 * @Param bukkitPlayer - usage of Bukkit Player, not custom player.
 * @Param playerHealth - Current Health
 * @Param playerShield - Current Shield
*/

public class BrPlayer {

    private boolean currentlyShooting;

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerShield() {
        return playerShield;
    }

    public void setPlayerShield(int playerShield) {
        this.playerShield = playerShield;
    }

    private int playerHealth;
    private int playerShield;
    private Player bukkitPlayer;

    public BrPlayer(Player bukkitPlayer){
        this.bukkitPlayer = bukkitPlayer;
        playerHealth = 100;
        playerShield = 0;
        currentlyShooting = false;
        bukkitPlayer.getInventory().clear();
    }

    public Player getBukkitPlayer() {
        return bukkitPlayer;
    }

    public boolean isCurrentlyShooting() { return currentlyShooting; }

    public void setCurrentlyShooting(boolean state){ this.currentlyShooting = state;}
}
