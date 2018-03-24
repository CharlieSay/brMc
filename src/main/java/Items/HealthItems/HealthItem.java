package Items.HealthItems;

import Items.Consumeable;

public abstract class HealthItem extends Consumeable{

    public int healthValue;

    public int getHealthValue(){
        return healthValue;
    }

}
