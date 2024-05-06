package character;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import item.Item;

public class CharacterTest {

@Test	
public void testConstructor(){	
		int baseHealth = 10;
		int health = 10;
		int level = 1;
		double experience = 0;
		int dexterity = 5;
		int strength = 5;
		int intelligence = 5;
		int vitality = 5;
		int healthPots = 2;
		int armorClass = 3;
		Item equippedWeapon = null;
		Item equippedEquipment = null;
		Type classType = Type.MAGE;
		int gold = 0;

		Character character = new Character(baseHealth, health, level, experience, dexterity, strength, intelligence, vitality, 
										healthPots, armorClass, equippedWeapon, equippedEquipment, classType, gold);


    	assertEquals(baseHealth, character.getBaseHealth());
    	assertEquals(health, character.getHealth());
    	assertEquals(strength, character.getStrength());
    	assertEquals(vitality, character.getVitality());
    	assertEquals(dexterity, character.getDexterity());
    	assertEquals(intelligence, character.getIntelligence());
    	assertEquals(armorClass, character.getArmorClass());
    	assertEquals(level, character.getLevel());
    	assertEquals(experience, character.getExperience());
    	assertEquals(healthPots, character.getHealthPots());
    	assertEquals(equippedWeapon, character.getEquippedWeapon());
    	assertEquals(equippedEquipment, character.getEquippedEquipment());
    	assertEquals(classType, character.getClassType());
    	assertEquals(gold, character.getGold());

	}

@Test
public void isDeadTest() {
	Character character = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	assertTrue(character.isDeadPlayer(character));
	
}

@Test
public void levelUpTest() {
	Character mage = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	Character warrior = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.WARRIOR, 0);
	Character ranger = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.RANGER, 0);

	int s = 1;
	int i = 1;
	int d = 1;
	int v = 1;
	
	mage.setBaseStrength(s);
	mage.setBaseIntelligence(i);
	mage.setBaseDexterity(d);
	mage.setBaseVitality(v);
	
	warrior.setBaseStrength(s);
	warrior.setBaseIntelligence(i);
	warrior.setBaseDexterity(d);
	warrior.setBaseVitality(v);
	
	ranger.setBaseStrength(s);
	ranger.setBaseIntelligence(i);
	ranger.setBaseDexterity(d);
	ranger.setBaseVitality(v);
	
	mage.levelUp();
	warrior.levelUp();
	ranger.levelUp();
	
	assertEquals(mage.getBaseStrength(), s+2);
	assertEquals(mage.getBaseIntelligence(), i+2);
	assertEquals(mage.getBaseDexterity(), d+2);
	assertEquals(mage.getBaseVitality(), v+2);
	
	assertEquals(warrior.getBaseStrength(), s+2);
	assertEquals(warrior.getBaseIntelligence(), i+2);
	assertEquals(warrior.getBaseDexterity(), d+2);
	assertEquals(warrior.getBaseVitality(), v+2);
	
	assertEquals(ranger.getBaseStrength(), s+2);
	assertEquals(ranger.getBaseIntelligence(), i+2);
	assertEquals(ranger.getBaseDexterity(), d+2);
	assertEquals(ranger.getBaseVitality(), v+2);
		
}

@Test
public void usePotionTest() {
	Character m = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	m.setBaseHealth(0);
	
	m.usePotion();
	
	assertEquals(m.health, 4);
}




}