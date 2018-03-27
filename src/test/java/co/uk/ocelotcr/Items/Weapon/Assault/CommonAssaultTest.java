package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Item;
import co.uk.ocelotcr.Items.Weapon.Assault.CommonAssault;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommonAssaultTest {

    private CommonAssault commonAssault;

    @Before
    public void setUp(){
        commonAssault = new CommonAssault();
    }

    @Test
    public void should_SetAttributesOfCommonAssault_ThenReturnThem(){
        Material realMaterial = commonAssault.getItemMaterial();
        String realItemName = commonAssault.getItemName();
        Item.RARITY_LEVEL realRarityLevel = commonAssault.getItemRarity();
        Color realColor = commonAssault.getRarityAsColor();
        int realDamage = commonAssault.getDamage();
        int realDPS = commonAssault.getDamagePerSecond();
        int realMagSize = commonAssault.getMagazineSize();
        int realReloadTime = commonAssault.getReloadTime();


        Material materialShouldBe = Material.BOW;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.COMMON;
        Color colorShouldBe = Color.GRAY;
        int damageShouldBe = 30;
        int dpsShouldBe = 30;
        int magSizeShouldBe = 30;
        int reloadTimeShouldBe = 2;

        Assert.assertEquals(damageShouldBe,realDamage);
        Assert.assertEquals(realReloadTime,reloadTimeShouldBe);
        Assert.assertEquals(dpsShouldBe,realDPS);
        Assert.assertEquals(realMagSize,magSizeShouldBe);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Assault Rifle - Common",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
    }

}