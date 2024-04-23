package item;

class Equipment extends Item implements Equippable {
    
	public void useItem(Character character) {
        System.out.println("Cannot use equipment as an item.");
    }

    public void equip(Character character, Inventory inventory) {

    }

    public void unequip(Character character, Inventory inventory) {

    }
}