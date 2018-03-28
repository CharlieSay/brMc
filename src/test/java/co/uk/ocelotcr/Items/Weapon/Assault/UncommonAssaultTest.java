package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UncommonAssaultTest {

    UncommonAssault uncommonAssault;

    @Before
    public void setUp(){
        uncommonAssault = new UncommonAssault();
    }

    @Test
    public void should_SetAttributesOfCommonAssault_ThenReturnThem(){
        Material realMaterial = uncommonAssault.getItemMaterial();
        String realItemName = uncommonAssault.getItemName();
        Item.RARITY_LEVEL realRarityLevel = uncommonAssault.getItemRarity();
        Color realColor = uncommonAssault.getRarityAsColor();
        int realDamage = uncommonAssault.getDamage();
        int realDPS = uncommonAssault.getDamagePerSecond();
        int realMagSize = uncommonAssault.getMagazineSize();
        int realReloadTime = uncommonAssault.getReloadTime();


        Material materialShouldBe = Material.BOW;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.UNCOMMON;
        Color colorShouldBe = Color.GREEN;
        int damageShouldBe = 32;
        int dpsShouldBe = 160;
        int magSizeShouldBe = 30;
        int reloadTimeShouldBe = 2;

        Assert.assertEquals(damageShouldBe,realDamage);
        Assert.assertEquals(realReloadTime,reloadTimeShouldBe);
        Assert.assertEquals(dpsShouldBe,realDPS);
        Assert.assertEquals(realMagSize,magSizeShouldBe);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Assault Rifle - Uncommon",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
    }

}
