package co.uk.ocelotcr.Items.Weapon.Deployable;

import co.uk.ocelotcr.Items.Consumeable;

public class Trap extends Consumeable {
    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return 50;
    }
}