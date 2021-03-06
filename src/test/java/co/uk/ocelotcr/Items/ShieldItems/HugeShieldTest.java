package co.uk.ocelotcr.Items.ShieldItems;

import co.uk.ocelotcr.Items.ShieldItems.HugeShield;
import co.uk.ocelotcr.Items.ShieldItems.Shield;
import org.bukkit.Color;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HugeShieldTest {

    private static Shield hugeShield;

    @BeforeClass
    public static void setUpObject(){
        hugeShield = new HugeShield();
    }

    @Test
    public void should_Return100_WhenValueOfShieldIsCalled(){
        int hugeShieldValueShouldBe = 100;
        int resultOfHugeShieldValue = hugeShield.getShieldValue();

        Assert.assertEquals(hugeShieldValueShouldBe,resultOfHugeShieldValue);
    }

    @Test
    public void should_Return15_WhenTheSpeedIsCalled(){
        int hugeShieldSpeedShouldBe = 15;
        int resultOfHugeShieldSpeed = hugeShield.getConsumeSpeed();

        Assert.assertEquals(hugeShieldSpeedShouldBe,resultOfHugeShieldSpeed);
    }

    @Test
    public void should_ReturnLegendary_WhenTheRarityIsCalled(){
        String hugeShieldLegendaryShouldBe = String.valueOf(hugeShield.getItemRarity());
        String shouldBeLegendary = "LEGENDARY";

        Assert.assertEquals(hugeShieldLegendaryShouldBe,shouldBeLegendary);
    }

    @Test
    public void should_NotAllowStack_MaxOf1(){
        int shouldBeStackAmountThree = 1;

        Assert.assertEquals(shouldBeStackAmountThree,hugeShield.getMaxStackAmount());
        Assert.assertFalse(hugeShield.isStackable());
    }

    @Test
    public void should_ReturnColourRarity_Orange(){
        Color orange = Color.ORANGE;

        Assert.assertEquals(orange,hugeShield.getRarityAsColor());
    }
}