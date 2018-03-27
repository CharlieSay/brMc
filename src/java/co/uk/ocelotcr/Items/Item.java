package co.uk.ocelotcr.Items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Item {

    private Material materialObject;
    private String itemName;
    private RARITY_LEVEL itemRarity;

    public void setMetaOnMaterial(ItemStack itemStack){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.getByChar(getItemRarity().toString()) + getItemName());
    }

    public void setMaterialObject(Material materialObject) {
        this.materialObject = materialObject;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemRarity(RARITY_LEVEL itemRarity) {
        this.itemRarity = itemRarity;
    }

    public String getItemName() {
        return itemName;
    }
    public Material getItemMaterial() { return materialObject; }
    public RARITY_LEVEL getItemRarity() { return itemRarity; }

    public Color getRarityAsColor(){
        switch(itemRarity){
            case LEGENDARY:
                return Color.ORANGE;
            case EPIC:
                return Color.PURPLE;
            case RARE:
                return Color.BLUE;
            case UNCOMMON:
                return Color.GREEN;
            case COMMON:
                return Color.GRAY;
            default:
                return Color.GRAY;
        }
    }

    public enum RARITY_LEVEL{
        LEGENDARY, //Orange
        EPIC, //Purple
        RARE, //Blue
        UNCOMMON,//Green
        COMMON//Grey
    }

}
