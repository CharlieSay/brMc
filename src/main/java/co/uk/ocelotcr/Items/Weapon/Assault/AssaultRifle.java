package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Weapon.Weapon;
import org.bukkit.Material;

public abstract class AssaultRifle extends Weapon {

    public AssaultRifle(){
        super.setMaterialObject(Material.BOW);
        super.setMagazineSize(30);
    }

}
