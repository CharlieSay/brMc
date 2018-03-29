package co.uk.ocelotcr.Items;

public interface Stackable {


    /**
     * Generally speaking if implemented, should be stackable. But some consumables aren't stackable.
     * @return Whether or not said Item is stackable.
     */
    boolean isStackable();

    /**
     * @return The MAX Stack amount an Item can have.
     */

    int getMaxStackAmount();

}
