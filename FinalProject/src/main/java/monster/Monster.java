package monster;

import character.Character;


import java.util.Random;
import item.Item;
import item.Inventory;
import item.RandomEquipmentGenerator;

/** 
 * @author Brian Bluhm
 * Builds methods and operations for Monsters and monster-related actions
 * Methods for monster creation, attacking and combat, taking damage, determining loot drops and setting monster difficulty
 */

public class Monster {
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
    private String title;

	/**
     	* Monster class constructor for use as enemies in the game.
      	* Subclasses for various different monsters
     	* @param name - monster name, Zombie, Goblin, Orc, or Dragon
     	* @param level - monster level, displayed on spawn, determines statline
     	* @param health - Value depleted on attack, monster dies at 0 health
     	* @param attack - Value used in attack and combat methods
     	* @param damage - Set value, used in attack and combat methods, determines damage dealt to players
     	* @param defense - Value used in attack and combat methods, determines if damage is dealt to players
     	* @param title - Monster descriptor displayed during spawn, informs players on monster capability
     	*/
    public Monster(String name, int level, int health, int attack, int damage, int defense, String title) {
    	super();
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.damage = damage;
        this.defense = defense;
        this.title = "wild";
       
    }
    
    //Getters and setters
    public String getName() {
        return name;
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

    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack) {
		this.attack = attack;
	}

    public int getDamage() {
        return damage;
    }
    
