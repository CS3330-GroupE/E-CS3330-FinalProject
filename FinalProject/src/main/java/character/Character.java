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
	private Item equippedWeapon;
	private Item equippedEquipment;
	
	
	public Character(int health, int level, int noHealthPots) {
		super();
		this.health = health;
		this.level = level;
	}
	
	public Character(Character copy) {
		this.health = copy.health;
		this.level = copy.level;
		this.equippedWeapon = copy.equippedWeapon;
		this.equippedEquipment = copy.equippedEquipment;
	}
	
	boolean Attack() {
		return true;
	}
	
	boolean usePotion() {
		return true;
	}
	
	//prints the users current health
	boolean checkHealth () {
		return true;
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

}
