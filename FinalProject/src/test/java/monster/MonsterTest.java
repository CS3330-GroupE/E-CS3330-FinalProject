package monster;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import character.Character;
import item.Inventory;
import item.Item;

class MonsterTest {
	
	@Test
    public void testTakeDamage() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        int initialHealth = monster.getHealth();
        int damage = 10;

        //Call the takeDamage method for 10 damage
        monster.takeDamage(damage);

        //Assert that health is reduced by damage
        assertEquals(initialHealth - damage, monster.getHealth(), "Health should be reduced by damage amount");
        
        damage = 200;
        
        //Call the takeDamage method for more than current health
        monster.takeDamage(damage);
        
        //Assert that the health is returned to 0
        assertEquals(0, monster.getHealth(), "Health should be 0 when damage exceeds current health");
    }
	
	@Test
    public void testPlayerTakeDamage() {
		Character testPlayer = new Character(20, 30, 1, 0, 1, 1, 1, 0, 5, 0, null, null, null, 0);
		Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        // Get the initial health
        int initialHealth = testPlayer.getHealth();

        //Call the playerTakeDamage method with a damage of 20
        monster.playerTakeDamage(testPlayer, 20);

        //Assert that the health is reduced by 20
        assertEquals(initialHealth - 20, testPlayer.getHealth(), "Health should be reduced by 20");

        //Call the playerTakeDamage method for more than current health
        monster.playerTakeDamage(testPlayer, 200);

        //Assert that the health is returned to 0
        assertEquals(0, testPlayer.getHealth(), "Health should be 0 when damage exceeds current health");
    }
	
	@Test
    public void testIsDead() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        
        //Check if monster is alive
        assertFalse(monster.isDead(monster), "Monster should be alive");
        
        monster.setHealth(0);

        //Check if monster is dead
        assertTrue(monster.isDead(monster), "Monster should be dead");
    }
	
	@Test
    public void testDropTreasure() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        Item item = monster.dropTreasure();
        
        if (item != null) {
            //If an item is dropped, check that it is not null
            assertNotNull(item);
        } else {
            //If no item is dropped, item is null
            assertNull(item);
        }
    }
	
	@Test
    public void testDropGold() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        int gold = monster.dropGold();
        
        //Check if gold is an integer between 11 and 41
        assertTrue(gold >= 11 && gold <= 41);
    }
	
	@Test
    public void testDropEXP() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        double exp = monster.dropEXP();
        
        //Check if exp is a double
        assertTrue(exp % 1 == 0);
        
        //Check if exp is between 10 and 29
        assertTrue(exp >= 10 && exp <= 29);
    }
	
	@Test
    public void testOnDeath() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        Character character = new Character(20, 30, 1, 0, 1, 1, 1, 0, 5, 0, null, null, null, 0);
        Inventory inventory = new Inventory();
        
        int initialGold = character.getGold();
        double initialExp = character.getExperience();
        
        //Test that dropEXP() returns a double between 10 and 29
        assertTrue(monster.dropEXP() >= 10 && monster.dropEXP() <= 29);
        
        //Test that dropTreasure() returns an Item object or null
        Item treasure = monster.dropTreasure();
        assertTrue(treasure instanceof Item || treasure == null);

        //Test that dropGold() returns an integer between 11 and 41
        int gold = monster.dropGold();
        assertTrue(gold >= 11 && gold <= 41);
        
        //Test that character ends up with more gold and exp than they started with
        monster.onDeath(character, inventory);
        assertTrue(character.getGold() > initialGold);
        assertTrue(character.getExperience() > initialExp);
    }
	
	@Test
    public void testCheckMonsterHealth() {
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");
        //Check initial health
        assertEquals(20, monster.getHealth());
        
        //Test after taking damage
        monster.takeDamage(10);
        
        //Check updated health
        assertEquals(10, monster.getHealth());
        
        // Redirect console output to check printed message
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Call the method
        monster.checkMonsterHealth();
        
        // Check printed message
        assertEquals("\nThe Monster's current health is 10\n", outContent.toString());
    }
	
	@Test
    public void testLevelBoost() {
        Character character = new Character(20, 30, 5, 0, 1, 1, 1, 0, 5, 0, null, null, null, 0);
        Monster monster = new Monster("Monster", 1, 20, 0, 0, 0,"tester");

        //Perform the level boost
        monster.levelBoost(monster, character);
        
        //Test if titles changed
        assertTrue(monster.getTitle().equals("wild") || monster.getTitle().equals("Elite") || monster.getTitle().equals("Boss"));
        
        //Test change in stats based on title
        if (monster.getTitle().equals("wild")) {
            assertEquals(monster.getLevel(), 6);
            assertEquals(monster.getHealth(), 45);
            assertEquals(monster.getDamage(), 10);
        }
        
        if (monster.getTitle().equals("Elite")) {
        	assertEquals(monster.getTitle(), "Elite");
            assertEquals(monster.getLevel(), 8);
            assertEquals(monster.getHealth(), 55);
            assertEquals(monster.getDamage(), 14);
            assertEquals(monster.getDefense(), 1);
        }
        
        if (monster.getTitle().equals("Boss")) {
        	assertEquals(monster.getTitle(), "Boss");
            assertEquals(monster.getLevel(), 9);
            assertEquals(monster.getHealth(), 60);
            assertEquals(monster.getDamage(), 16);
            assertEquals(monster.getDefense(), 1);
            assertEquals(monster.getAttack(), 1);
        }
    }
	
	@Test
    void testAttack() {
        Character character = new Character(20, 30, 1, 0, 1, 1, 1, 0, 10, 2, null, null, null, 0);
        Monster monster = new Monster("Monster", 1, 20, 0, 5, 0,"tester");
        
        //Redirect console output to check printed message
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //Test normal attack
        monster.attack(monster, character);
        
        //Available random options
        assertTrue(character.getHealth() == 20 || character.getHealth() == 25 || character.getHealth() == 30);
        
        if (character.getHealth() == 20){
        	//Test critical strike
        	assertTrue(outContent.toString().contains("critically strikes you for"), "Output should indicate a critical strike");
         
        } else if (character.getHealth() == 25) {
        	//Test normal strike
        	assertTrue(outContent.toString().contains("attacks you for"), "Output should indicate a normal attack");
        	
        } else if (character.getHealth() == 30) {
        	//Test monster misses
        	assertTrue(outContent.toString().contains("'s attack missed!") || outContent.toString().contains(" dramatically trips "), "Output should indicate a missed attack or a critical miss");
        }
	}
}
