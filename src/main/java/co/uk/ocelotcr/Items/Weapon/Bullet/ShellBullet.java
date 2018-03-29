package co.uk.ocelotcr.Items.Weapon.Bullet;

public class ShellBullet extends Bullet{

    private final int MAX_STACK_AMOUNT = 999;

    public ShellBullet() {
        super.setCurrentStackAmount(0);
        super.setItemName("Shells");
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
