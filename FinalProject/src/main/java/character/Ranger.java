package character;

/**
 * @author Ethan Alexander
 * 
 *Subclass for character
 * 
 */

public class Ranger extends Character {
	
	public Ranger() {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, Type.RANGER, 0);
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
		//classType = Type.RANGER
	}
	
	public Ranger(Ranger copy) {
		super(copy);
	}

}
