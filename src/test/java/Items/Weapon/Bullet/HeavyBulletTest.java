package Items.Weapon.Bullet;

import Items.Item;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeavyBulletTest {

    private HeavyBullet heavyBullet;

    @Before
    public void setUp(){
        heavyBullet = new HeavyBullet();
    }

    @Test
    public void should_getSetAttributes_forMediumBullet(){
        int stackAmountAtCreation = heavyBullet.getCurrentStackAmount();
        int maxStackAmount = heavyBullet.getMaxStackAmount();
        String heavyBulletItemName = heavyBullet.getItemName();
        Material heavyBulletMaterial = heavyBullet.getItemMaterial();
        Item.RARITY_LEVEL heavyBulletRarity = heavyBullet.getItemRarity();
        boolean isStackable = heavyBullet.isStackable();

        String heavyBulletAsString = "Heavy Bullets";
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