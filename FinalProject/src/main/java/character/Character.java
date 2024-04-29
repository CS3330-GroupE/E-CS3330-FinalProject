package character;

import monster.Monster;
import item.Inventory;
import item.Item;

import java.util.Random;
import java.util.Scanner;

//import item.ItemFactory;
/**
 * @author Ethan Alexander
 */

public class Character {
	protected int health;
	protected int level;
	protected int experience;
	protected int dexterity;
	protected int strength;
	protected int intelligence;
	protected int vitality;
	protected int healthPots;
	protected int armorClass;
	private Item equippedWeapon;
	private Item equippedEquipment;
	private Type classType;
	private Inventory inventory = new Inventory();
	
	
	public Character(int health, int level, int experience, int dexterity, int strength, int intelligence, 
			         int vitality, int healthPots, int armorClass, Item equippedWeapon, Item equippedEquipment, Type classType, Inventory inventory) {
		super();
		this.health = health;
		this.level = level;
		this.experience = experience;
		this.healthPots = healthPots;
		this.armorClass = armorClass;
		this.intelligence = intelligence;
		this.vitality = vitality;
		this.equippedWeapon = equippedWeapon;
		this.equippedEquipment = equippedEquipment;
		this.strength = strength;
		this.dexterity = dexterity;
		this.classType = classType;
		this.inventory = inventory;
	}
	
	public Character(Character copy) {
		this.health = copy.health;
		this.level = copy.level;
		this.experience = copy.experience;
		this.healthPots = copy.healthPots;
		this.armorClass = copy.armorClass;
		this.intelligence = copy.intelligence;
		this.vitality = copy.vitality;
		this.equippedWeapon = copy.equippedWeapon;
		this.equippedEquipment = copy.equippedEquipment;
		this.strength = copy.strength;
		this.dexterity = copy.dexterity;
		this.classType = copy.classType;
		this.inventory = copy.inventory;
	}
	
	
	void Combat(Character character, Monster monster) {
		Scanner scanner = new Scanner(System.in);
		int command;
		
		while(/*!monster.isDead() ||*/ !character.isDeadPlayer(character)) {
			System.out.print("Enter:\n 1 to attack \n 2 to dodge \n 3 to consume a Potion");
			command = scanner.nextInt();
			switch(command) {
			case 1:
				character.attack(character, monster); //Changed this line - Brian -
				break;
			case 2:
			System.out.print("You dodged the attack!\n" );
				break;
			case 3:
				character.usePotion();
				break;
			}
		}
	}

	//Combat method to roll an attack value, compare against character armor, then do damage - AUTHOR Brian -
	public void attack(Character character, Monster monster) {
    		Random rng = new Random();
        	int attackValue = rng.nextInt(10) + 1; //Max attack value up for discussion
        	if (attackValue >= monster.getDefense()) {
        		switch (attackValue) {
        			case 10: 
        				int damage = ((/*TEST VALUE*/1/*PLAYER DAMAGE GOES HERE!!!*/) * 2);
                    			monster.takeDamage(damage);
                    			System.out.println("You critically strike the " + monster.getName() + " for " + damage + " damage!");
        			default:
        				damage = /*TEST VALUE*/1/*PLAYER DAMAGE GOES HERE!!!*/;
                    			monster.takeDamage(damage);
                    			System.out.println("You strike the " + monster.getName() + " for " + damage + " damage!");
        		}
        	} else {
            		switch (attackValue) { 
            			case 1: 
            				System.out.println("You miss, dramatically tripping and falling to the floor!");
            		default:
            				System.out.println("Your attack missed!");
            		}
        	}
    	}

	/* Replaced with character.attack - Brian -
	int playerAttack() {
		int damage = 0;
		
		return damage;
	} */

	//Call to take damage, sets overkill damage to 0 - AUTHOR Brian -
	public void takeDamage(int damage) {
		health -= damage;
        	if (health < 0) {
            	health = 0;
        	}
    	}
	
	void usePotion() {
		int newHealth = this.getHealth() + 4;
		this.setHealthPots(this.getHealthPots() - 1);
		
		if(this.getClassType() == Type.MAGE && newHealth > 15) {
			this.setHealth(newHealth + this.getVitality());
			System.out.print("You are fully healed! Your current health is " + this.getHealth());
		}
		if(this.getClassType() == Type.RANGER && newHealth > 20) {
			this.setHealth(newHealth + this.getVitality());
			System.out.print("You are fully healed! Your current health is " + this.getHealth());
		}
		if(this.getClassType() == Type.WARRIOR && newHealth > 25) {
			this.setHealth(newHealth + this.getVitality());
			System.out.print("You are fully healed! Your current health is " + this.getHealth());
		}
		else {
		this.setHealth(newHealth);
		System.out.print("You healed for 4 HP! Your current health is " + this.getHealth() + "\n");
		}
		System.out.print("You currently have " + this.getHealthPots() + " health potions...");
	}
	
	
	//prints the users current health
	void checkHealth () {
		System.out.print("Current health is : " + this.getHealth());
	}
	
	//print operations to gives info on stats
	public void checkStats () {
		System.out.print("Health: " + this.health);
	}
	
	
	
	boolean levelUp () {
		return true;
	}

	
	
	boolean isDeadPlayer(Character character) {
		if(character.getHealth() > 0) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	//getters and setters
	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public Type getClassType() {
		return classType;
	}

	public void setClassType(Type classType) {
		this.classType = classType;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getHealthPots() {
		return healthPots;
	}

	public void setHealthPots(int healthPots) {
		this.healthPots = healthPots;
	}

	public Item getEquippedWeapon() {
		return equippedWeapon;
	}

	public void setEquippedWeapon(Item equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public Item getEquippedEquipment() {
		return equippedEquipment;
	}

	public void setEquippedEquipment(Item equippedEquipment) {
		this.equippedEquipment = equippedEquipment;
	}
	
	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

}
