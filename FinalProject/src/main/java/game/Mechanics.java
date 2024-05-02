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
		this.scanner = new Scanner(System.in);
		this.command = -1;
		this.input = null;
		this.playerCharacter = null;
		this.playerInventory = new Inventory(); 
	}
	
	
	
	//starts game logic loop
	public void startGame() {
		
		//user choosing character
		while(!characterChosen) {
			characterPrompt();
			input = getUserInput();
			command = determineCharacter(input);
		}
		
		//creating the character from user input
		playerCharacter = createCharacter(command);
		
		System.out.println("GAME START");
		
		//main loop until game ends
		while(!gameOver) {
			
			//back and forth between user turn and monster turn
			if(playerTurn == true) {
				//get command from user
					//check inventory
					//begin battle
					//quit
				
				//get user input for command
				commandPrompt();
				input = getUserInput();
				command = determineCommand(input);
				
				switch(command) {
				case 1:
					//begin battle
					break;
					
				case 2:
					//check inventory
					playerInventory.displayInventory();
					break;
					
				case 3:
					//quit the game
					quitGame();
					break;
					
				default:
					//invalid command (shouldn't ever happen -> checks in determineCommand())
					break;
						
				}
				
				
			}
			
			else {
				
			}
		}
		
		System.out.println("\nGAMEOVER");
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
				playerInventory.addItem(ItemFactory.createItem("Weapon", "Enchanted Sceptre", "A heavy sceptre that can be equipped as a weapon.",
						0, 0, 2, 0, 0));
				break;
				
			case 2:
				newCharacter = new Ranger();
				playerInventory.addItem(ItemFactory.createItem("Weapon", "Bow of Wielding", "A sturdy bow that can be equipped as a weapon. It even comes with arrows.",
						0, 0, 2, 0, 0));
				break;

			case 3:
				newCharacter = new Warrior();
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
		case "attack":
			command = 1;
			System.out.println("player attacks\n");
			
			break;
			
		case "view inventory":
			command = 2;
			System.out.println("player checks inventory\n");
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
			System.out.println("user chooses mage\n");
			characterChosen = true;
			break;
			
		case "ranger":
			command = 2;
			System.out.println("user chooses ranger\n");
			characterChosen = true;
			break;
			
		case "warrior":
			command = 3;
			System.out.println("user chooses warrior\n");
			characterChosen = true;
			break;
			
		default:
			command = -1;
			System.out.println("invalid character\n");
			break;
		}
		
		return command;
	}





	private void characterPrompt() {
		System.out.println("Please Choose a Character:\n");
		System.out.println("- Mage\n");
		System.out.println("- Ranger\n");
		System.out.println("- Warrior\n");
		
		return;
	}
	
	private void commandPrompt() {
		System.out.println("Enter a Command:\n");
		System.out.println("- Attack\n");
		System.out.println("- View Inventory\n");
		System.out.println("- Quit\n");
		
		return;
	}
	
	
	
	
	
	
	
}
