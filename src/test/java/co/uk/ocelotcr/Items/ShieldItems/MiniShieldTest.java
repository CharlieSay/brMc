package co.uk.ocelotcr.Items.ShieldItems;

import co.uk.ocelotcr.Items.ShieldItems.MiniShield;
import co.uk.ocelotcr.Items.ShieldItems.Shield;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MiniShieldTest {

    private static Shield miniShield;

    @BeforeClass
    public static void setUpObject(){
        miniShield = new MiniShield();
    }

    @Test
    public void should_Return15_WhenValueOfShieldIsCalled(){
        int miniShieldValueShouldBe = 15;
        int resultOfMiniShieldValue = miniShield.getShieldValue();

        Assert.assertEquals(miniShieldValueShouldBe,resultOfMiniShieldValue);
    }

    @Test
    public void should_Return2_WhenTheSpeedIsCalled(){
        int miniShieldSpeedShouldBe = 2;
        int resultOfMiniShieldSpeed = miniShield.getConsumeSpeed();

        Assert.assertEquals(miniShieldSpeedShouldBe,resultOfMiniShieldSpeed);
    }

    @Test
    public void should_ReturnUnCommon_WhenTheRarityIsCalled(){
        String hugeShieldLegendaryShouldBe = String.valueOf(miniShield.getItemRarity());
        String shouldBeUncommon = "UNCOMMON";

        Assert.assertEquals(hugeShieldLegendaryShouldBe,shouldBeUncommon);
    }

    @Test
    public void should_AllowStack_MaxOf10(){
        int shouldBeStackAmountThree = 10;

        Assert.assertEquals(shouldBeStackAmountThree,miniShield.getMaxStackAmount());
        Assert.assertTrue(miniShield.isStackable());
    }

}