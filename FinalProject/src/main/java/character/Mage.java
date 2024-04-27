package character;

public class Mage extends Character {
	
	public Mage() {
		super(20, 1, 0, 4, 1, 4, 4, 4, null, null, Type.MAGE);
		//health = 20
		//level = 1
		//experience = 0
		//dexterity = 4
		//strength = 1
		//intelligence = 4
		//vitality = 4
		//healthPots = 4
		//equippedWeapon = null
		//equippedEquipment = null
		//classType = Type.MAGE
	}
	
	public Mage(Mage copy) {
		super(copy);
	}
}
