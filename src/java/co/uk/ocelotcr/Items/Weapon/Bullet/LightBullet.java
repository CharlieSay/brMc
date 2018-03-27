package co.uk.ocelotcr.Items.Weapon.Bullet;

public class LightBullet extends Bullet {

    private final int MAX_STACK_AMOUNT = 999;

    public LightBullet() {
        super.setCurrentStackAmount(0);
        super.setItemName("Light Bullets");
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
