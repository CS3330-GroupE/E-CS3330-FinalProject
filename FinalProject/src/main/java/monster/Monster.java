package monster;

import java.util.Random;

import item.Item;
import item.RandomEquipmentGenerator;

public class Monster {
	private Random rng;
	private String name;
	//hit point value of monster
    private int health;
    //determines monster stat bonuses
    private int level;
    //value monster must beat on attack roll
    private int attack;
    //damage dealt to player on successful roll
    private int damage;
    //value player must beat to deal damage
    private int defense;

    public Monster(String name, int level, int health, int attack, int damage, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    
    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }
	
	//********************
	//General monster mechanics
	void attack() {
	}
	
	boolean checkHealth () {
		return true;
	}
	
	//print operations to gives info on stats
	boolean checkStats () {
		return true;
	}
	
	//Applies bonuses to monster stats based on level TDO
	boolean levelBoost() {
		return true;
	}

	//********************
	//Mechanics upon monster death
	//Random item drops
	public Item dropTreasure() {
	    Random rng = new Random();
	    int dropRNG = rng.nextInt(5); // Generate a drop chance

	    // If the drop value is not 0 or 1, drop a random item
	    if (dropRNG >=2) {
	        return RandomEquipmentGenerator.generateRandomEquipment();
	    } else {
	        return null; // No item dropped
	    }
	}
	
	//Random EXP
	public double dropEXP() {
	    Random rng = new Random();
	    int baseExp = rng.nextInt(20) + 10; // Generate a random two-digit integer between 10 and 29
	    double bonusExp = getLevel() * 0.2; // Apply a bonus based on the level of the monster
	    return baseExp * bonusExp;
	}
	
	//Use Monster defeatedMonster = defeatedMonster.onDeath(); in main game operation file
	public void onDeath() {
	    double exp = dropEXP();
	    Item treasure = dropTreasure();

	    System.out.println("The " + getName() + " has been defeated!");
	    System.out.println("You gained " + exp + " experience points.");

	    if (treasure != null) {
	        System.out.println("The " + getName() + " dropped " + treasure.getName());
	    } else {
	        System.out.println("The " + getName() + " did not drop any treasure.");
	    }
	
	    // Handle any other on-death effects here
	}
	
}
