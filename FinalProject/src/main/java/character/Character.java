package character;

import monster.Monster;
import item.Item;
import java.util.Random;



/**
 * @author Ethan Alexander
 * 
 * This is the implementation of the main actor in the program. Contains methods for the character to enact in game.
 * Also contains many background methods that are use to keep track of stats as the player progresses through the game. 
 * 
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
	protected int baseDexterity;
	protected int baseStrength;
	protected int baseIntelligence;
	protected int baseVitality;
	protected int baseHealthPots;
	protected int baseArmorClass;
	
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
                    break;	
        		default:
        			damage = getPlayerDamage(character);
        			monster.takeDamage(damage);
        			System.out.println("You strike the " + monster.getName() + " for " + damage + " damage!");
        			break;
        		}
        } else {
        	switch (attackValue) { 
            	case 1: 
            		System.out.println("You miss, dramatically tripping and falling to the floor!");
            		break;
            	default:
            		System.out.println("Your attack missed!");
            		break;
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
	
	//increases players health by 4 if players health isn't full already and if the player has health potions
	public void usePotion() {
		//players current health
		int newHealth = this.getHealth();
		
		//checks if player has health potions
		if(this.getHealthPots() > 0) {
			
			//this part checks if the players health is below their maximum health depending on their subclass. 
			//if so, adds four to health
			if(this.getClassType() == Type.MAGE && newHealth < (this.getBaseHealth() + this.getVitality())) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! ");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else if(this.getClassType() == Type.RANGER && newHealth < (this.getBaseHealth() + this.getVitality())) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! ");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else if(this.getClassType() == Type.WARRIOR && newHealth < (this.getBaseHealth() + this.getVitality())) {
				this.setHealth(newHealth + 4);
				System.out.print("\nYou healed for 4 HP! ");
				this.setHealthPots(this.getHealthPots() - 1);
			}
			else {
				System.out.print("\nUnable to use Health Potion. Health is already full!\n");
				return;
			}
			
			//checks if player is full health
			if(this.getHealth() >= (this.getBaseHealth() + this.getVitality())) {
				System.out.print("\nYou've completely healed! ");
			}
			
			//if players health exceeds their maximum health, the health gets reset to the players maximum health 
			//dependent on class
			if(this.getClassType() == Type.MAGE && this.getHealth() >= (this.getBaseHealth() + this.getVitality())) {
				newHealth = 15;
				this.setHealth(baseHealth + this.getVitality());
			}
			if(this.getClassType() == Type.RANGER && this.getHealth() >= (this.getBaseHealth() + this.getVitality())) {
				newHealth = 20;
				this.setHealth(baseHealth + this.getVitality());
			}
			if(this.getClassType() == Type.WARRIOR && this.getHealth() >= (this.getBaseHealth() + this.getVitality())) {
				newHealth = 25;
				this.setHealth(baseHealth + this.getVitality());
			}
				System.out.print("Your current health is " + this.getHealth()+"\n");
		}
		else {
			//default message if player has no health potions
			System.out.print("Drats!!!\n");
		}
		System.out.print("\nYou currently have " + this.getHealthPots() + " health potions...\n");
	}
	
	
	
	
	//prints the users current health
	public void checkHealth () {
		System.out.print("Current health is: " + this.getHealth());
	}
	
	//print operations to gives info on stats
	public void checkStats () {

		
		System.out.print("Current Player Info:\n\n");
		System.out.print("Level: "+ this.getLevel()+"\n");
		System.out.print("Class: " + this.getClassType() + "\n");
		System.out.print("Health: " + this.getHealth() + "\n");
		System.out.print("XP: " + this.getExperience()+ "/100\n");
		System.out.print("Vitality: " + this.getVitality()+ "\n");
		System.out.print("Dexterity: " + this.getDexterity()+ "\n");
		System.out.print("Strength: " + this.getStrength() + "\n");
		System.out.print("Intelligence: " + this.getIntelligence() + "\n");
		
	}
	
	//prints players current equipment
	public void checkEquipment() {
		Item weapon = this.getEquippedWeapon();
		Item equipment = this.getEquippedEquipment();
		
		System.out.print("Weapon: "+weapon.getName() + "\n");
		System.out.print("Equipment: "+equipment.getName() + "\n");
		System.out.print("Armor Class: " + this.getArmorClass() + "\n");
		System.out.print("Current Number of Health Pots: " + this.getHealthPots() + "\n");
		System.out.print("Current Gold: " + this.getGold() + "\n");
	}

	//added by Jonathan Hatfield
	public void updateStats(Character character) {
	    // Reset stats to base
	    resetStats(character);

	    // Update stats with equipped weapon
	    if (equippedWeapon != null) {
	        updateStatsWithItem(equippedWeapon, character);
	    }

	    // Update stats with equipped equipment
	    if (equippedEquipment != null) {
	        updateStatsWithItem(equippedEquipment, character);
	    }
	}
    
	
	//resets all stats to the base stats
    public void resetStats(Character character) {
        character.setDexterity(character.getBaseDexterity());
        character.setStrength(character.getBaseStrength());
        character.setIntelligence(character.getBaseIntelligence());
        character.setVitality(character.getBaseVitality());
        character.setArmorClass(character.getBaseArmorClass());
    }
    
    //will add the item's stats to the base stats and set the flexible stats to their summation
    public void updateStatsWithItem(Item item, Character character) {
        // Update stats with item
        character.setDexterity(character.getDexterity() + item.getDexterity());
        character.setStrength(character.getStrength() + item.getStrength());
        character.setIntelligence(character.getIntelligence() + item.getIntelligence());
        character.setVitality(character.getVitality() + item.getVitality());
        character.setArmorClass(character.getArmorClass() + item.getArmorClass());
    }
	
    //adds 1 to level and updates stats
	public void levelUp () {
		
		System.out.print("\n\nLEVELUP!!\n\n");
		
		//gets level, adds 1 to it, sets xp back to zero, and sets level to newLevel value
		int newLevel = this.getLevel() + 1;
		this.setExperience(0);
		this.setLevel(newLevel);
		
		//class type dictates which stats will increase
		if(this.getClassType() == Type.MAGE) {
			this.setBaseIntelligence(getBaseIntelligence() + 2);
			this.setBaseVitality(getBaseVitality() + 2);
		}
		if(this.getClassType() == Type.WARRIOR) {
			this.setBaseStrength(getBaseStrength() + 2);
			this.setBaseVitality(getBaseVitality() + 2);
		}
		if(this.getClassType() == Type.RANGER) {
			this.setBaseDexterity(getBaseDexterity() + 2);
			this.setBaseVitality(getBaseVitality() + 2);
		}
		
		//updates stats based on new current base stats plus equipment stats
		if(this.getEquippedEquipment() != null && this.getEquippedWeapon() != null) {
			updateStats(this);
		}
		//changes max health based on all the changes above
		this.updateHealth();
	}

	//creates the base stats for players
	 public void setBaseStats(Character character) {
		 	Type type = character.getClassType();
	        switch (type) {
	            
	        	case MAGE:
	                setBaseMageStats();
	                break;
	            
	            case RANGER:
	                setBaseRangerStats();
	                break;
	           
	            case WARRIOR:
	                setBaseWarriorStats();
	                break;
	            
	            default:
	            	
	                break;
	        }
	    }
	 
	    private void setBaseMageStats() {
	    	this.setBaseHealth(10);
	        this.setBaseDexterity(7);
	        this.setBaseStrength(7);
	        this.setBaseIntelligence(7);
	        this.setBaseVitality(7);
	        this.setBaseHealthPots(3);
	        this.setBaseArmorClass(7);
	    }

	   private void setBaseRangerStats() {
	        this.setBaseHealth(12);
	        this.setBaseDexterity(6);
	        this.setBaseStrength(6);
	        this.setBaseIntelligence(6);
	        this.setBaseVitality(6);
	        this.setBaseHealthPots(3);
	        this.setBaseArmorClass(6);
	    }

	    private void setBaseWarriorStats() {
	    	this.setBaseHealth(15);
	    	this.setBaseDexterity(5);
	    	this.setBaseStrength(5);
	    	this.setBaseIntelligence(5);
	    	this.setBaseVitality(5);
	    	this.setBaseHealthPots(3);
	    	this.setBaseArmorClass(5);
	    }
	
	
	//checks if the player is dead, returns true if so
	public boolean isDeadPlayer(Character character) {
		if(character.getHealth() > 0) {
			return false;
		}
		return true;
	}
	
	//based on class returns the current value that governs that classes damage
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
	
	//updates health based on base health and vitality
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
	public int getBaseHealth() {
		return baseHealth;
	}

	public void setBaseHealth(int baseHealth) {
		this.baseHealth = baseHealth;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getBaseDexterity() {
		return baseDexterity;
	}

	public void setBaseDexterity(int baseDexterity) {
		this.baseDexterity = baseDexterity;
	}

	public int getBaseStrength() {
		return baseStrength;
	}

	public void setBaseStrength(int baseStrength) {
		this.baseStrength = baseStrength;
	}

	public int getBaseIntelligence() {
		return baseIntelligence;
	}

	public void setBaseIntelligence(int baseIntelligence) {
		this.baseIntelligence = baseIntelligence;
	}

	public int getBaseVitality() {
		return baseVitality;
	}

	public void setBaseVitality(int baseVitality) {
		this.baseVitality = baseVitality;
	}

	public int getBaseHealthPots() {
		return baseHealthPots;
	}

	public void setBaseHealthPots(int baseHealthPots) {
		this.baseHealthPots = baseHealthPots;
	}

	public int getBaseArmorClass() {
		return baseArmorClass;
	}

	public void setBaseArmorClass(int baseArmorClass) {
		this.baseArmorClass = baseArmorClass;
	}


}
