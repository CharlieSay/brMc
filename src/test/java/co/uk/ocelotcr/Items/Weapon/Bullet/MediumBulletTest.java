package co.uk.ocelotcr.Items.Weapon.Bullet;

import co.uk.ocelotcr.Items.Item;
import co.uk.ocelotcr.Items.Weapon.Bullet.MediumBullet;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MediumBulletTest {


    private MediumBullet mediumBullet;

    @Before
    public void setUp(){
        mediumBullet = new MediumBullet();
    }

    @Test
    public void should_getSetAttributes_forLightBullet(){
        int stackAmountAtCreation = mediumBullet.getCurrentStackAmount();
        int maxStackAmount = mediumBullet.getMaxStackAmount();
        String heavyBulletItemName = mediumBullet.getItemName();
        Material heavyBulletMaterial = mediumBullet.getItemMaterial();
        Item.RARITY_LEVEL heavyBulletRarity = mediumBullet.getItemRarity();
        boolean isStackable = mediumBullet.isStackable();

        String heavyBulletAsString = "Medium Bullets";
        Material bulletMaterial = Material.ARROW;
        Item.RARITY_LEVEL rarityLevel = Item.RARITY_LEVEL.COMMON;

        Assert.assertEquals(0,stackAmountAtCreation);
        Assert.assertEquals(999,maxStackAmount);
        Assert.assertEquals(heavyBulletAsString,heavyBulletItemName);
        Assert.assertEquals(bulletMaterial,heavyBulletMaterial);
        Assert.assertEquals(rarityLevel,heavyBulletRarity);
        Assert.assertTrue(isStackable);
    }

}