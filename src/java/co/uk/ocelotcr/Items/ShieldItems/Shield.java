package co.uk.ocelotcr.Items.ShieldItems;

import co.uk.ocelotcr.Items.Consumeable;

public abstract class Shield extends Consumeable {

    private int shieldValue;

    public void setShieldValue(int shieldValue) {
        this.shieldValue = shieldValue;
    }

    public int getShieldValue(){
        return shieldValue;
    }

}
