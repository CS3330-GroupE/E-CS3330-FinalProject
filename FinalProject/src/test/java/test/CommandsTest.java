package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.Commands;
import game.Mechanics;

class CommandsTest {

	Mechanics game = new Mechanics();
	Commands commands = new Commands();
	
	
	
	/**
	 * MAIN MENU COMMANDS TESTS -> determineCommand()
	 */
	
	
	/**
	 * testing valid attack command by giving different variations of possible
	 * user inputs that would be valid, and ensuring the integer returned is 2.
	 * 
	 * @author blake simpson
	 */

	@Test
	void testValidBeginBattleDetermineCommand() {	
		String testInput = "bEgIn BaTtLe";
		int command = commands.determineCommand(testInput);
		assertEquals(1, command);
		
		testInput = "BEGIN BATTLE";
		command = commands.determineCommand(testInput);
		assertEquals(1, command);
		
		testInput = "begin battle";
		command = commands.determineCommand(testInput);
		assertEquals(1, command);
	}
	
	
	
	
	@Test
	void testValidViewInventoryDetermineCommand() {
		String testInput = "vIeW iNvEnToRy";
		int command = commands.determineCommand(testInput);
		assertEquals(2, command);
		
		testInput = "VIEW INVENTORY";
		command = commands.determineCommand(testInput);
		assertEquals(2, command);
		
		testInput = "view inventory";
		command = commands.determineCommand(testInput);
		assertEquals(2, command);
	}
	
	
	
	@Test
	void testValidVistBazaarDetermineCommand() {
		String testInput = "vIsIt BaZaAr";
		int command = commands.determineCommand(testInput);
		assertEquals(3, command);
		
		testInput = "VISIT BAZAAR";
		command = commands.determineCommand(testInput);
		assertEquals(3, command);
		
		testInput = "visit bazaar";
		command = commands.determineCommand(testInput);
		assertEquals(3, command);
	}
	
	
	@Test
	void testValidQuitDetermineCommand() {
		String testInput = "qUiT";
		int command = commands.determineCommand(testInput);
		assertEquals(4, command);
		
		testInput = "QUIT";
		command = commands.determineCommand(testInput);
		assertEquals(4, command);
		
		testInput = "quit";
		command = commands.determineCommand(testInput);
		assertEquals(4, command);
	}
	
	
	@Test
	void testInvalidDetermineCommand() {
		String testInput = " ";
		int command = commands.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "123456";
		command = commands.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$%";
		command = commands.determineCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "hello world hello world";
		command = commands.determineCommand(testInput);
		assertEquals(-1, command);
	}
	
	
	
	
	
	
	
	
	
