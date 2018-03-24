package Items;

public abstract class Consumeable extends Item implements Stackable{

    public int consumeSpeed;

    public int getConsumeSpeed(){
        return consumeSpeed;
    }
}
