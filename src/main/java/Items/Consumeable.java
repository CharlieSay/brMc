package Items;

public abstract class Consumeable extends Item implements Stackable{

    private int consumeSpeed;

    public void setConsumeSpeed(int consumeSpeed) { this.consumeSpeed = consumeSpeed; }

    public int getConsumeSpeed(){
        return consumeSpeed;
    }
}
