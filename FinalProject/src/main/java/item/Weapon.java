package item;

import character.Character;

public class Weapon extends Item {

	public Weapon(String name, String description, int strength, int vitality, int dexterity, int intelligence, int armorClass) {
		this.name = name;
		this.description = description;
		this.strength = strength;
		this.vitality = vitality;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.armorClass = armorClass;
	}

	public void useItem(Character character) {
		System.out.println("Nothing happens");
	}

	public void equip(Character character, Inventory inventory) {

		if (inventory.getItems().contains(this)) {
			inventory.addItem(character.getEquippedWeapon());
			character.setEquippedWeapon(this);
			inventory.removeItem(this);
			System.out.println("You equipped the " + name);
			character.updateStats(character);
		} else {
			System.out.println("You don't have " + name + " in your inventory.");
		}

	}
}
