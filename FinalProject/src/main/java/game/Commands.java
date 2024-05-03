package game;

import java.util.Scanner;
import item.Item;

public class Commands {
	
	//private Boolean characterChosen;
	private Scanner scanner; //for user input
	private int command; //stores user input as an integer
	
	
	public Commands() {
		this.scanner = new Scanner(System.in);
		this.command = -1;
		//this.characterChosen = false;

	}
	
	
	
	
	
	//gets input from user through a scanner and returns the input
	//don't need to unit test -> essentially just be testing java functions
	protected String getUserInput() {
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
	protected int determineCommand(String input) {
		
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
	
	
	
	protected int determineInventoryCommand(String input) {
		input = input.toLowerCase().trim();
		
		switch(input) {
		
		case "check current equipment":
			command = 1;		
			//check current equipment
			System.out.println("check current equipment\n");
			break;
		
		case "check stat":
			command = 2;			
			//checkStat(inventoryNumber);			
			System.out.println("check stat\n");
			break;
			
		case "equip item":
			command = 3;
			System.out.println("equip item\n");
			break;
			
		case "back":
			command = 4;
			System.out.println("back to main menu\n");
			break;
			
		default:
			command = -1;
			System.out.println("Invalid Command\n");
			break;
		}
		
		return command;
	}
	
	
	
	
	
	protected int determineBattleCommand(String input) {
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
	protected int determineCharacter(String input) {
		input = input.toLowerCase();
		
		switch(input) {
		case "mage":
			command = 1;
			System.out.println("Player Character: Mage");
			//characterChosen = true;
			break;
			
		case "ranger":
			command = 2;
			System.out.println("Player Character: Ranger");
			//characterChosen = true;
			break;
			
		case "warrior":
			command = 3;
			System.out.println("Player Character: Warrior");
			//characterChosen = true;
			break;
			
		default:
			command = -1;
			System.out.println("Invalid Character\n");
			break;
		}
		
		return command;
	}
	
	
	
	protected void checkStat(int inventoryNumber) {
		
		
		
		
	}
}
