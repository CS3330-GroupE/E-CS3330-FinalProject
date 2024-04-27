package character;

import item.Item;

public class Warrior extends Character {

	public Warrior(int health, int level, int experience, int dexterity, int strength, int intelligence, 
				   int vitality, int healthPots, Item equippedWeapon, Item equippedEquipment, Type classType) {
		 
		
		super(/*health*/20, /* level*/1, /*XP*/0, /*dexterity*/4, /*strength*/1, 
				/*intelligence*/4, /*vitality*/4, /*starting # health pot*/4, /*weapon*/null, /* */null, /*Expresses class type*/Type.WARRIOR);
	}
	
	public Warrior(Character copy) {
		super(copy);
		// TODO Auto-generated constructor stub
	}

}
