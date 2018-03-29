package co.uk.ocelotcr.Items;

import co.uk.ocelotcr.Items.HealthItems.Bandage;
import co.uk.ocelotcr.Items.HealthItems.MedicalKit;
import co.uk.ocelotcr.Items.ShieldItems.LargeShield;
import co.uk.ocelotcr.Items.Weapon.Assault.CommonAssault;
import co.uk.ocelotcr.Items.Weapon.Assault.EpicAssault;
import co.uk.ocelotcr.Items.Weapon.Assault.LegendaryAssault;
import org.bukkit.ChatColor;
import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    Item item;

    @Test
    public void should_Return_GreyChatColour_ForCommonItem(){
        item = new CommonAssault();
        ChatColor greyChatColour = ChatColor.GRAY;

        Assert.assertEquals(greyChatColour,item.getRarityForChatColor());
    }

    @Test
    public void should_Return_GreenChatColour_ForUncommonItem(){
        item = new MedicalKit();
        ChatColor greenChatColour = ChatColor.GREEN;

        Assert.assertEquals(greenChatColour,item.getRarityForChatColor());
    }

    @Test
    public void should_Return_BlueChatColour_ForRareItem(){
        item = new LargeShield();
        ChatColor blueChatColour = ChatColor.BLUE;

        Assert.assertEquals(blueChatColour,item.getRarityForChatColor());
    }

    @Test
    public void should_Return_PurpleChatColour_ForEpicItem(){
        item = new EpicAssault();
        ChatColor lightPurpleChatColour = ChatColor.LIGHT_PURPLE;

        Assert.assertEquals(lightPurpleChatColour,item.getRarityForChatColor());
    }

    @Test
    public void should_Return_PurpleChatColour_ForLegendaryItem(){
        item = new LegendaryAssault();
        ChatColor goldChatColour = ChatColor.GOLD;

        Assert.assertEquals(goldChatColour,item.getRarityForChatColor());
    }

    @Test
    public void should_ResetColor_IfNothingPassed(){
        item = new Bandage();
        item.setItemRarity(null);
        ChatColor resetColour = ChatColor.RESET;

        Assert.assertEquals(resetColour,item.getRarityForChatColor());
    }


}