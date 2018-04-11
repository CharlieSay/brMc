package co.uk.ocelotcr.Controller;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.*;

public class ScoreboardController{

    private Objective objective;
    private Scoreboard scoreBoard;

    public ScoreboardController(){
        scoreBoard = Bukkit.getScoreboardManager().getNewScoreboard();
        Team playerInformationTeam = scoreBoard.registerNewTeam("Player Info");
        playerInformationTeam.setColor(ChatColor.DARK_RED);
        playerInformationTeam.addEntry(ChatColor.GREEN + " Health");
        playerInformationTeam.addEntry(ChatColor.AQUA + " Shield");
        objective = scoreBoard.registerNewObjective("Player Info","dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    public Objective getObjective() {
        return objective;
    }

    public Scoreboard getScoreBoard() {
        return scoreBoard;
    }


}
