package co.uk.ocelotcr.Commands;

import co.uk.ocelotcr.Listener.FunnyShoot;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class ArrowRain {

    public static void PerformCommand(Player player) {
        FunnyShoot FunnyShoot = new FunnyShoot();
        FunnyShoot.shootemUp(player,5);
        Bukkit.getLogger().log(Level.INFO, "Rain Arrows execute");
    }
}
