# E-CS3330-FinalProject

CS 3330 Final Project: Adventures of JEBB

Authors: Jonathan Hatfield, Ethan Alexander, Brian Bluhm, Blake Simpson

** TO COMPILE AND RUN **
- navigate to the proejct folder
- cd E-CS3330-FinalProject/FinalProject/src/main/java
- javac javac character/Character.java item/Item.java monster/Monster.java game/Mechanics.java main/Main.java
- java main/Main.java




Contributions:

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
