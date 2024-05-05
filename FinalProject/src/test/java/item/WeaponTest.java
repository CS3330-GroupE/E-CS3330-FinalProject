package item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WeaponTest {
    
    @Test
    public void testConstructor() {
      
        String name = "Sword";
        String description = "A long sword";
        int strength = 5;
        int vitality = 2;
        int dexterity = 0;
        int intelligence = 0;
        int armorClass = 0;
               
        Weapon weapon = new Weapon(name, description, strength, vitality, dexterity, intelligence, armorClass);
        
        assertEquals(name, weapon.getName());
        assertEquals(description, weapon.getDescription());
        assertEquals(strength, weapon.getStrength());
        assertEquals(vitality, weapon.getVitality());
        assertEquals(dexterity, weapon.getDexterity());
        assertEquals(intelligence, weapon.getIntelligence());
        assertEquals(armorClass, weapon.getArmorClass());
    }
}

