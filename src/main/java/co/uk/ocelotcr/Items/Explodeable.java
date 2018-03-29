package co.uk.ocelotcr.Items;

import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Sound;

public interface Explodeable {

    Sound explodeSound();
    Effect explodeEffect();
    FireworkEffect explodeFireWorkEffect();

}
