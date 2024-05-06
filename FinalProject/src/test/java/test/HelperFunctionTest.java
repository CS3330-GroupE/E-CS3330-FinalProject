package test;

import character.Type;
import game.HelperFunctions;

import static org.junit.jupiter.api.Assertions.*;

//import monster.Monster;
import character.Character;
import item.Inventory;

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
	
}
