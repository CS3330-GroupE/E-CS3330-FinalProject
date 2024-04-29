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
    //Combat method to roll an attack value, compare against character armor, then do damage
    public void attack(Monster monster, Character character) {
        int attackValue = rng.nextInt(10) + 1; // Max attack value up for discussion

        if (attackValue >= character.getArmorClass()) {
        	switch (attackValue) { 
        		case 10: 
        			int damage = (monster.getDamage() * 2);
                    character.takeDamage(damage);
                    System.out.println(monster.getName() + " critically strikes you for " + damage + " damage!");
        		default:
        			damage = monster.getDamage();
                    character.takeDamage(damage);
                    System.out.println(monster.getName() + " attacks you for " + damage + " damage!");
        	}
        } else {
            switch (attackValue) { 
            	case 1: 
            		System.out.println("The " + monster.getName() + "dramatically trips and falls to the floor!");
            	default:
            		System.out.println("The " + monster.getName() + "'s attack missed!");
            }
        }
    }
    
    //Call to take damage, sets overkill damage to 0
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
	
    //Call to check monster health and call drops when killed
    boolean isDead(Monster monster) {
        if(monster.getHealth() > 0) {
            return false;
        } else {
        	monster.onDeath();
        }
        return true;
    }
	
	//Applies bonuses to monster stats based on level
	boolean levelBoost() {
		return true;
	}
	
	//********************
	//Mechanics upon monster death
	//Random item drops
	public Item dropTreasure() {
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
	    int baseExp = rng.nextInt(20) + 10; // Generate a random two-digit integer between 10 and 29
	    double bonusExp = getLevel() * 0.2; // Apply a bonus based on the level of the monster
	    return baseExp * bonusExp;
	}
	
	//onDeath method to drop kill rewards, runs from isDead method
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
	
	//********************
	//Monster subclasses and mechanics below this point
	public class Zombie extends Monster {
	    public Zombie() {
	        super("Zombie", 15, 0, 5, 5, 0);
	    }
	    
	    //Zombie special mechanics

	    @Override
	    public void attack() {
	        // Zombie's attack behavior
	    }
	}
	
	public class Goblin extends Monster {
	    public Goblin() {
	        super("Goblin", 8, 0, 5, 3, 3);
	    }
	    
	    //Goblin special mechanics

	    @Override
	    public void attack() {
	        // Goblin's attack behavior
	    }
	}

	public class Orc extends Monster {
	    public Orc() {
	        super("Orc", 20, 1, 6, 8, 2);
	    }

	    @Override
	    public void attack() {
	        // Orc's attack behavior
	    }
	}

	public class Dragon extends Monster {
	    public Dragon() {
	        super("Dragon", 35, 2, 7, 12, 3);
	    }
	    
	    //Dragon special mechanics

	    @Override
	    public void attack() {
	        // Zombie's attack behavior
	    }
	}
	
	//Non-combat event generation TDO
	

	//********************
	//Monster spawning and randomization mechanics below this point
	public void randomBackend() {
		rng = new Random();
	}
		
	public int randomizer() {
		int spawnID = rng.nextInt(10);
			
		return spawnID;
	}
	
	//Spawning decision switch case
	public Monster spawnMonster() {
	    int spawnID = randomizer();
	    switch (spawnID) {
	        case 0:
	            return new Zombie();
	        case 1:
	            return new Zombie();
	        case 2:
	            return new Zombie();
	        case 3:
	            return new Zombie();
	        case 4:
	            return new Goblin();
	        case 5:
	            return new Goblin();
	        case 6:
	            return new Goblin();
	        case 7:
	            return new Orc();
	        case 8:
	            return new Orc();
	        case 9:
	            return new Dragon();
	        case 10:
	            return new Dragon();
	        
	        default:
	            return new Dragon(); // Default to Dragon if spawnID is out of range
	    }
	}
}
