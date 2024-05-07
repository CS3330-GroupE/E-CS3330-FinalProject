# E-CS3330-FinalProject

CS 3330 Final Project: Adventures of JEBB

Authors: Jonathan Hatfield, Ethan Alexander, Brian Bluhm, Blake Simpson

_TO COMPILE AND RUN_
- cd E-CS3330-FinalProject/FinalProject/src/main/java
- javac javac character/Character.java item/Item.java monster/Monster.java game/Mechanics.java main/Main.java
- java main/Main.java


_JUNIT TESTS INFO:_
- Because the entirity of our project relies on user input, to get all JUnit tests to run successfully,
  when you run all tests, you will need to enter "begin battle" so that the mainMenuHandler() can be tested.
  Only then will you see ~85% code coverage. Our coverage will fluctuate a couple of percent because certain methods
  deal with random generation

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

Jonathan Hatfield:

	 - Item class and all subclasses
	 Methods within item package:
		- createRandomItem
  		- createItem
 		- getPrefix
		- generateRandomEquipment   
   		- addItem
    		- removeItemd
   		- getItems
    		- displayInventory
   
   	Methods within Mechanics:
   		- equipItem
     		- createCharacter
	
 	All Junit Item tests
