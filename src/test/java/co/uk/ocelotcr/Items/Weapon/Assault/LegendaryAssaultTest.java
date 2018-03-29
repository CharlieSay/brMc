package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LegendaryAssaultTest {

    LegendaryAssault legendaryAssault;

    @Before
    public void setUp(){
        legendaryAssault = new LegendaryAssault();
    }

    @Test
    public void should_SetAttributesOfCommonAssault_ThenReturnThem(){
        Material realMaterial = legendaryAssault.getItemMaterial();
        String realItemName = legendaryAssault.getItemName();
        Item.RARITY_LEVEL realRarityLevel = legendaryAssault.getItemRarity();
        Color realColor = legendaryAssault.getRarityAsColor();
        int realDamage = legendaryAssault.getDamage();
        int realDPS = legendaryAssault.getDamagePerSecond();
        int realMagSize = legendaryAssault.getMagazineSize();
        int realReloadTime = legendaryAssault.getReloadTime();


        Material materialShouldBe = Material.BOW;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.LEGENDARY;
        Color colorShouldBe = Color.ORANGE;
        int damageShouldBe = 38;
        int dpsShouldBe = 228;
        int magSizeShouldBe = 30;
        int reloadTimeShouldBe = 1;

        Assert.assertEquals(damageShouldBe,realDamage);
        Assert.assertEquals(realReloadTime,reloadTimeShouldBe);
        Assert.assertEquals(dpsShouldBe,realDPS);
        Assert.assertEquals(realMagSize,magSizeShouldBe);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Assault Rifle - Legendary",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
    }

}