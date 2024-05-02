package item;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    //adds item to inventory list
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added " + item.getName() + " to your inventory.");
    }

    //removes item from inventory list
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Removed " + item.getName() + " from your inventory.");
        } else {
            System.out.println(item.getName() + " is not in your inventory.");
        }
    }
    
//getter 
    public List<Item> getItems() {
        return items;
    }

//displays items in the inventory and gives index number
    public void displayInventory() {
        System.out.println("Inventory:");
        if (items.isEmpty()) {
            System.out.println(" (Your invetory is empty.)");
        } else {
        	int indexNumber = 0;
            for (Item item : items) {
            	indexNumber ++;
                System.out.println(" (" + indexNumber + ") " + item.getName());
            }
        }
    }
}