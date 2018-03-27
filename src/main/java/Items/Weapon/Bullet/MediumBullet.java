package Items.Weapon.Bullet;

import org.bukkit.Material;

/*
AR
 */

public class MediumBullet extends Bullet {

    private final int MAX_STACK_AMOUNT = 999;

    public MediumBullet() {
        super.setCurrentStackAmount(0);
        super.setItemName("Medium Bullets");
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return MAX_STACK_AMOUNT;
    }
}
