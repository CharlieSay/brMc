package Items.Weapon.Bullet;

import Items.Item;
import Items.Stackable;
import org.bukkit.Color;
import org.bukkit.Material;

public abstract class Bullet extends Item implements Stackable{

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
