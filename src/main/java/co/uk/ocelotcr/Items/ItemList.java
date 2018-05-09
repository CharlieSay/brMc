package co.uk.ocelotcr.Items;

import co.uk.ocelotcr.Items.HealthItems.Bandage;
import co.uk.ocelotcr.Items.HealthItems.MedicalKit;
import co.uk.ocelotcr.Items.ShieldItems.HugeShield;
import co.uk.ocelotcr.Items.ShieldItems.LargeShield;
import co.uk.ocelotcr.Items.ShieldItems.MiniShield;
import co.uk.ocelotcr.Items.Weapon.Assault.*;
import co.uk.ocelotcr.Items.Weapon.Bullet.*;
import org.bukkit.Material;

import java.util.LinkedList;
import java.util.List;

public class ItemList {

    private static List<Item> itemReferenceList = new LinkedList<>();

    public static boolean isItemOnlist(Material material){
        for (Item iterationItem : itemReferenceList){
            if (iterationItem.equals(material)){
                return true;
            }
        }
        return false;
    }


    private static void populateItemReferenceList(){
        //AR
        itemReferenceList.add(new CommonAssault());
        itemReferenceList.add(new EpicAssault());
        itemReferenceList.add(new LegendaryAssault());
        itemReferenceList.add(new RareAssault());
        itemReferenceList.add(new UncommonAssault());

        //Bullet
        itemReferenceList.add(new HeavyBullet());
        itemReferenceList.add(new LightBullet());
        itemReferenceList.add(new MediumBullet());
        itemReferenceList.add(new RocketBullet());
        itemReferenceList.add(new ShellBullet());

        //Health
        itemReferenceList.add(new Bandage());
        itemReferenceList.add(new MedicalKit());

        //Shield
        itemReferenceList.add(new HugeShield());
        itemReferenceList.add(new LargeShield());
        itemReferenceList.add(new MiniShield());

    }

    public static void addToItemList(Item item){
        itemReferenceList.add(item);
    }

    public static List<Item> getItemReferenceList() {
        return itemReferenceList;
    }
}
