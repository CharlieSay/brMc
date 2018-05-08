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
    private int playerHealth;
    private int playerShield;
    private Player bukkitPlayer;

    public BrPlayer(Player bukkitPlayer){
        this.bukkitPlayer = bukkitPlayer;
    }

    private void playerSetUp(){
        playerHealth = 100;
        playerShield = 0;
        currentlyShooting = false;
        bukkitPlayer.getInventory().clear();
        AssaultRifle rareAssault = new RareAssault();
        ItemStack rareAr = new ItemStack(rareAssault.getItemMaterial());
        ItemMeta rareArItemMeta = rareAr.getItemMeta();

        rareArItemMeta.setDisplayName(rareAssault.getMetaStringName());
        rareArItemMeta.setLore(Arrays.asList("Damage : "+rareAssault.getDamage(),"DPS : "+rareAssault.getDamagePerSecond(),"Rarity : " + rareAssault.getItemRarity()));
        rareAr.setItemMeta(rareArItemMeta);

        Bukkit.getLogger().log(Level.INFO,"Item Name " + rareAr.getItemMeta().getDisplayName());
        bukkitPlayer.getInventory().setItemInMainHand(rareAr);
        bukkitPlayer.sendMessage("Take an AR Mate.");
        Bukkit.broadcastMessage("What AN AR");
    }

    public Player getBukkitPlayer() {
        return bukkitPlayer;
    }

    public boolean isCurrentlyShooting() { return currentlyShooting; }

    public void setCurrentlyShooting(boolean state){ this.currentlyShooting = state;}
}
