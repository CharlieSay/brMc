package co.uk.ocelotcr.Items.HealthItems;

import co.uk.ocelotcr.Items.HealthItems.MedicalKit;
import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedicalKitTest {


    private MedicalKit medicalKit;

    @Before
    public void setUpClass(){
        medicalKit = new MedicalKit();
    }

    @Test
    public void should_SetAttributesOfMedKit_ThenReturnThem(){
        int realConsumeSpeed = medicalKit.getConsumeSpeed();
        int realMaxStackAmount = medicalKit.getMaxStackAmount();
        int realHealthValue = medicalKit.getHealthValue();
        Material realMaterial = medicalKit.getItemMaterial();
        String realItemName = medicalKit.getItemName();
        Item.RARITY_LEVEL realRarityLevel = medicalKit.getItemRarity();
        Color realColor = medicalKit.getRarityAsColor();
        boolean isStackable = medicalKit.isStackable();

        int consumeSpeedShouldBe = 10;
        int maxStackAmountShouldBe = 3;
        int healthValueShouldBe = 100;
        Material materialShouldBe = Material.SLIME_BLOCK;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.UNCOMMON;
        Color colorShouldBe = Color.GREEN;

        Assert.assertEquals(consumeSpeedShouldBe,realConsumeSpeed);
        Assert.assertEquals(maxStackAmountShouldBe,realMaxStackAmount);
        Assert.assertEquals(healthValueShouldBe,realHealthValue);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Med Kit",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
        Assert.assertTrue(isStackable);
    }


}