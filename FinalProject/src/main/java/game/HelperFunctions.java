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
//import monster.Dragon;
//import monster.Goblin;
//import monster.Orc;
//import monster.Zombie;
//import item.Weapon;
//import item.Equipment;

public class HelperFunctions {

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

	public void buyHealthPotion(Character playerCharacter){
		if(playerCharacter.getGold() >= 15) {
			System.out.print("\nYou bought one health potion.\n");
			playerCharacter.setHealthPots(playerCharacter.getHealthPots() + 1);
			playerCharacter.setGold(playerCharacter.getGold() - 15);
		}
		else {
			System.out.print("What did I tell ya'?\nIf you don't have the dough, pest vamonos!");
		}
	}

	public void buyFullHealth(Character playerCharacter){
		if(playerCharacter.getGold() >= 20) {
			System.out.print("\nYour health has been fully restored.\n");
			playerCharacter.updateHealth();
		}
		else {
			System.out.print("\nWhat do I look like? A charity case?\nIf you don't have the coin, scram!\n");
		}
	}


	public void Combat(Monster monsterHolder, Character playerCharacter) {
		System.out.println("You attack the " + monsterHolder.getName() + "!\n");
		playerCharacter.attack(playerCharacter, monsterHolder);
	
		if(!monsterHolder.isDead(monsterHolder)){
			monsterHolder.attack(monsterHolder, playerCharacter);
		}
		
		playerCharacter.checkHealth();
		monsterHolder.checkMonsterHealth();

	}
	
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
			case 3:
				System.out.print("Attempt to escape failed!\n");
				monsterHolder.attack(monsterHolder, playerCharacter);
				return false;
			case 4:
				System.out.print("Attempt to escape failed!\n");
				monsterHolder.attack(monsterHolder, playerCharacter);
				return false;
			default:
				System.out.print("Attempt to escape failed!\n");
				monsterHolder.attack(monsterHolder, playerCharacter);
				return false;
	
		}
	}
	
	public static int randomizerRun() {
		Random rng = new Random();
		int spawnID = rng.nextInt((4 - 1) + 1);
			
		return spawnID;
	}
	
}
	