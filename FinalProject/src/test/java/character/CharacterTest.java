package character;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import monster.Monster;

import org.junit.jupiter.api.Test;

import item.Item;
import item.ItemFactory;

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
    	
    	
    	Character c = new Character(character);
    	
    	assertEquals(baseHealth, c.getBaseHealth());
    	assertEquals(health, c.getHealth());
    	assertEquals(strength, c.getStrength());
    	assertEquals(vitality, c.getVitality());
    	assertEquals(dexterity, c.getDexterity());
    	assertEquals(intelligence, c.getIntelligence());
    	assertEquals(armorClass, c.getArmorClass());
    	assertEquals(level, c.getLevel());
    	assertEquals(experience, c.getExperience());
    	assertEquals(healthPots, c.getHealthPots());
    	assertEquals(equippedWeapon, c.getEquippedWeapon());
    	assertEquals(equippedEquipment, c.getEquippedEquipment());
    	assertEquals(classType, c.getClassType());
    	assertEquals(gold, c.getGold());

	}

@Test
public void isDeadTest() {
	Character character = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	assertTrue(character.isDeadPlayer(character));
	
	Character c = new Character(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, null, null, Type.MAGE, 0);
	assertFalse(c.isDeadPlayer(c));
	
}

@Test
public void levelUpTest() {
	Character mage = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	Character warrior = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.WARRIOR, 0);
	Character ranger = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.RANGER, 0);

	int s = 0;
	int i = 0;
	int d = 0;
	int v = 0;
	
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
	
	assertEquals(mage.getBaseStrength(), 0);
	assertEquals(mage.getBaseIntelligence(), 2);
	assertEquals(mage.getBaseDexterity(), 0);
	assertEquals(mage.getBaseVitality(), 2);
	
	assertEquals(warrior.getBaseStrength(), 2);
	assertEquals(warrior.getBaseIntelligence(), 0);
	assertEquals(warrior.getBaseDexterity(), 0);
	assertEquals(warrior.getBaseVitality(), 2);
	
	assertEquals(ranger.getBaseStrength(), 0);
	assertEquals(ranger.getBaseIntelligence(), 0);
	assertEquals(ranger.getBaseDexterity(), 2);
	assertEquals(ranger.getBaseVitality(), 2);
		
}

@Test
public void usePotionTest() {
	Character m = new Character(0, 1, 1, 1, 1, 1, 1, 1, 1, 1, null, null, Type.MAGE, 0);
	Character w = new Character(0, 1, 1, 1, 1, 1, 1, 1, 1, 1, null, null, Type.WARRIOR, 0);
	Character r = new Character(0, 1, 1, 1, 1, 1, 1, 1, 1, 1, null, null, Type.RANGER, 0);
	
	
	m.setHealthPots(1);
	m.usePotion();
	

	w.setHealthPots(1);
	w.usePotion();

	r.setHealthPots(1);
	r.usePotion();
	
	
	assertEquals(m.getHealthPots(), 0);
	assertEquals(m.getHealth(), 2);

	
}

@Test
public void setBaseStatsTest() {
	Character m = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	m.setBaseStats(m);
	assertEquals(m.getBaseArmorClass(),7);
	assertEquals(m.getBaseHealthPots(),3);
	assertEquals(m.getBaseVitality(),7);
	assertEquals(m.getBaseIntelligence(),7);
	assertEquals(m.getBaseStrength(),7);
	assertEquals(m.getBaseDexterity(),7);
	assertEquals(m.getBaseHealth(),10);
	
	m.setClassType(Type.RANGER);
	m.setBaseStats(m);	
	assertEquals(m.getBaseArmorClass(),6);
	assertEquals(m.getBaseHealthPots(),3);
	assertEquals(m.getBaseVitality(),6);
	assertEquals(m.getBaseIntelligence(),6);
	assertEquals(m.getBaseStrength(),6);
	assertEquals(m.getBaseDexterity(),6);
	assertEquals(m.getBaseHealth(),12);
	
	m.setClassType(Type.WARRIOR);
	m.setBaseStats(m);
	assertEquals(m.getBaseArmorClass(),5);
	assertEquals(m.getBaseHealthPots(),3);
	assertEquals(m.getBaseVitality(),5);
	assertEquals(m.getBaseIntelligence(),5);
	assertEquals(m.getBaseStrength(),5);
	assertEquals(m.getBaseDexterity(),5);
	assertEquals(m.getBaseHealth(),15);
}

