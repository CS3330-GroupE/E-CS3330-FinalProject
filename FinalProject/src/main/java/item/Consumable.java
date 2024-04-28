package item;

class Consumable extends Item {


	public Consumable(String name, String description) {

	}

	public void useItem(Character character, Inventory inventory) {
	  if (inventory.getItems().contains(this)) {
	      inventory.removeItem(this);
	      System.out.println("You used the " + name);
	  } 
	  
	  else {
	      System.out.println("You don't have a " + name + " in your inventory.");
	  }
	}
}
    

