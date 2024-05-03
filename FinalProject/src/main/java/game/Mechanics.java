package game;

import character.Character;
import character.Mage;
import character.Ranger;
import character.Warrior;
import item.Inventory;
import item.ItemFactory;
import monster.Monster;
import monster.Dragon;
import monster.Goblin;
import monster.Orc;
import monster.Zombie;
import item.Inventory;

/**
 * This Mechanics class handles all things relating to the flow control and logic of the
 * game itself. It starts the game, quits the game, and has the main loop logic that the user
 * will interact with while playing.
 * 
 * @author blake simpson
 * 
 * 
 */
public class Mechanics {
	
	private boolean gameOver;
	private boolean characterChosen; //initially false, true once user chooses character
	private boolean playerTurn;
	private boolean inInventory;
	private boolean inBattle;
	private boolean inMainMenu;
	private int command; //stores user input as an integer
	private Character playerCharacter;
	private String input; //stores user input as a string
	private Inventory playerInventory;
	private PresetText presetText;
	private Commands commandHandler;
	private Monster monsterHolder;
	
	
	//constructor
	public Mechanics() {
		this.gameOver = false;
		this.characterChosen = false;
		this.playerTurn = true;
		this.inInventory = false;
		this.inBattle = false;
		this.inMainMenu = true;
		this.command = -1;
		this.input = null;
		this.playerCharacter = null;
		this.playerInventory = new Inventory();
		this.presetText = new PresetText();
		this.commandHandler = new Commands();
	}
	
	
	
	//starts game logic loop
	public void startGame() {
		
		presetText.startGameLogo();
		
		//user choosing character
		while(!characterChosen) {
			presetText.characterPrompt();
			input = commandHandler.getUserInput();
			command = commandHandler.determineCharacter(input);
			
			if(command != -1) {
				characterChosen = true;
			}
		}
		
		//creating the character from user input
		playerCharacter = createCharacter(command);
	
		
		
		//main loop until game ends
		while(!gameOver) {
			
			//back and forth between user turn and monster turn
			if(playerTurn == true) {		
				//changes which preset text is presented with available commands depending on
				//where user is in game menu
				//handles command depending on which menu user is current in00
				if(inMainMenu == true) {
					//main menu commands 
					mainMenuHandler();
				}				
				else if(inInventory == true) {
					//inventory commands
					inventoryMenuHandler();
				}				
				else if(inBattle == true) {
					//battle commands
					battleMenuHandler();
				}		
			}
			
			//monsters turn IN BATTLE ONLY
			else {
				//monster attack player
			}
		}
		
		System.out.println("\nGAMEOVER");
	}
	
	
	
	
	/**
	 * @author Brian Bluhm
	 *  random monster spawner
	 * @return new monster
	 */
	//handles main menu commands from user
	public void mainMenuHandler() {
		
		presetText.commandPrompt();
		input = commandHandler.getUserInput();
		command = commandHandler.determineCommand(input);
		
		
		//handle command
		switch(command) {
		case 1:
			//begin battle
			//battle handler
			
		    int spawnID = Commands.randomizerMonstSpawn();
		    switch (spawnID) {
		        case 0:													  //for reference
		        	monsterHolder = new Zombie("Zombie", 0, 15, 5, 5, 0); //String name, int level, int health, int attack, int damage, int defense
		        	break;
		        case 1:
		        	monsterHolder = new Goblin("Goblin", 0, 8, 5, 3, 3);
		        	break;
		        case 2:
		        	monsterHolder = new Orc("Orc", 1, 20, 6, 8, 2);
		        	break;
		        case 3:
		        	monsterHolder = new Dragon("Dragon", 2, 35, 7, 12, 3);
		        	break;
		    }
		    
			inBattle = true;
			inMainMenu = false;
			break;
			
		case 2:
			//view inventory
			//inventory handler
			playerInventory.displayInventory();
			inInventory = true;
			inMainMenu = false;
			break;
			
		case 3:
			//quit		
			quitGame();
			break;
			
		default:
			//invalid command
			break;
		}
		
		
	}
	
	


	//handles inventory menu commands from user
	public void inventoryMenuHandler() {
		
		presetText.inventoryCommandPrompt();
		input = commandHandler.getUserInput();
		command = commandHandler.determineInventoryCommand(input);
		
		
		//handle inventory command
		switch(command) {
		case 1:
			playerCharacter.checkEquipment();
			//check current equipment
			break;
			
		case 2:
			playerCharacter.checkStats();
			//check stats
			break;
			
		case 3:
			
			
			//equip item
			break;
		
		case 4:
			//back
			
			inInventory = false;
			inMainMenu = true;
			break;
		
		default:
			//invalid command
			break;
		}
	}
	
	
	
	
	//handles battle menu commands from user
	public void battleMenuHandler() {
		
		presetText.battleCommandPrompt();
		input = commandHandler.getUserInput();
		command = commandHandler.determineBattleCommand(input);
		

		
		
		//handle battle command
		switch(command) {
		case 1:
			
			System.out.println("You attack the " + monsterHolder.getName() + "!\n");
			playerCharacter.attack(playerCharacter, monsterHolder);
			monsterHolder.attack(monsterHolder, playerCharacter);
			
			playerCharacter.checkStats();
			monsterHolder.checkMonsterHealth();
			
			if(playerCharacter.isDeadPlayer(playerCharacter)) {
				System.out.print("\n\nYOU DIED\n\n");
				gameOver = true;
			}
			if(monsterHolder.isDead(monsterHolder))
			//battle command 1
			break;
			
		case 2:
			
			playerCharacter.usePotion();
			break;
			
		case 3:
			int run = Commands.randomizerRun();
			switch(run){
				case 1:
					System.out.print("You successfully escaped!");
					inBattle = false;
					inMainMenu = true;
					break;
				default:
					System.out.print("Attempt to escape failed!");
					break;
			
			}
			break;
			
		default:
			//invalid command
			break;
		}
	
		
	}
	
	
	
	
	
	
	/**
	 * @author ethan alexander
	 * @param input
	 * @return new character
	 */
	public Character createCharacter(int input) {
		//stats are this order: Strength, Vitality, Dexterity, Intelligence, Armor class
		Character newCharacter = null;
		if(input <= 3 && input >= 1) {
			switch(input) {
			case 1:
				newCharacter = new Mage();
				//adding default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.",
						2, 2, 7, 4, 2));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Magic Robes", "Basiuc magical robes that give emit magical energy and can be equipped.",
						1, 3, 7, 5, 2));
				newCharacter.updateStats();
			
				break;
				
			case 2:
				newCharacter = new Ranger();
				//Equip default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Bow of Wielding", "A sturdy bow that can be equipped as a weapon. It even comes with arrows.",
						1, 8, 3, 4, 0));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Dusty Leather Armor", "A basic leather body with chaps that can be equipped.",
						2, 5, 2, 5, 3));
				newCharacter.updateStats();
				break;

			case 3:
				newCharacter = new Warrior();
				//Equip default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Steel Sword and Shield", "A long sword that can be equipped as a weapon and shield.",
						6, 1, 1, 3, 4));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Steel Armor", "Basic armor, but still tough! Can be equipped",
						5, 1, 1, 4, 6));
				break;
				
			default:
				return null;
			}
		}
		
		return newCharacter;	
	}
	
	
	
	//stops game from running once getUserInput() detects "quit" command
	//
	//might not end up needing pretty basic
	//if we want to implement like a saveState feature this method could call a save method before quitting
	private void quitGame() {
		gameOver = true;
		
	}
	
	
	
	
}