    public void setDamage(int damage) {
		this.damage = damage;
	}

    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
		this.defense = defense;
	}
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    /** 
    * Combat method to roll an attack value, compare against character armor, then do damage
    * @param A created monster object, takes monster's statline
    * @param A created character object, uses player's statline
    * Alters currently active objects' health values when used
    */
    public void attack(Monster monster, Character character) {
    	Random rng = new Random();
        int attackValue = rng.nextInt(25) + 1; // Max attack value up for discussion

	//determines nature of attack based on random roll
        if (attackValue >= character.getArmorClass()) {
        	switch (attackValue) { 
        	   case 25: 
		    //critical damage bonus of x2
        	    int damage = (monster.getDamage() * 2);
		    //method call for dealing player damage
                    playerTakeDamage(character , damage);
                    System.out.println(monster.getName() + " critically strikes you for " + damage + " damage!");
                    break;
        	default:
		    //grabs monster damage value
        	    damage = monster.getDamage();
		    //method call for dealing player damage
                    playerTakeDamage(character, damage);
                    System.out.println(monster.getName() + " attacks you for " + damage + " damage!");
                    break;
        	}
        } else {
            switch (attackValue) { 
            	case 1: 
			//critical miss display message
            		System.out.println("The " + monster.getName() + " dramatically trips and falls to the floor!");
            		break;
            	default:
			//miss display message
            		System.out.println("The " + monster.getName() + "'s attack missed!");
            		break;
            }
        }
    }

    /** 
    * Combat method called in Monster.attack, reduced player's health value by monster damage
    * @param A created player object, uses player health value
    * @param damage integer, reduces health by that amount
    */
    public void playerTakeDamage(Character player, int damage) {
    	int health = player.getHealth();
    	
    	health = health - damage;
    	if(health < 0) {
    		player.setHealth(0);
    	}
    	else {
    		player.setHealth(health);
    	}
    }
    
    /** 
    * Combat method called in Character.attack, reduced monster's health value by player damage
    * @param A created monster object, uses monster's health value
    * @param damage integer, reduces health by that amount
    */
    public void takeDamage(int damage) {
       health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
	
    /** 
    * Combat method called in HelperFunctions.Combat, determines if monster is dead
    * @param A created monster object, uses monster's health value
    * @return returns true if monster healh reaches 0, false if otherwise
    */
    public boolean isDead(Monster monster) {
        if(monster.getHealth() > 0) {
            return false;
        } 
        return true;
    }
	
    /** 
    * Spawning method called in Mechanics.mainMenuHandler, boosts stats of the monster object when spawned
    * @param A created monster object, alters monster's stats
    * @param A created character object, uses character's level
    */
    public void levelBoost(Monster monster, Character character) {
        //Get the character's level
        int characterLevel = character.getLevel();

        //Increase the monster's level based on the character's level
        monster.setLevel(monster.getLevel() + characterLevel);

        //Increase health and damage based on the character's level
        monster.setHealth(monster.getHealth() + 5 * characterLevel);
        monster.setDamage(monster.getDamage() + 2 * characterLevel);

        //Roll a random number between 1 and 10
        int roll = (int) (Math.random() * 10) + 1;

        //Check the roll result
        if (roll >= 8 && roll <= 9) {
            //Elite monster: Increase level by 2 and defense by 1
            monster.setLevel(monster.getLevel() + 2);
            monster.setHealth(monster.getHealth() + 2 * 5);
            monster.setDamage(monster.getDamage() + 2 * 2);
            monster.setDefense(monster.getDefense() + 1);
            monster.setTitle("Elite");
        } else if (roll == 10) {
            //Boss monster: Increase level by 3, defense and attack by 1
            monster.setLevel(monster.getLevel() + 3);
            monster.setHealth(monster.getHealth() + 3 * 5);
            monster.setDamage(monster.getDamage() + 3 * 2);
            monster.setDefense(monster.getDefense() + 1);
            monster.setAttack(monster.getAttack() + 1);
            monster.setTitle("Boss");
        }
    }
	
	/** 
        * loot drop method called in Monster.onDeath, determines randomized item dropping on monster death
        * @return returns a random Item object, or nothing on an unlucky roll
        */
	public Item dropTreasure() {
	    Random rng = new Random();
	    //Generate a drop chance
	    int dropRNG = rng.nextInt(5);

	    //If the drop value is not 0 or 1, drop a random item
	    if (dropRNG >=2) {
	        return RandomEquipmentGenerator.generateRandomEquipment();
	    } else {
	        return null; //No item dropped
	    }
	}

	/** 
        * gold drop method called in Monster.onDeath, determines randomized gold dropping on monster death
        * @return returns an amount of gold on monster death
        */
	public int dropGold() {
		Random rng = new Random();
		//Generate random gold number
		int gold = rng.nextInt(30 + 1) + 11;
		
		return gold;
	}
	
	/** 
        * exp drop method called in Monster.onDeath, determines randomized experience points dropping on monster death
        * @return returns an amount of exp on monster death
        */
	public double dropEXP() {
	    Random rng = new Random();
	    //Generate a random amount of exp between 10 and 29
	    int baseExp = rng.nextInt(20) + 10; 
	    return baseExp;
	}
	
	/** 
        * loot drop method called in Mechanics.battleMenuHandler, loot drops once monster is determined to be dead
        * @param A created character object, alters character attributes like gold and exp
	* @param A created inventory object, displays a random item object to console, adds that item to character inventory
        */
	public void onDeath(Character character,Inventory inventory) {
	    //loot methods called
	    double exp = dropEXP();
	    Item treasure = dropTreasure();
	    int gold = dropGold();

	    //gameplay messages displayed to console describes monster, and amount of gold and exp
	    System.out.println("The " + getName() + " has been defeated!");
	    System.out.println("You gained " + exp + " experience points.");
	    System.out.println("You also find " + gold + " gold on the " + getName() +".");

	    //player gold and exp stats altered
	    character.setGold(character.getGold() + gold);
	    character.setExperience(exp + character.getExperience());

	    //player levels up upon reaching 100 experience
	    if(character.getExperience() >= 100) {
	    	character.levelUp();
	    }

	    //gameplay messages diplayed to console describes item dropped, or nothing on unlucky roll
	    if (treasure != null) {
	        System.out.println("The " + getName() + " dropped " + treasure.getName());
		//adds item object to inventory object
	        inventory.addItem(treasure);
	    } else {
	        System.out.println("The " + getName() + " did not drop any treasure.");
	    }
	}

	/** 
        * console display method, called in HelperFunctions.Combat, shows player current monster health
        */
	public void checkMonsterHealth() {
		System.out.print("\nThe "+ getName() +"'s current health is " + this.getHealth()+"\n");
	}
}
