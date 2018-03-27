package Items.Weapon.Bullet;

import org.bukkit.Material;

public class HeavyBullet extends Bullet{

    private final int MAX_STACK_AMOUNT = 999;

    public HeavyBullet() {
        super.setCurrentStackAmount(0);
        super.setItemName("Heavy Bullets");
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
