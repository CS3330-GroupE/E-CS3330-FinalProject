package game;

import java.util.Scanner;



/**
 * This Mechanics class handles all things relating to the flow control and logic of the
 * game itself. It starts the game, quits the game, and has the main loop logic that the user
 * will interact with while playing.
 * 
 * @author Blake Simpson
 * 
 * 
 */
public class Mechanics {
	
	private boolean gameOver;
	//private boolean playerTurn;
	private Scanner scanner;
	private int command;
	private String input;
	
	
	//constructor
	public Mechanics() {
		this.gameOver = false;
		//this.playerTurn = true;
		this.scanner = new Scanner(System.in);
		this.command = -1;
		this.input = null;
	}
	
	
	
	
	
	//starts game logic loop
	public void startGame() {
		//selectCharacter() ----> character class or mechanics class?
		
		System.out.println("GAME START");
		
		while(!gameOver) {
			//get user input
			input = getUserInput();
			command = determineCommand(input);
			
			//do stuff from user input
			//battleManager();
		}
		
		System.out.println("\nGAMEOVER");
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
		System.out.println("Enter Command (Move, Attack, Quit):");
		String input = scanner.nextLine().trim();
	
		return input;
	}
	
	
	
	
	
	//gets passed user input from getUserInput() method and determines the
	//command being used through a switch statement and returns the command as an integer
	//
	//RETURNS:
	// - if user input = invalid -> returns -1
	// - if user input = "move" -> returns 1
	// - if user input = "attack" -> returns 2
	// - if user input = "quit" -> returns 3
	public int determineCommand(String input) {
		input = input.toLowerCase();
		
		switch(input) {
		case "move":
			command = 1;
			System.out.println("player moves\n");
			break;
			
		case("attack"):
			command = 2;
			System.out.println("player attacks\n");
			break;
		
		
		case("quit"):
			command = 3;
			quitGame();
			break;
			
		default:
			command = -1;
		}
		
		
		
		return command;
	}
	

	
	
	
}
