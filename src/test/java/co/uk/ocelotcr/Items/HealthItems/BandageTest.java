package co.uk.ocelotcr.Items.HealthItems;

import co.uk.ocelotcr.Items.HealthItems.Bandage;
import co.uk.ocelotcr.Items.Item;
import org.bukkit.Color;
import org.bukkit.Material;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BandageTest {

    private Bandage bandage;

    @Before
    public void setUpClass(){
        bandage = new Bandage();
    }

    @Test
    public void should_SetAttributesOfBandage_ThenReturnThem(){
        int realConsumeSpeed = bandage.getConsumeSpeed();
        int realMaxStackAmount = bandage.getMaxStackAmount();
        int realHealthValue = bandage.getHealthValue();
        Material realMaterial = bandage.getItemMaterial();
        String realItemName = bandage.getItemName();
        Item.RARITY_LEVEL realRarityLevel = bandage.getItemRarity();
        Color realColor = bandage.getRarityAsColor();
        boolean isStackable = bandage.isStackable();

        int consumeSpeedShouldBe = 2;
        int maxStackAmountShouldBe = 10;
        int healthValueShouldBe = 15;
        Material materialShouldBe = Material.PAPER;
        Item.RARITY_LEVEL rarityShouldBe = Item.RARITY_LEVEL.COMMON;
        Color colorShouldBe = Color.GRAY;

        Assert.assertEquals(consumeSpeedShouldBe,realConsumeSpeed);
        Assert.assertEquals(maxStackAmountShouldBe,realMaxStackAmount);
        Assert.assertEquals(healthValueShouldBe,realHealthValue);
        Assert.assertEquals(materialShouldBe,realMaterial);
        Assert.assertEquals("Bandage",realItemName);
        Assert.assertEquals(rarityShouldBe,realRarityLevel);
        Assert.assertEquals(colorShouldBe,realColor);
        Assert.assertTrue(isStackable);
    }

}