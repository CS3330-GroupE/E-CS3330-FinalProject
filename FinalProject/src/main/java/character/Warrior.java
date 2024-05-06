package character;

/**
 * @author Ethan Alexander
 * 
 *Subclass for character
 * 
 */

public class Warrior extends Character {
		
		public Warrior() {
			super(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.WARRIOR, 0);
			//health = 20
			//level = 1
			//experience = 0
			//dexterity = 4
			//strength = 1
			//intelligence = 4
			//vitality = 4
			//healthPots = 4
			//armorClass = 4
			//equippedWeapon = null
			//equippedEquipment = null
			//classType = Type.WARRIOR
			//inventory = null
		}
		
		public Warrior(Warrior copy) {
			super(copy);
		}

}
