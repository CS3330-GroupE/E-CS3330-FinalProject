package game;

import character.Character;
import character.Mage;
import character.Ranger;
import character.Warrior;
import item.Inventory;
import item.ItemFactory;

import java.util.Scanner;



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
	private Scanner scanner; //for user input
	private int command; //stores user input as an integer
	private Character playerCharacter;
	private String input; //stores user input as a string
	private Inventory playerInventory;
	
	
	//constructor
	public Mechanics() {
		this.gameOver = false;
		this.characterChosen = false;
		this.playerTurn = true;
		this.inInventory = false;
		this.inBattle = false;
		this.inMainMenu = true;
		this.scanner = new Scanner(System.in);
		this.command = -1;
		this.input = null;
		this.playerCharacter = null;
		this.playerInventory = new Inventory(); 
	}
	
	
	
	//starts game logic loop
	public void startGame() {
		
		startGameLogo();
		
		//user choosing character
		while(!characterChosen) {
			characterPrompt();
			input = getUserInput();
			command = determineCharacter(input);
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
	
	
	
	//handles main menu commands from user
	public void mainMenuHandler() {
		
		commandPrompt();
		input = getUserInput();
		command = determineCommand(input);
		
		
		//handle command
		switch(command) {
		case 1:
			//begin battle
			//battle handler
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
		
		inventoryCommandPrompt();
		input = getUserInput();
		command = determineInventoryCommand(input);
		
		
		//handle inventory command
		switch(command) {
		case 1:
			//check stats
			break;
			
		case 2:
			//equip item
			break;
			
		case 3:
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
		
		battleCommandPrompt();
		input = getUserInput();
		command = determineBattleCommand(input);
		
		//handle battle command
		switch(command) {
		case 1:
			//battle command 1
			break;
			
		case 2:
			//battle command 2
			break;
			
		case 3:
			//battle command 3
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
		
		Character newCharacter = null;
		if(input <= 3 && input >= 1) {
			switch(input) {
			case 1:
				newCharacter = new Mage();
				//adding default mage weapon to inventory
				playerInventory.addItem(ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.",
						0, 0, 2, 0, 0));
				break;
				
			case 2:
				newCharacter = new Ranger();
				//adding default ranger weapon to inventory
				playerInventory.addItem(ItemFactory.createItem("Weapon", "Bow of Wielding", "A sturdy bow that can be equipped as a weapon. It even comes with arrows.",
						0, 0, 2, 0, 0));
				break;

			case 3:
				newCharacter = new Warrior();
				//adding default warrior weapon to inventory
				playerInventory.addItem(ItemFactory.createItem("Weapon", "Long Sword", "A long sword that can be equipped as a weapon.",
						0, 0, 2, 0, 0));
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
	
	
	
	
	
	//gets input from user through a scanner and returns the input
	//don't need to unit test -> essentially just be testing java functions
	private String getUserInput() {
		//System.out.println("Enter Command (Move, Attack, Quit):");
		String input = scanner.nextLine();
		
		return input;
	}
	
	
	
	
	
	
	
	//use/view inventory
	//begin battle
	//quit
	//
	//
	//gets passed user input from getUserInput() method and determines the
	//command being used through a switch statement and returns the command as an integer
	//
	//RETURNS:
	// - if user input = invalid -> returns -1
	// - if user input = "attack" -> returns 1
	// - if user input = "check inventory" -> returns 2
	// - if user input = "quit" -> returns 3
	public int determineCommand(String input) {
		
		input = input.toLowerCase().trim();
		
		switch(input) {
		case "begin battle":
			command = 1;
			System.out.println("player begins battle\n");
			
			break;
			
		case "view inventory":
			command = 2;
			break;
		
		
		case "quit":
			command = 3;
			System.out.println("player quits\n");
			break;
		
		
		default:
			command = -1;
			System.out.println("Invalid Command\n");
			break;
		}
		
		return command;
	}
	
	
	
	public int determineInventoryCommand(String input) {
		input = input.toLowerCase().trim();
		
		switch(input) {
		case "check stat":
			command = 1;
			System.out.println("check stat\n");
			break;
			
		case "equip item":
			command = 2;
			System.out.println("equip item\n");
			break;
			
		case "back":
			command = 3;
			System.out.println("back to main menu\n");
			break;
			
		default:
			command = -1;
			System.out.println("Invalid Command\n");
			break;
		}
		
		return command;
	}
	
	
	
	
	public int determineBattleCommand(String input) {
		input = input.toLowerCase().trim();
		
		switch(input) {
		case "battle command 1":
			command = 1;
			System.out.println("battle command 1\n");
			break;
			
		case "battle command 2":
			command = 2;
			System.out.println("battle command 2\n");
			break;
			
		case "battle command 3":
			command = 3;
			System.out.println("battle command 3\n");
			break;
			
		default:
			command = -1;
			System.out.println("Invalid Command\n");
			break;
		}
		
		return command;
	}
	
	
	
	
	
	//gets passed user input from getUserInput() method and determines the character
	//chosen through a switch statement and returns the character chosen as an integer
	//
	//RETURNS:
	// - if user input = invalid -> returns -1
	// - if user input = "mage" -> returns 1
	// - if user input = "ranger" -> returns 2
	// - if user input = "warrior" -> returns 3
	public int determineCharacter(String input) {
		input = input.toLowerCase();
		
		switch(input) {
		case "mage":
			command = 1;
			System.out.println("Player Character: Mage");
			characterChosen = true;
			break;
			
		case "ranger":
			command = 2;
			System.out.println("Player Character: Ranger");
			characterChosen = true;
			break;
			
		case "warrior":
			command = 3;
			System.out.println("Player Character: Warrior");
			characterChosen = true;
			break;
			
		default:
			command = -1;
			System.out.println("Invalid Character\n");
			break;
		}
		
		return command;
	}
	
	
	
	





	
	
	private void characterPrompt() {
	    System.out.println("===========================================");
	    System.out.println("|             Choose a Character          |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Mage                                |");
	    System.out.println("|  2. Ranger                              |");
	    System.out.println("|  3. Warrior                             |");
	    System.out.println("===========================================");
	}

	private void commandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|               Enter a Command           |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Begin Battle                        |");
	    System.out.println("|  2. View Inventory                      |");
	    System.out.println("|  3. Quit                                |");
	    System.out.println("===========================================");
	}
	
	private void inventoryCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|          Enter Inventory Command        |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Check Stat (Enter Inventory Number) |");
	    System.out.println("|  2. Equip Item (Enter Inventory Number) |");
	    System.out.println("|  3. Back                                |");
	    System.out.println("===========================================");
	}
	
	private void battleCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Enter Battle Command          |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Battle Command 1                    |");
	    System.out.println("|  2. Battle Command 2                    |");
	    System.out.println("|  3. Battle Command 3                    |");
	    System.out.println("===========================================");
	}

	
	private void startGameLogo() {
	    System.out.println("===========================================");
	    System.out.println("|                                         |");
	    System.out.println("|               GAME TITLE                |");
	    System.out.println("|                                         |");
	    System.out.println("|                   BY:                   |");
	    System.out.println("|                                         |");
	    System.out.println("|            JONATHAN HATFIELD            |");
	    System.out.println("|             ETHAN ALEXANDER             |");
	    System.out.println("|               BRIAN BLUHM               |");
	    System.out.println("|              BLAKE SIMPSON              |");
	    System.out.println("|                                         |");
	    System.out.println("===========================================");
	    System.out.println("\n\n");
	}
	
	
	
	
}
