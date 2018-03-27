package co.uk.ocelotcr.Items.Weapon.Bullet;

import co.uk.ocelotcr.Items.Item;
import co.uk.ocelotcr.Items.Weapon.Bullet.LightBullet;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LightBulletTest {

    private LightBullet lightBullet;

    @Before
    public void setUp(){
        lightBullet = new LightBullet();
    }

    @Test
    public void should_getSetAttributes_forLightBullet(){
        int stackAmountAtCreation = lightBullet.getCurrentStackAmount();
        int maxStackAmount = lightBullet.getMaxStackAmount();
        String heavyBulletItemName = lightBullet.getItemName();
        Material heavyBulletMaterial = lightBullet.getItemMaterial();
        Item.RARITY_LEVEL heavyBulletRarity = lightBullet.getItemRarity();
        boolean isStackable = lightBullet.isStackable();

        String heavyBulletAsString = "Light Bullets";
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