package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EpicAssaultTest {

    EpicAssault epicAssault;

    @Before
    public void setUp(){
        epicAssault = new EpicAssault();
    }

    @Test
    public void should_SetAttributesOfCommonAssault_ThenReturnThem(){
        Material realMaterial = epicAssault.getItemMaterial();
        String realItemName = epicAssault.getItemName();
        Item.RARITY_LEVEL realRarityLevel = epicAssault.getItemRarity();
        Color realColor = epicAssault.getRarityAsColor();
        int realDamage = epicAssault.getDamage();
        int realDPS = epicAssault.getDamagePerSecond();
        int realMagSize = epicAssault.getMagazineSize();
        int realReloadTime = epicAssault.getReloadTime();


        Material materialShouldBe = Material.BOW;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.EPIC;
        Color colorShouldBe = Color.PURPLE;
        int damageShouldBe = 36;
        int dpsShouldBe = 216;
        int magSizeShouldBe = 30;
        int reloadTimeShouldBe = 2;

        Assert.assertEquals(damageShouldBe,realDamage);
        Assert.assertEquals(realReloadTime,reloadTimeShouldBe);
        Assert.assertEquals(dpsShouldBe,realDPS);
        Assert.assertEquals(realMagSize,magSizeShouldBe);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Assault Rifle - Epic",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
    }

}