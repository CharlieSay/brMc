package co.uk.ocelotcr.Items.Weapon.Bullet;

import co.uk.ocelotcr.Items.Explodeable;
import co.uk.ocelotcr.Items.Item;
import org.bukkit.*;

import java.util.Random;

public class RocketBullet extends Bullet implements Explodeable {

    private final int MAX_STACK_AMOUNT = 250;

    public RocketBullet() {
        super.setCurrentStackAmount(0);
        super.setItemName("Rockets");
        super.setItemRarity(Item.RARITY_LEVEL.RARE);
        super.setMaterialObject(Material.BLAZE_ROD);
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return MAX_STACK_AMOUNT;
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
        Random random = new Random();
        FireworkEffect fireworkEffect = FireworkEffect.builder()
                .flicker(random.nextBoolean())
                .withColor(Color.RED)
                .withFade(Color.ORANGE)
                .with(FireworkEffect.Type.BURST)
                .trail(random.nextBoolean())
                .build();
        return fireworkEffect;
    }
}
