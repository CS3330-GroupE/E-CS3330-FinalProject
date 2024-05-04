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
	private int baseHealth;
	protected int health;
	protected int level;
	protected double experience;
	protected int dexterity;
	protected int strength;
	protected int intelligence;
	protected int vitality;
	protected int healthPots;
	protected int armorClass;
	private Item equippedWeapon;
	private Item equippedEquipment;
	private Type classType;
	private int gold;
	
	
	public Character(int baseHealth, int health, int level, double experience, int dexterity, int strength, int intelligence, 
			         int vitality, int healthPots, int armorClass, Item equippedWeapon, Item equippedEquipment, Type classType, int gold) {
		super();
		this.baseHealth = health;
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
		this.gold = gold;
	}
	
	public Character(Character copy) {
		this.baseHealth = copy.baseHealth;
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
		this.gold = copy.gold;
	}
	

	//Combat method to roll an attack value, compare against character armor, then do damage - AUTHOR Brian -
	public void attack(Character character, Monster monster) {
    		Random rng = new Random();
        	int attackValue = rng.nextInt(10) + 1; //Max attack value up for discussion
        	if (attackValue >= monster.getDefense()) {
        		switch (attackValue) {
        			case 10: 
        				int damage = (getPlayerDamage(character) * 2);
                    			monster.takeDamage(damage);
                    			System.out.println("You critically strike the " + monster.getName() + " for " + damage + " damage!");
        			default:
        			damage = getPlayerDamage(character);
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


	//Call to take damage, sets overkill damage to 0 - AUTHOR Brian -
	public void takeDamage(int damage) {
		health -= damage;
        	if (health < 0) {
            	health = 0;
        	}
    }
	
	
	public void usePotion() {
		int newHealth = this.getHealth();
		if(this.getHealthPots() > 0) {
			
			if(this.getClassType() == Type.MAGE && newHealth < 15) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! Your current health is " + this.getHealth() + "\n");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else if(this.getClassType() == Type.RANGER && newHealth < 20) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! Your current health is " + this.getHealth() + "\n");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else if(this.getClassType() == Type.WARRIOR && newHealth < 25) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! Your current health is " + this.getHealth() + "\n");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else {
				System.out.print("\nUnable to use Health Potion. Health is already full!\n");
			}
		
			if(this.getClassType() == Type.MAGE && newHealth >= (15 + this.getVitality())) {
				newHealth = 15;
				this.setHealth(newHealth + this.getVitality());
				System.out.print("Your current health is " + this.getHealth()+"\n");
			}
			if(this.getClassType() == Type.RANGER && newHealth >= (20 + this.getVitality())) {
				newHealth = 20;
				this.setHealth(newHealth + this.getVitality());
				System.out.print("Your current health is " + this.getHealth()+"\n");
			}
			if(this.getClassType() == Type.WARRIOR && newHealth >= (25 + this.getVitality())) {
				newHealth = 25;
				this.setHealth(newHealth + this.getVitality());
				System.out.print("Your current health is " + this.getHealth()+"\n");
			}
		}
		else {
			System.out.print("Drats!!!\n");
		}
		System.out.print("\nYou currently have " + this.getHealthPots() + " health potions...\n");
	}
	
	
	
	
	//prints the users current health
	public void checkHealth () {
		System.out.print("Current health is : " + this.getHealth());
	}
	
	//print operations to gives info on stats
	public void checkStats () {

		
		System.out.print("Current Player Info:\n\n");
		
		System.out.print("Class: " + this.getClassType() + "\n");
		System.out.print("Health: " + this.getHealth() + "\n");
		System.out.print("XP: " + this.getExperience()+ "/100\n");
		System.out.print("Vitality: " + this.getVitality()+ "\n");
		System.out.print("Dexterity: " + this.getDexterity()+ "\n");
		System.out.print("Strength: " + this.getStrength() + "\n");
		System.out.print("Intelligence: " + this.getIntelligence() + "\n");
		
	}

	public void checkEquipment() {
		Item weapon = this.getEquippedWeapon();
		Item equipment = this.getEquippedEquipment();
		
		System.out.print(weapon.getName() + ":\n");
		System.out.print(equipment.getName() + "\n");
		System.out.print("Armor Class: " + this.getArmorClass() + "\n");
		System.out.print("Current Number of Health Pots: " + this.getHealthPots() + "\n");
	}

	//added by Jonathan Hatfield
    public void updateStats() {
        if (equippedWeapon != null) {
            updateStatsWithItem(equippedWeapon);
            updateHealth();
        }
        if (equippedEquipment != null) {
            updateStatsWithItem(equippedEquipment);
            updateHealth();
        }
    }
    
    public void updateStatsUnequip() {
    	if(equippedWeapon != null) {
    		updateStatsWithOutItem(equippedWeapon);
    		updateHealth();
    	}
    	if(equippedEquipment != null) {
    		updateStatsWithOutItem(equippedEquipment);
    		updateHealth();
    	}
    }

    private void updateStatsWithOutItem(Item item) {
        // This will get the item stats
        int itemDexterity = item.getDexterity();
        int itemStrength = item.getStrength();
        int itemIntelligence = item.getIntelligence();
        int itemVitality = item.getVitality();
        int itemArmorClass = item.getArmorClass();

        // This will update the stats 
        dexterity -= itemDexterity;
        strength -= itemStrength;
        intelligence -= itemIntelligence;
        vitality -= itemVitality;
        armorClass -= itemArmorClass;
    }
	
    private void updateStatsWithItem(Item item) {
        // This will get the item stats
        int itemDexterity = item.getDexterity();
        int itemStrength = item.getStrength();
        int itemIntelligence = item.getIntelligence();
        int itemVitality = item.getVitality();
        int itemArmorClass = item.getArmorClass();

        // This will update the stats 
        dexterity += itemDexterity;
        strength += itemStrength;
        intelligence += itemIntelligence;
        vitality += itemVitality;
        armorClass += itemArmorClass;
    }
	
	public void levelUp () {
		
		System.out.print("\n\nLEVELUP!!\n\n");
		
		int newLevel = this.getLevel() + 1;
		this.setLevel(newLevel);
		if(this.getClassType() == Type.MAGE) {
			this.setIntelligence(1 + intelligence);
			this.setDexterity(1 + vitality);
		}
		if(this.getClassType() == Type.WARRIOR) {
			this.setStrength(1 + strength);
			this.setDexterity(1 + vitality);
		}
		if(this.getClassType() == Type.RANGER) {
			this.setDexterity(1 + dexterity);
			this.setDexterity(1 + vitality);
		}
		updateHealth();
	}

	
	
	public boolean isDeadPlayer(Character character) {
		if(character.getHealth() > 0) {
			return false;
		}
		return true;
	}
	
	public int getPlayerDamage(Character player) {
		if(player.getClassType() == Type.MAGE) {
			return player.getIntelligence();
		}
		if(player.getClassType() == Type.WARRIOR) {
			return player.getStrength();
		}
		if(player.getClassType() == Type.RANGER) {
			return player.getDexterity();
		}
		return 0;
	}
	
	
	public void updateHealth() {
		this.setHealth(baseHealth + vitality);
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

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
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
