package character;

import item.Item;
//import item.ItemFactory;
/**
 * @author Ethan Alexander
 */

public abstract class Character {
	protected int health;
	protected int level;
	protected int experience;
	protected int dexterity;
	protected int strength;
	protected int intelligence;
	protected int vitality;
	protected int healthPots;
	private Item equippedWeapon;
	private Item equippedEquipment;
	
	
	public Character(int health, int level, int experience, int dexterity, int strength, int intelligence, 
			         int vitality, int healthPots, Item equippedWeapon, Item equippedEquipment) {
		super();
		this.health = health;
		this.level = level;
		this.experience = experience;
		this.healthPots = healthPots;
		this.intelligence = intelligence;
		this.vitality = vitality;
		this.equippedWeapon = equippedWeapon;
		this.equippedEquipment = equippedEquipment;
		this.strength = strength;
		this.dexterity = dexterity;
	}
	
	public Character(Character copy) {
		this.health = copy.health;
		this.level = copy.level;
		this.experience = copy.experience;
		this.healthPots = copy.healthPots;
		this.intelligence = copy.intelligence;
		this.vitality = copy.vitality;
		this.equippedWeapon = copy.equippedWeapon;
		this.equippedEquipment = copy.equippedEquipment;
		this.strength = copy.strength;
		this.dexterity = copy.dexterity;
	}
	
	public Character createCharacter(int input) {
		
		Character newCharacter;
		if(input <= 3 || input >= 1) {
			switch(input) {
			case 1:
				newCharacter = new Mage(health, level, experience, dexterity, strength, intelligence, 
	               							vitality, healthPots, equippedWeapon, equippedEquipment);
				
				return newCharacter;
			case 2:
				newCharacter = new Ranger(health, level, experience, dexterity, strength, intelligence, 
	               							vitality, healthPots, equippedWeapon, equippedEquipment);
				
				return newCharacter;
			case 3:
				newCharacter = new Warrior(health, level, experience, dexterity, strength, intelligence, 
				                       		vitality, healthPots, equippedWeapon, equippedEquipment);
				
				return newCharacter;
			}
		}
		return null;
		
	}
	
	void Attack() {
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
		this.level = this.level + 1;
		return true;
	}

	public int calculateHealth() {
		// TODO Auto-generated method stub
		return 0;
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
