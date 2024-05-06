package game;

import java.util.Random;

import character.Character;
//import character.Mage;
//import character.Ranger;
//import character.Warrior;
import item.Inventory;
import item.Item;
import item.ItemFactory;
import monster.Monster;

/**
 * @author Ethan Alexander
 * 
 * This contains all of the functions used to interact with the shop as well as logic for the combat sequence. 
 * Mainly used to condense any logic that could be done separately from Mechanics to make it more legible.
 * 
 */

public class HelperFunctions {

	
	/**
	 * @author Ethan Alexander
	 * will check if player has 50 gold, subtract 50 from gold if player does, and add a random item to the inventory
	 * 
	 */
	
	public void buyRandomItem(Character playerCharacter, Inventory inventory){
		if(playerCharacter.getGold() >= 50) {
			Item item = ItemFactory.createRandomItem();
			System.out.print("\nYou just bought a "+ item.getName()+"\n");
			inventory.addItem(item);
			playerCharacter.setGold(playerCharacter.getGold() - 50);
		}
		else {
			System.out.print("If you lack the currencies, vacate the premisees.");
		}
	}
	
	//checks if player has 15 gold. if so, subtract 15 from the players gold and adds one health potion to player health potions
	public void buyHealthPotion(Character playerCharacter){
		if(playerCharacter.getGold() >= 15) {
			System.out.print("\nYou bought one health potion.\n");
			playerCharacter.setHealthPots(playerCharacter.getHealthPots() + 1);
			playerCharacter.setGold(playerCharacter.getGold() - 15);
		}
		else {
			System.out.print("If you don't have the dough, you got to go.\n");
		}
	}
	
	/**
	 * @author Ethan Alexander
	 * checks if player has 20 gold. if so, sets the players health to full
	 * 
	 */
	public void buyFullHealth(Character playerCharacter){
		if(playerCharacter.getGold() >= 20) {
			System.out.print("\nYour health has been fully restored.\n");
			playerCharacter.setGold(playerCharacter.getGold() - 20);
			playerCharacter.updateHealth();
		}
		else {
			System.out.print("\nWhat do I look like? A charity case?\nIf you don't have the coin, scram!\n");
		}
	}

	/**
	 * @author Ethan Alexander
	 * uses the attack method for a chance to deal damage to monster. checks if the monster is dead.
	 * if not, the monster gets a chance to attack the player. It then prints the health of both player and
	 * monster health
	 * 
	 */
	
	public void Combat(Monster monsterHolder, Character playerCharacter) {
		System.out.println("You attack the " + monsterHolder.getName() + "!\n");
		playerCharacter.attack(playerCharacter, monsterHolder);
	
		if(!monsterHolder.isDead(monsterHolder)){
			monsterHolder.attack(monsterHolder, playerCharacter);
		}
		
		playerCharacter.checkHealth();
		monsterHolder.checkMonsterHealth();

	}
	
	/**
	 * @author Ethan Alexander
	 * gives a player a chance to leave combat sequence. if the attempt fails, the monster attacks the player.
	 * 
	 */
	public boolean run(Monster monsterHolder, Character playerCharacter) {
		int run = randomizerRun();
		switch(run){
			case 1:
				System.out.print("You successfully escaped!\n");
				return true;
			case 2:
				System.out.print("Attempt to escape failed!\n");
				monsterHolder.attack(monsterHolder, playerCharacter);
				return false;
			default:
				System.out.print("Attempt to escape failed!\n");
				monsterHolder.attack(monsterHolder, playerCharacter);
				return false;
	
		}
	}
	
	/**
	 * @author Ethan Alexander
	 * this generates a random number between 1-2
	 * for the run method
	 * 
	 */
	public static int randomizerRun() {
		Random rng = new Random();
		int spawnID = rng.nextInt((2 - 1) + 1);
			
		return spawnID;
	}
	
}
	