package item;

class Equipment extends Item implements Equippable {
    
	public Equipment(String name, String description, int strength, int vitality, int dexterity, int intelligence) {

	}

	public void useItem(Character character) {
        System.out.println("Cannot use equipment as an item.");
    }

    public void equip(Character character, Inventory inventory) {
		/*
		 * if (inventory.getItems().contains(this)) {
		 * character.getEquipment().add(this); inventory.removeItem(this);
		 * System.out.println("You equipped the " + name); character.updateStats(stats);
		 * } else { System.out.println("You don't have " + name +
		 * " in your inventory."); }
		 */
    }

    public void unequip(Character character, Inventory inventory) {
		/*
		 * if (character.getEquipment().contains(this)) {
		 * character.getEquipment().remove(this); inventory.addItem(this);
		 * System.out.println("You unequipped the " + name); character.updateStats(); }
		 * else { System.out.println("You don't have " + name + " equipped."); }
		 */
    }
}
