package item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class RandomEquipmentGeneratorTest {

    @Test
    public void testGenerateRandomEquipment() {

        Item randomItem = RandomEquipmentGenerator.generateRandomEquipment();
        
        //tests if instance of weapon or equipment
        assertNotNull(randomItem);
        assertTrue(randomItem instanceof Weapon || randomItem instanceof Equipment);
        assertNotNull(randomItem.getName());
        assertNotNull(randomItem.getDescription());
        assertTrue(randomItem.getStrength() >= 0);
        assertTrue(randomItem.getVitality() >= 0);
        assertTrue(randomItem.getDexterity() >= 0);
        assertTrue(randomItem.getIntelligence() >= 0);
        assertTrue(randomItem.getArmorClass() >= 0);
    }
}