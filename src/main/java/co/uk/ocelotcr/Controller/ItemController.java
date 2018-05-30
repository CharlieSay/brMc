package co.uk.ocelotcr.Controller;

import co.uk.ocelotcr.Items.HealthItems.Bandage;
import co.uk.ocelotcr.Items.HealthItems.MedicalKit;
import co.uk.ocelotcr.Items.Item;
import co.uk.ocelotcr.Items.ItemList;
import co.uk.ocelotcr.Items.ShieldItems.HugeShield;
import co.uk.ocelotcr.Items.ShieldItems.LargeShield;
import co.uk.ocelotcr.Items.ShieldItems.MiniShield;
import co.uk.ocelotcr.Items.Weapon.Assault.*;
import co.uk.ocelotcr.Items.Weapon.Bullet.*;
import co.uk.ocelotcr.Items.Weapon.Deployable.Trap;
import org.bukkit.Material;

import java.util.LinkedList;
import java.util.List;

public class ItemController {

    private static List<Item> itemReferenceList = new LinkedList<>();
    private static List<ItemList> itemListReference = new LinkedList<>();

    public static boolean isItemOnlist(Material material){
        for (Item iterationItem : itemReferenceList){
            if (iterationItem.equals(material)){
                return true;
            }
        }
        return false;
    }

    private static void populateItemListReferenceList(){
        itemListReference.add(ItemList.COMMON_ASSAULT);
        itemListReference.add(ItemList.EPIC_ASSAULT);
        itemListReference.add(ItemList.LEGENDARY_ASSAULT);
        itemListReference.add(ItemList.RARE_ASSAULT);
        itemListReference.add(ItemList.UNCOMMON_ASSAULT);

        itemListReference.add(ItemList.HEAVY_BULLET);
        itemListReference.add(ItemList.LIGHT_BULLET);
        itemListReference.add(ItemList.MEDIUM_BULLET);
        itemListReference.add(ItemList.ROCKET_BULLET);
        itemListReference.add(ItemList.SHELL_BULLET);

        itemListReference.add(ItemList.BANDAGE);
        itemListReference.add(ItemList.MEDICAL_KIT);

        itemListReference.add(ItemList.HUGE_SHIELD);
        itemListReference.add(ItemList.LARGE_SHIELD);
        itemListReference.add(ItemList.MINI_SHIELD);

        itemListReference.add(ItemList.TRAP);
    }

    public static Item getItem(ItemList itemList){
        switch (itemList){
            case COMMON_ASSAULT : return new CommonAssault();
            case EPIC_ASSAULT : return new EpicAssault();
            case LEGENDARY_ASSAULT : return new LegendaryAssault();
            case RARE_ASSAULT : return new RareAssault();
            case UNCOMMON_ASSAULT : return new UncommonAssault();
            case HEAVY_BULLET : return new HeavyBullet();
            case LIGHT_BULLET : return new LightBullet();
            case MEDIUM_BULLET : return new MediumBullet();
            case ROCKET_BULLET : return new RocketBullet();
            case SHELL_BULLET : return new ShellBullet();
            case BANDAGE : return new Bandage();
            case MEDICAL_KIT : return new MedicalKit();
            case HUGE_SHIELD : return new HugeShield();
            case LARGE_SHIELD : return new LargeShield();
            case MINI_SHIELD : return new MiniShield();
            case TRAP : return new Trap();
        }
        return null;
    }

    public static void addToItemList(Item item){
        itemReferenceList.add(item);
    }

    public static List<Item> getItemReferenceList() {
        return itemReferenceList;
    }
}
