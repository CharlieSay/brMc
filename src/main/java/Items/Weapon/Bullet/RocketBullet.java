package Items.Weapon.Bullet;

import Items.Explodeable;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.Sound;

public class RocketBullet extends Bullet implements Explodeable{

    public RocketBullet() {
        currentStackAmount = 0;
        super.materialObject = Material.ARROW;
        super.itemName = "Rockets";
        super.itemRarity = RARITY_LEVEL.COMMON;
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return 250;
    }

    @Override
    public Sound explodeSound() {
        return Sound.ENTITY_GENERIC_EXPLODE;
    }

    @Override
    public Effect explodeEffect() {
        return Effect.SMOKE;
    }

    @Override
    public FireworkEffect explodeFireWorkEffect() {
        return FireworkEffect.builder().build();
    }
}
