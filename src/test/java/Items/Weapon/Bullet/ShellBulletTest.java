package Items.Weapon.Bullet;

import Items.Item;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShellBulletTest {


    private ShellBullet shellBullet;

    @Before
    public void setUp(){
        shellBullet = new ShellBullet();
    }

    @Test
    public void should_getSetAttributes_forShells(){
        int stackAmountAtCreation = shellBullet.getCurrentStackAmount();
        int maxStackAmount = shellBullet.getMaxStackAmount();
        String heavyBulletItemName = shellBullet.getItemName();
        Material heavyBulletMaterial = shellBullet.getItemMaterial();
        Item.RARITY_LEVEL heavyBulletRarity = shellBullet.getItemRarity();
        boolean isStackable = shellBullet.isStackable();

        String heavyBulletAsString = "Shells";
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