package co.uk.ocelotcr.Items.ShieldItems;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LargeShieldTest {

    static Shield largeShield;

    @BeforeClass
    public static void setUpObject(){
        largeShield = new LargeShield();
    }

    @Test
    public void should_Return50_WhenValueOfShieldIsCalled(){
        int largeShieldValueShouldBe = 50;
        int resultOflargeShieldValue = largeShield.getShieldValue();

        Assert.assertEquals(largeShieldValueShouldBe,resultOflargeShieldValue);
    }

    @Test
    public void should_Return5_WhenTheSpeedIsCalled(){
        int largeShieldSpeedShouldBe = 5;
        int resultOflargeShieldSpeed = largeShield.getConsumeSpeed();

        Assert.assertEquals(largeShieldSpeedShouldBe,resultOflargeShieldSpeed);
    }

    @Test
    public void should_ReturnRare_WhenTheRarityIsCalled(){
        String largeShieldLegendaryShouldBe = String.valueOf(largeShield.getItemRarity());
        String shouldBeRare = "RARE";

        Assert.assertEquals(largeShieldLegendaryShouldBe,shouldBeRare);
    }

    @Test
    public void should_AllowStack_MaxOf3(){
       int shouldBeStackAmountThree = 3;

       Assert.assertEquals(shouldBeStackAmountThree,largeShield.getMaxStackAmount());
       Assert.assertTrue(largeShield.isStackable());
    }
}