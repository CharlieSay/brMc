package Items.HealthItems;

import Items.Consumeable;

public abstract class HealthItem extends Consumeable{

    private int healthValue;

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue(){
        return healthValue;
    }

}
