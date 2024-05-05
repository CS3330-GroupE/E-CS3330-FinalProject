package game;



import character.Character;
import character.Mage;
import character.Ranger;
import character.Warrior;
import item.Inventory;
import item.Item;
import item.ItemFactory;
import monster.Monster;
import monster.Dragon;
import monster.Goblin;
import monster.Orc;
import monster.Zombie;
import item.Weapon;
import item.Equipment;

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
	private boolean inShop;
	private int command; //stores user input as an integer
	private Character playerCharacter;
	private String input; //stores user input as a string
	private Inventory playerInventory;
	private PresetText presetText;
	private Commands commandHandler;
	private Monster monsterHolder;
	private HelperFunctions functions;
	
	
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
		this.functions = new HelperFunctions();
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
				else if(inShop == true) {
					shopMenuHandler();
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
		        	System.out.print("\nA wild Zombie Appears!\n\n\n");
		        	presetText.printZombie();
		        	break;
		        case 1:
		        	monsterHolder = new Goblin("Goblin", 0, 8, 5, 3, 3);
		        	System.out.print("\nA wild Goblin Appears!\n\n\n");
		        	presetText.printGoblin();
		        	break;
		        case 2:
		        	monsterHolder = new Orc("Orc", 1, 20, 6, 8, 2);
		        	System.out.print("\nA wild Orc Appears!\n\n\n");
		        	presetText.printOrc();
		        	break;
		        case 3:
		        	monsterHolder = new Dragon("Dragon", 2, 35, 7, 12, 3);
		        	System.out.print("\nA wild Dragon Appears!\n\n\n");
		        	presetText.printDragon();
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
			//go to shop
			inShop = true;
			inMainMenu = false;
			break;
		case 4:
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

//			for testing purposes
//			playerInventory.addItem(ItemFactory.createRandomItem());
//			playerInventory.addItem(ItemFactory.createRandomItem());
//			playerInventory.addItem(ItemFactory.createRandomItem());
//			playerInventory.addItem(ItemFactory.createRandomItem());


			equipItem(playerCharacter);

			


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
	
	
	public void shopMenuHandler() {
		
		presetText.shopCommandPrompt();
		input = commandHandler.getUserInput();
		command = commandHandler.determineShopCommand(input);
			
		//handle inventory command
		switch(command) {
		case 1:
			
			functions.buyRandomItem(playerCharacter, playerInventory);
			break;
			
		case 2:
			functions.buyHealthPotion(playerCharacter);
			break;
			
		case 3:
			functions.buyFullHealth(playerCharacter);
			break;
			
		case 4:
			//back
			inShop = false;
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
			
			functions.Combat(monsterHolder, playerCharacter);
			
			if(playerCharacter.isDeadPlayer(playerCharacter)) {
				System.out.print("\n\nYOU DIED\n\n");
				gameOver = true;
			}
			if(monsterHolder.isDead(monsterHolder)) {
				monsterHolder.onDeath(playerCharacter, playerInventory);
				inBattle = false;
				inMainMenu = true;
			}
			//battle command 1
			break;
			
		case 2:
			
			playerCharacter.usePotion();
			break;
			
		case 3:
			
			if(functions.run(monsterHolder, playerCharacter)) {
				inBattle = false;
				inMainMenu = true;
			}
			if(playerCharacter.isDeadPlayer(playerCharacter)) {
				System.out.print("\n\nYOU DIED\n\n");
				gameOver = true;
			}
			
			break;
		default:
			System.out.print("Invalid Command!\n");
			break;
		}
	
		
	}
		
	
	/**
	 * @author ethan alexander and Jonathan Hatfield
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
				newCharacter.setBaseStats(newCharacter);
				//adding default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.",
						2, 2, 7, 4, 2));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Magic Robes", "Basic magical robes that give emit magical energy and can be equipped.",
						1, 3, 7, 5, 2));
				newCharacter.updateStats(newCharacter);
			
				break;
				
			case 2:
				newCharacter = new Ranger();
				newCharacter.setBaseStats(newCharacter);
				//Equip default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Bow of Wielding", "A sturdy bow that can be equipped as a weapon. It even comes with arrows.",
						1, 8, 3, 4, 0));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Leather Armor", "A basic leather body with chaps that can be equipped.",
						2, 5, 2, 5, 3));
				newCharacter.updateStats(newCharacter);
				break;

			case 3:
				newCharacter = new Warrior();
				newCharacter.setBaseStats(newCharacter);
				//Equip default loadouts
				newCharacter.setEquippedWeapon(ItemFactory.createItem("Weapon", "Steel Sword and Shield", "A long sword that can be equipped as a weapon and shield.",
						6, 1, 1, 3, 4));
				newCharacter.setEquippedEquipment(ItemFactory.createItem("Equipment", "Steel Armor", "Basic armor, but still tough! Can be equipped",
						5, 1, 1, 4, 6));
				newCharacter.updateStats(newCharacter);
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

   
    public void equipItem(Character character) {
        // Display inventory
        playerInventory.displayInventory();

        // Get the index input from the user
        input = commandHandler.getUserInput();
        int index = Integer.parseInt(input);

        // Retrieve the item from the inventory
        if (index >= 0 && index < playerInventory.getItems().size()) {
            Item item = playerInventory.getItems().get(index);
            
            // Check if the item is a Weapon
            if (item instanceof Weapon) {
                // Unequip any previously equipped weapon
                if (character.getEquippedWeapon() != null) {
                    playerInventory.addItem(character.getEquippedWeapon());
                    playerInventory.removeItem(item);
                }
                // Equip the new weapon
                character.setEquippedWeapon((Weapon)item);
                character.updateStats(character);
                System.out.println("Equipped weapon: " + item.getName());
            }
            // Check if the item is Equipment
            else if (item instanceof Equipment) {
                // Unequip any previously equipped equipment
                if (character.getEquippedEquipment() != null) {
                    playerInventory.addItem(character.getEquippedEquipment());
                    playerInventory.removeItem(item);
                }
                // Equip the new equipment
                character.setEquippedEquipment((Equipment)item);
                character.updateStats(character);
                System.out.println("Equipped armor: " + item.getName());
            }
 
        } else {
            System.out.println("Invalid index.");
        }
    }	
}
