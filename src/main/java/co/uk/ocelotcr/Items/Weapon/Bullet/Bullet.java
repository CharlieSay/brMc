package co.uk.ocelotcr.Items.Weapon.Bullet;

import co.uk.ocelotcr.Items.Item;
import co.uk.ocelotcr.Items.Stackable;
import org.bukkit.Material;

public abstract class Bullet extends Item implements Stackable {

    private int currentStackAmount;

    public Bullet() {
        super.setMaterialObject(Material.ARROW);
        super.setItemRarity(RARITY_LEVEL.COMMON);
    }

    public int getCurrentStackAmount() {
        return currentStackAmount;
    }

    public void setCurrentStackAmount(int currentStackAmount) {
        this.currentStackAmount = currentStackAmount;
    }

}
