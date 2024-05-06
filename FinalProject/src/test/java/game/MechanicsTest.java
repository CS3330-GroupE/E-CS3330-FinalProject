package game;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import character.Character;
import character.Type;

class MechanicsTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void createCharacterTest() {
		Mechanics m = new Mechanics();
		
		m.setPlayerCharacter(m.createCharacter(1));
		assertEquals(m.getPlayerCharacter().getClassType(), Type.MAGE);
		
		m.setPlayerCharacter(m.createCharacter(2));
		assertEquals(m.getPlayerCharacter().getClassType(), Type.RANGER);
		
		m.setPlayerCharacter(m.createCharacter(3));
		assertEquals(m.getPlayerCharacter().getClassType(), Type.WARRIOR);
	}
	
	
	@Test
	public void mainMenuTest() throws Exception {
		Mechanics m = new Mechanics();
		Scanner c = new Scanner(System.in);
		Character character = new Character(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.MAGE, 0);
		
		m.setPlayerCharacter(character);
		
		//Begin Battle / Visit Bazaar / View Inventory
		m.mainMenuHandler();
		assertFalse(m.isInMainMenu());
		
		c.close();
		}
}
