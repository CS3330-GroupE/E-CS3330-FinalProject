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
	private void quitGame() {
		gameOver = true;
		
	}
	
	
	
	
	//gets commands from user through a scanner
	private void getUserInput() {
		System.out.println("ENTER COMMAND (MOVE, ATTACK, QUIT):");
		String input = scanner.nextLine().trim().toLowerCase();
		
		switch(input) {
		case "move":
			//move
			System.out.println("\ntesting move");
			break;
			
		case "attack":
			//attack
			System.out.println("\ntesting attack");
			break;
			
		case "quit":
			quitGame();
			break;
			
		default:
			System.out.println("\nInvalid command");
		}
	}
	
	
	
	/*
	//displays info resulting from battleManager() -> damage done, whether attack missed, hp remaining, etc.
	private void displayInfo() {
		
	}
	*/
	
	
	
	//manages all information during player battle -> who's turn, damage calculation, etc.
	private void battleManager() {
		//when it's user's turn
		if(playerTurn) {
			
		}
		//when it's game/monster's turn
		else {
			
		}
	}
	
}
