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
        itemMeta.setDisplayName(getRarityForChatColor() + getItemName());
        itemStack.setItemMeta(itemMeta);
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

    public String getMetaStringName(){
        return getRarityForChatColor() + getItemName();
    }
    public String getItemName() {
        return itemName;
    }
    public Material getItemMaterial() { return materialObject; }
    public RARITY_LEVEL getItemRarity() { return itemRarity; }

    public Color getRarityAsColor(){
        if (itemRarity != null){
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
            }
        }
        return Color.GRAY;
    }

    public ChatColor getRarityForChatColor(){
        if (itemRarity != null){
            switch(itemRarity){
                case LEGENDARY: return ChatColor.GOLD;
                case EPIC: return ChatColor.LIGHT_PURPLE;
                case RARE: return ChatColor.BLUE;
                case UNCOMMON: return ChatColor.GREEN;
                case COMMON: return ChatColor.GRAY;
                }
            }
        return ChatColor.RESET;
    }

    public enum RARITY_LEVEL{
        LEGENDARY, //Orange
        EPIC, //Purple
        RARE, //Blue
        UNCOMMON, //Green
        COMMON //Grey
    }

    public boolean equals(Item obj) {
        return obj.getItemName().equals(this.getItemName());
    }
}