	/**
	 * INVENTORY MENU COMMANDS -> determineInventoryCommands()
	 */
	
	
	@Test
	void testCheckEquipmentInventoryCommand() {
		String testInput = "cHeCk CuRrEnT eQuIpMeNt";
		int command = commands.determineInventoryCommand(testInput);
		assertEquals(1, command);
		
		testInput = "CHECK CURRENT EQUIPMENT";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(1, command);
		
		testInput = "check current equipment";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(1, command);
	}
	
	
	@Test
	void testCheckStatsInventoryCommand() {
		String testInput = "cHeCk StAtS";
		int command = commands.determineInventoryCommand(testInput);
		assertEquals(2, command);
		
		testInput = "CHECK STATS";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(2, command);
		
		testInput = "check stats";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(2, command);
	}
	
	
	@Test
	void testEquipItemInventoryCommand() {
		String testInput = "eQuIp ItEm";
		int command = commands.determineInventoryCommand(testInput);
		assertEquals(3, command);
		
		testInput = "EQUIP ITEM";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(3, command);
		
		testInput = "equip item";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(3, command);
	}
	
	
	@Test
	void testBackInventoryCommand() {
		String testInput = "bAcK";
		int command = commands.determineInventoryCommand(testInput);
		assertEquals(4, command);
		
		testInput = "BACK";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(4, command);
		
		testInput = "back";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(4, command);
	}
	
	
	@Test
	void testInvalidInventoryCommand() {
		String testInput = " ";
		int command = commands.determineInventoryCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "123456";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$%";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "asdf asdf asdf";
		command = commands.determineInventoryCommand(testInput);
		assertEquals(-1, command);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * BATTLE MENU COMMANDS -> determineBattleCommand()
	 */
	
	
	@Test
	void testAttackBattleCommand() {
		String testInput = "aTtAcK";
		int command = commands.determineBattleCommand(testInput);
		assertEquals(1, command);
		
		testInput = "ATTACK";
		command = commands.determineBattleCommand(testInput);
		assertEquals(1, command);
		
		testInput = "attack";
		command = commands.determineBattleCommand(testInput);
		assertEquals(1, command);
	}
	
	
	@Test
	void testValidHealthPotionBattleCommand() {
		String testInput = "uSe HeAlTh PoTiOn";
		int command = commands.determineBattleCommand(testInput);
		assertEquals(2, command);
		
		testInput = "USE HEALTH POTION";
		command = commands.determineBattleCommand(testInput);
		assertEquals(2, command);
		
		testInput = "use health potion";
		command = commands.determineBattleCommand(testInput);
		assertEquals(2, command);
	}
	
	
	@Test
	void testValidRunBattleCommand() {
		String testInput = "rUn";
		int command = commands.determineBattleCommand(testInput);
		assertEquals(3, command);
		
		testInput = "RUN";
		command = commands.determineBattleCommand(testInput);
		assertEquals(3, command);
		
		testInput = "run";
		command = commands.determineBattleCommand(testInput);
		assertEquals(3, command);
	}
	
	
	
	@Test
	void testInvalidBattleCommand() {
		String testInput = " ";
		int command = commands.determineBattleCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "123456";
		command = commands.determineBattleCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$%";
		command = commands.determineBattleCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "asdf asdf asdf";
		command = commands.determineBattleCommand(testInput);
		assertEquals(-1, command);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * CHARACTER SELECT MENU COMMANDS -> determineCharacter()
	 */
	
	
	@Test
	void testValidMageCharacterSelection() {
		String testInput = "mAgE";
		int command = commands.determineCharacter(testInput);
		assertEquals(1, command);
		
		testInput = "MAGE";
		command = commands.determineCharacter(testInput);
		assertEquals(1, command);
		
		testInput = "mage";
		command = commands.determineCharacter(testInput);
		assertEquals(1, command);
	}
	
	
	
	@Test
	void testValidRangerCharacterSelection() {
		String testInput = "rAnGeR";
		int command = commands.determineCharacter(testInput);
		assertEquals(2, command);
		
		testInput = "RANGER";
		command = commands.determineCharacter(testInput);
		assertEquals(2, command);
		
		testInput = "ranger";
		command = commands.determineCharacter(testInput);
		assertEquals(2, command);
	}
	
	
	@Test
	void testValidWarriorCharacterSelection() {
		String testInput = "wArRiOr";
		int command = commands.determineCharacter(testInput);
		assertEquals(3, command);
		
		testInput = "WARRIOR";
		command = commands.determineCharacter(testInput);
		assertEquals(3, command);
		
		testInput = "warrior";
		command = commands.determineCharacter(testInput);
		assertEquals(3, command);
	}
	
	
	@Test
	void testInvalidCharacterSelection() {
		String testInput = " ";
		int command = commands.determineCharacter(testInput);
		assertEquals(-1, command);
		
		testInput = "123456";
		command = commands.determineCharacter(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$%";
		command = commands.determineCharacter(testInput);
		assertEquals(-1, command);
		
		testInput = "asdf asdf asdf";
		command = commands.determineCharacter(testInput);
		assertEquals(-1, command);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * SHOP MENU COMMANDS -> determineShopCommand()
	 */
	
	
	@Test
	void testValidBuyRandomShopCommand() {
		String testInput = "bUy RaNdOm ItEm";
		int command = commands.determineShopCommand(testInput);
		assertEquals(1, command);
		
		testInput = "BUY RANDOM ITEM";
		command = commands.determineShopCommand(testInput);
		assertEquals(1, command);
		
		testInput = "buy random item";
		command = commands.determineShopCommand(testInput);
		assertEquals(1, command);
	}
	
	
	
	@Test
	void testValidBuyPotionShopCommand() {
		String testInput = "bUy HeAlTh PoTiOn";
		int command = commands.determineShopCommand(testInput);
		assertEquals(2, command);
		
		testInput = "BUY HEALTH POTION";
		command = commands.determineShopCommand(testInput);
		assertEquals(2, command);
		
		testInput = "buy health potion";
		command = commands.determineShopCommand(testInput);
		assertEquals(2, command);
	}
	
	
	
	@Test
	void testValidRestoreHealthShopCommand() {
		String testInput = "rEsToRe FuLl HeAlTh";
		int command = commands.determineShopCommand(testInput);
		assertEquals(3, command);
		
		testInput = "RESTORE FULL HEALTH";
		command = commands.determineShopCommand(testInput);
		assertEquals(3, command);
		
		testInput = "restore full health";
		command = commands.determineShopCommand(testInput);
		assertEquals(3, command);
	}
	
	
	
	@Test
	void testBackShopCommand() {
		String testInput = "bAcK";
		int command = commands.determineShopCommand(testInput);
		assertEquals(4, command);
		
		testInput = "BACK";
		command = commands.determineShopCommand(testInput);
		assertEquals(4, command);
		
		testInput = "back";
		command = commands.determineShopCommand(testInput);
		assertEquals(4, command);
	}
	
	
	
	@Test
	void testInvalidShopCommand() {
		String testInput = " ";
		int command = commands.determineShopCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "123456";
		command = commands.determineShopCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "!@#$%";
		command = commands.determineShopCommand(testInput);
		assertEquals(-1, command);
		
		testInput = "asdf asdf asdf";
		command = commands.determineShopCommand(testInput);
		assertEquals(-1, command);
	}
	
	
	
	
	
	
	
	
	
	
	
}
