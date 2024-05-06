package test;

import character.Type;
import game.HelperFunctions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

//import monster.Monster;
import character.Character;
import item.Inventory;
import monster.Monster;

import org.junit.jupiter.api.Test;

public class HelperFunctionTest {

	@Test
	public void buyRandomItemTest() {
		HelperFunctions v = new HelperFunctions();
		Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 50);
		Inventory i = new Inventory();
		
		
		v.buyRandomItem(c, i);
		
		assertEquals(c.getGold(), 0);
	}
	
	@Test
	public void buyHealthPotionTest() {
		HelperFunctions v = new HelperFunctions();
		Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 15);
		
		v.buyHealthPotion(c);
		
		assertEquals(c.getHealthPots(),1);
		assertEquals(c.getGold(),0);
		
	}
	
	@Test
	public void buyFullHealth() {
		HelperFunctions v = new HelperFunctions();
		Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 20);
		
		v.buyFullHealth(c);
		assertEquals(c.getGold(),0);
		
	}
	
	
	@Test 
	public void combatTest() {
		HelperFunctions h = new HelperFunctions();
		Character c = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
		Monster m = new Monster("Goblin", 0, 8, 5, 3, 3, "wild");
		int cHealth = c.getHealth();
		
		h.Combat(m, c);
		
		assertTrue(c.getHealth() == cHealth || c.getHealth() < cHealth);
	}
	
	@Test
	public void randomizerTest() {
		HelperFunctions v = new HelperFunctions();
		
		int c = v.randomizerRun();
		
		assertTrue(c >= 1 || c <= 4);
	}
}
