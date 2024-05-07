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

Brian Bluhm:
	
	- Monster class and the Zombie(), Goblin(), Orc(), and Dragon() subclasses
	Methods within Monster class:
		- public void attack(Monster monster, Character character);
		- public void playerTakeDamage(Character character, int damage);
		- public void takeDamage(int damage);
		- public boolean isDead(Monster monster);
		- public void levelBoost(Monster monster, Character character);
		- public Item dropTreasure();
  		- public int dropGold();
		- public double dropEXP();
		- public void onDeath(Character character, Inventory inventory);
  		- public void checkMonsterHealth();
	
	Methods in Mechanics:
		- Monster spawner spawnID switch case in mainMenuHandler
  
  	JUnit tests for Monster class
