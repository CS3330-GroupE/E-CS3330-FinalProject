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
