package character;

public class Warrior extends Character {
		
		public Warrior() {
			super(20, 1, 0, 4, 1, 4, 4, 4, 4, null, null, Type.WARRIOR, null);
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
