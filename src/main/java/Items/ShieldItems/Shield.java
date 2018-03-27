package Items.ShieldItems;

import Items.Consumeable;

public abstract class Shield extends Consumeable{

    private int shieldValue;

    public void setShieldValue(int shieldValue) {
        this.shieldValue = shieldValue;
    }

    public int getShieldValue(){
        return shieldValue;
    }

}
