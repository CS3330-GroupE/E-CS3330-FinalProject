package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.Mechanics;
import character.Character;
import character.Mage;
import character.Ranger;
import character.Warrior;

class MechanicsTest {
	
	
	
	/**
	 * testing valid attack command by giving different variations of possible
	 * user inputs that would be valid, and ensuring the integer returned is 2.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testValidAttackCommand() {
		Mechanics game = new Mechanics();
		
		String testInput = "aTtAcK";
		int command = game.determineCommand(testInput);
		assertEquals(2, command);
		
		testInput = "ATTACK";
		command = game.determineCommand(testInput);
		assertEquals(2, command);
		
		testInput = "attack";
		command = game.determineCommand(testInput);
		assertEquals(2, command);
	}
	*/
	
	
	/**
	 * testing valid quit command by giving different variations of possible
	 * user inputs that would be valid and ensuring the integer returned is 3.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testValidQuitCommand() {
		Mechanics game = new Mechanics();
		
		String testInput = "qUiT";
		int command = game.determineCommand(testInput);
		assertEquals(3, command);
		
		testInput = "QUIT";
		command = game.determineCommand(testInput);
		assertEquals(3, command);
		
		testInput = "quit";
		command = game.determineCommand(testInput);
		assertEquals(3, command);
	}
	*/
	
	
	
	/**
	 * testing invalid command by giving it invalid characters or whitespace and
	 * ensuring the integer returned is -1.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testInvalidCommand() {
		Mechanics game = new Mechanics();
		
		String testInput = "1234";
		int command = game.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$";
		command = game.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "asdf asdf asdf";
		command = game.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = " ";
		command = game.determineCommand(testInput);
		assertEquals(-1, command);
	}
	
	
	
	/**
	 * testing valid Mage character creation by giving different variations of valid
	 * character inputs and ensuring that the character created is an instance of the Mage class.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testValidMageCharacter() {
		Mechanics game = new Mechanics();
		Character testCharacter;
		
		String testInput = "mAgE";
		int command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Mage);
		
		
		testInput = "MAGE";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Mage);
		
		
		testInput = "mage";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Mage);
		
	}
	*/
	/*
	
	
	/**
	 * testing valid Ranger character creation by giving different variations of valid
	 * character inputs and ensuring that the character created is an instance of the Ranger class.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testValidRangerCharacter() {
		Mechanics game = new Mechanics();
		Character testCharacter;
		
		String testInput = "rAnGeR";
		int command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Ranger);
		
		
		testInput = "RANGER";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Ranger);
		
		
		testInput = "ranger";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Ranger);
	}
	*/
	
	
	/**
	 * testing valid Warrior character creation by giving different variations of valid
	 * character inputs and ensuring that the character created is an instance of the Warrior
	 * class.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testValidWarriorCharacter() {
		Mechanics game = new Mechanics();
		Character testCharacter;
		
		String testInput = "wArRiOr";
		int command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Warrior);
		
		
		testInput = "WARRIOR";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Warrior);
		
		
		testInput = "warrior";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertTrue(testCharacter instanceof Warrior);
	}
	*/
	
	
	/**
	 * testing invalid character by giving it variations of invalid characters or whitespace and
	 * ensuring the character created is null.
	 * 
	 * @author blake simpson
	 */
	/*
	@Test
	void testInvalidCharacter() {
		Mechanics game = new Mechanics();
		Character testCharacter;
		
		String testInput = "1234";
		int command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertEquals(null, testCharacter);
		
		testInput = "!@#$";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertEquals(null, testCharacter);
		
		testInput = "asdf asdf asdf";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertEquals(null, testCharacter);
		
		testInput = " ";
		command = game.determineCharacter(testInput);
		testCharacter = game.createCharacter(command);
		assertEquals(null, testCharacter);
	}
	*/
	
	
	
}
