package game;

public class PresetText {
	
	protected void characterPrompt() {
	    System.out.println("===========================================");
	    System.out.println("|             Choose a Character          |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Mage                                |");
	    System.out.println("|  2. Ranger                              |");
	    System.out.println("|  3. Warrior                             |");
	    System.out.println("===========================================");
	}

	protected void commandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|               Enter a Command           |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Begin Battle                        |");
	    System.out.println("|  2. View Inventory                      |");
	    System.out.println("|  3. Visit Bazaar                        |");
	    System.out.println("|  4. Quit                                |");
	    System.out.println("===========================================");
	}
	
	protected void inventoryCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|          Enter Inventory Command        |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Check Current Equipment             |");
	    System.out.println("|  2. Check Stat (Enter Inventory Number) |");
	    System.out.println("|  3. Equip Item (Enter Inventory Number) |");
	    System.out.println("|  4. Back                                |");
	    System.out.println("===========================================");
	}
	
	protected void battleCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Enter Battle Command          |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Attack                              |");
	    System.out.println("|  2. Use Health Potion                   |");
	    System.out.println("|  3. Run                                 |");
	    System.out.println("===========================================");
	}

	
	protected void startGameLogo() {
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
	
	protected void shopCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Welcome to the Bazarr!        |");
	    System.out.println("===========================================");
	    System.out.println("|  1. Buy Random Item (50 gold)           |");
	    System.out.println("|  2. Buy Health Potion (15 gold)         |");
	    System.out.println("|  3. Restore Full Health (20 gold)       |");
	    System.out.println("|  4. Back                                |");
	    System.out.println("===========================================");
	}
	
	

}
