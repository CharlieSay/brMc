package Items.Weapon.Bullet;

import Items.Item;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RocketBulletTest {

    private RocketBullet rocketBullet;

    @Before
    public void setUp(){
        rocketBullet = new RocketBullet();
    }

    @Test
    public void should_getSetAttributes_forLightBullet(){
        int stackAmountAtCreation = rocketBullet.getCurrentStackAmount();
        int maxStackAmount = rocketBullet.getMaxStackAmount();
        String heavyBulletItemName = rocketBullet.getItemName();
        Material heavyBulletMaterial = rocketBullet.getItemMaterial();
        Item.RARITY_LEVEL heavyBulletRarity = rocketBullet.getItemRarity();
        boolean isStackable = rocketBullet.isStackable();

        String heavyBulletAsString = "Rockets";
        Material bulletMaterial = Material.BLAZE_ROD;
        Item.RARITY_LEVEL rarityLevel = Item.RARITY_LEVEL.RARE;

        Assert.assertEquals(0,stackAmountAtCreation);
        Assert.assertEquals(250,maxStackAmount);
        Assert.assertEquals(heavyBulletAsString,heavyBulletItemName);
        Assert.assertEquals(bulletMaterial,heavyBulletMaterial);
        Assert.assertEquals(rarityLevel,heavyBulletRarity);
        Assert.assertTrue(isStackable);
    }

    @Test
    public void should_Return_Explodeable_Attributes(){
        Effect rocketEffect = rocketBullet.explodeEffect();
        Sound rocketSoundEffect = rocketBullet.explodeSound();
        FireworkEffect rocketFireworkEffect = rocketBullet.explodeFireWorkEffect();

        Effect smokeEffect = Effect.SMOKE;
        Sound soundExplosion = Sound.ENTITY_GENERIC_EXPLODE;

        Assert.assertEquals(smokeEffect,rocketEffect);
        Assert.assertEquals(soundExplosion,rocketSoundEffect);
        Assert.assertNotNull(rocketFireworkEffect);
    }
}