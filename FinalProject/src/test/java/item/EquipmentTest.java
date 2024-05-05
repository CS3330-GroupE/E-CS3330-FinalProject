package item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EquipmentTest {
    
    @Test
    public void testConstructor() {

        String name = "Armor";
        String description = "Armor Set";
        int strength = 0;
        int vitality = 5;
        int dexterity = 0;
        int intelligence = 0;
        int armorClass = 5;

        Equipment equipment = new Equipment(name, description, strength, vitality, dexterity, intelligence, armorClass);

        assertEquals(name, equipment.getName());
        assertEquals(description, equipment.getDescription());
        assertEquals(strength, equipment.getStrength());
        assertEquals(vitality, equipment.getVitality());
        assertEquals(dexterity, equipment.getDexterity());
        assertEquals(intelligence, equipment.getIntelligence());
        assertEquals(armorClass, equipment.getArmorClass());
    }
}
