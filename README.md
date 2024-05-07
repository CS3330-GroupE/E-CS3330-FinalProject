# E-CS3330-FinalProject

CS 3330 Final Project: Adventures of JEBB

Authors: Jonathan Hatfield, Ethan Alexander, Brian Bluhm, Blake Simpson

_TO COMPILE AND RUN_
- cd E-CS3330-FinalProject/FinalProject/src/main/java
- javac javac character/Character.java item/Item.java monster/Monster.java game/Mechanics.java main/Main.java
- java main/Main.java




*CONTRIBUTIONS:*

Ethan Alexander:
	
	- Character class and all its subclasses
	Methods within Character class:
		- public void levelUp();
		- public void usePotion();
		- public void updateHealth();
		- public void checkStats();
		- public void checkEquipment();
		- public boolean isDeadPlayer(Character character);
	
	- Wrote the entirety of HelperFunctions
	
	Methods in Mechanics:
		- public Character createCharacter(int input);


Blake Simpson:

	- Commands class
 		Methods within Commands class:
   		- getUserInput()
      	- determineCommand()
	 	- determineInventoryCommand()
    	- determineBattleCommand()
       	- determineCharacter()
	  	- determineShopCommand()
    - Mechanics class
       	Methods within Mechanics class:
	 	- startGame()
    	- mainMenuHandler()
       	- inventoryMenuHandler()
	  	- shopMenuHandler()
     	- battleMenuHandler()
		- quitGame()
    - All JUnit Commands Tests