@Test
public void attackTest() {
	Monster m = new Monster("Orc", 1, 20, 6, 8, 2, "wild");
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	int health = m.getHealth();
	
	c.attack(c, m);
	
	assertTrue(health == m.getHealth() || health >= m.getHealth());
	
}

@Test
public void getDamageTest() {
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	c.setIntelligence(1);
	assertEquals(c.getPlayerDamage(c),1);
	
	c.setDexterity(1);
	c.setClassType(Type.RANGER);
	assertEquals(c.getPlayerDamage(c),1);
	
	c.setStrength(1);
	c.setClassType(Type.WARRIOR);
	assertEquals(c.getPlayerDamage(c),1);
	
}

@Test
public void takeDamageTest() {
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	c.takeDamage(1);
	assertEquals(c.getHealth(), 0);
}



@Test
public void printStatsTest() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	c.checkStats();
	
   String expectedOutput  = "Current Player Info:\n\nLevel: 0\nClass: MAGE\nHealth: 0\nXP: 0.0/100\nVitality: 0\nDexterity: 0\nStrength: 0\nIntelligence: 0\n";
   // Do the actual assertion.
   assertEquals(expectedOutput, outContent.toString());
}

@Test
public void printHealthTest() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
	
	c.checkHealth();
	
   String expectedOutput  = "Current health is: 0";
   // Do the actual assertion.
   assertEquals(expectedOutput, outContent.toString());
}

@Test
public void printCheckEquipmentTest() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.", 2, 2, 7, 4, 2), ItemFactory.createItem("Equipment", "Magic Robes", "Basic magical robes that give emit magical energy and can be equipped.",
			1, 3, 7, 5, 2), Type.MAGE, 0);
	
	c.checkEquipment();
	
   String expectedOutput  = "Weapon: Enchanted Sceptre\nEquipment: Magic Robes\nArmor Class: 0\nCurrent Number of Health Pots: 0\nCurrent Gold: 0\n";
   // Do the actual assertion.
   assertEquals(expectedOutput, outContent.toString());
}

@Test
public void resetStatsTest() {
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.", 2, 2, 7, 4, 2), 
			ItemFactory.createItem("Equipment", "Magic Robes", "Basic magical robes that give emit magical energy and can be equipped.", 1, 3, 7, 5, 2), Type.MAGE, 0);
	
	c.setBaseDexterity(1);
	c.setBaseIntelligence(1);
	c.setBaseVitality(1);
	c.setBaseStrength(1);
	c.setBaseArmorClass(1);
	
	c.resetStats(c);

	assertEquals(c.getVitality(),1);
	assertEquals(c.getIntelligence(),1);
	assertEquals(c.getStrength(),1);
	assertEquals(c.getDexterity(),1);
	assertEquals(c.getArmorClass(),1);
}

@Test
public void updateStatsWithItemTest() {
	Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.", 2, 2, 7, 4, 2), 
			ItemFactory.createItem("Equipment", "Magic Robes", "Basic magical robes that give emit magical energy and can be equipped.", 1, 3, 7, 5, 2), Type.MAGE, 0);
			//name, description, strength, vitality, dexterity, intelligence, armorClass
	
	c.updateStatsWithItem(c.getEquippedEquipment(),c);
	c.updateStatsWithItem(c.getEquippedWeapon(), c);
	
	assertEquals(c.getIntelligence(), 9);
}



}