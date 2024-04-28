package character;

import monster.Monster;
import item.Inventory;
import item.Item;

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
	
	
	/*void Attack(Character character, Monster monster) {
		
		while(!monster.isDead() || !character.isDeadPlayer(character)) {
			
			switch(command) {
			
			}
		}
		
	}*/
	
	
	int playerAttack() {
		int damage = 0;
		
		return damage;
	}
	void usePotion() {
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
