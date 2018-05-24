package co.uk.ocelotcr.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class CleanTest implements Command {

    @Override
    public void PerformCommand(Player player) {
        Location location = player.getLocation();
        location.getWorld().playEffect(location,Effect.ANVIL_BREAK,100);
        player.setTotalExperience(1000);
        Bukkit.getLogger().log(Level.INFO, "Clean Test execute");
    }

}
