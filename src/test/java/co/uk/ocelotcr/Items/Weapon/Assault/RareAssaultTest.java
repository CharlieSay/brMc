package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RareAssaultTest {

    RareAssault rareAssault;

    @Before
    public void setUp(){
        rareAssault = new RareAssault();
    }

    @Test
    public void should_SetAttributesOfCommonAssault_ThenReturnThem(){
        Material realMaterial = rareAssault.getItemMaterial();
        String realItemName = rareAssault.getItemName();
        Item.RARITY_LEVEL realRarityLevel = rareAssault.getItemRarity();
        Color realColor = rareAssault.getRarityAsColor();
        int realDamage = rareAssault.getDamage();
        int realDPS = rareAssault.getDamagePerSecond();
        int realMagSize = rareAssault.getMagazineSize();
        int realReloadTime = rareAssault.getReloadTime();


        Material materialShouldBe = Material.BOW;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.RARE;
        Color colorShouldBe = Color.BLUE;
        int damageShouldBe = 34;
        int dpsShouldBe = 170;
        int magSizeShouldBe = 30;
        int reloadTimeShouldBe = 2;

        Assert.assertEquals(damageShouldBe,realDamage);
        Assert.assertEquals(realReloadTime,reloadTimeShouldBe);
        Assert.assertEquals(dpsShouldBe,realDPS);
        Assert.assertEquals(realMagSize,magSizeShouldBe);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Assault Rifle - Rare",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
    }

}