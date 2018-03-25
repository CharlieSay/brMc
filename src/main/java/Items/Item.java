package Items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Item {

    public Material materialObject;
    public String itemName;

    public String getItemName() {
        return itemName;
    }

    public Material getItemID() {
        return materialObject;
    }

    public void setMetaOnMaterial(ItemStack itemStack){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.getByChar(getItemRarity().toString()) + getItemName());
    }

    protected enum RARITY_LEVEL{
        LEGENDARY, //Orange
        EPIC, //Purple
        RARE, //Blue
        UNCOMMON,//Green
        COMMON;//Grey
    }

    public RARITY_LEVEL itemRarity;

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
}
