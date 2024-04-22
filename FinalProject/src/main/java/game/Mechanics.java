package game;
import java.util.Scanner;

public class Mechanics {
	
	private boolean gameOver;
	private boolean playerTurn;
	private Scanner scanner;
	
	
	//constructor
	public Mechanics() {
		this.gameOver = false;
		this.playerTurn = true;
		this.scanner = new Scanner(System.in);
	}
	
	
	
	
	
	//starts game logic loop
	public void startGame() {
		//selectCharacter() ----> character class or mechanics class?
		
		System.out.println("GAME START");
		
		while(!gameOver) {
			//get user input
			getUserInput();
			
			//do stuff from user input
			battleManager();
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
	
	
	
	
	
	//gets commands from user through a scanner
	//
	//might need to return the command used for battle manager?
	private void getUserInput() {
		System.out.println("\nEnter Command (Move, Attack, Quit):");
		String input = scanner.nextLine().trim().toLowerCase();
		
		switch(input) {
		case "move":
			//move
			System.out.println("testing move\n");
			break;
			
		case "attack":
			//attack
			System.out.println("testing attack\n");
			break;
			
		case "quit":
			quitGame();
			break;
			
		default:
			System.out.println("Invalid command\n");
		}
	}
	
	
	
	
	
	/*
	//displays info resulting from battleManager() -> damage done, whether attack missed, hp remaining, etc.
	private void displayInfo() {
		
	}
	*/
	
	
	
	
	
	//manages all information during player battle -> who's turn, damage calculation, etc.
	//
	//probably going to have to create multiple methods for everything originally planned for this method
	//and then just have this method control them and basically just be flow control for them
	//
	//might need to take a parameter for which command is used?
	private void battleManager() {
		//when it's user's turn
		if(playerTurn) {
			//do stuff
		}
		//when it's game/monster's turn
		else {
			
		}
	}
	
	
	
	
	
}
