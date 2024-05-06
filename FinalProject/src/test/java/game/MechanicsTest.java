package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	
}
