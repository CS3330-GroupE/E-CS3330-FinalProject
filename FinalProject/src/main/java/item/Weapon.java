package item;

class Weapon extends Item implements Equippable {
    
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
		/*
		 * if (inventory.getItems().contains(this)) {
		 * character.equippedWeapon().add(this); inventory.removeItem(this);
		 * System.out.println("You equipped the " + name); character.updateStats(stats);
		 * } else { System.out.println("You don't have " + name +
		 * " in your inventory."); }
		 */
	}

    public void unequip(Character character, Inventory inventory) {
		/*
		 * if (character.equippedWeapon().contains(this)) {
		 * character.equippedWeapon().remove(this); inventory.addItem(this);
		 * System.out.println("You unequipped the " + name); character.updateStats(); }
		 * else { System.out.println("You don't have " + name + " equipped."); }
		 */
    }
}
