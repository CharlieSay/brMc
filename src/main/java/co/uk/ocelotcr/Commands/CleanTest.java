package co.uk.ocelotcr.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class CleanTest {
    public static void PerformCommand(Player p) {
        Location location = p.getLocation();
        location.getWorld().playEffect(location,Effect.ANVIL_BREAK,100);
        p.setTotalExperience(1000);
        Bukkit.getLogger().log(Level.INFO, "Clean Test execute");
    }
}
