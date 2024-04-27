package character;

import item.Item;

/**
 * 
 * 
 * 
 * 
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
	
	
	public Character(int health, int level, int noHealthPots, int experience, int healthPots) {
		super();
		this.health = health;
		this.level = level;
		this.experience = experience;
		this.healthPots = healthPots;
		this.equippedWeapon = null;
		this.equippedEquipment = null;
	}
	
	public Character(Character copy) {
		this.health = copy.health;
		this.level = copy.level;
		this.experience = copy.experience;
		this.equippedWeapon = copy.equippedWeapon;
		this.equippedEquipment = copy.equippedEquipment;
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
