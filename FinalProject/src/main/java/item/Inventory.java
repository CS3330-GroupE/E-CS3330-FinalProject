package item;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added " + item.getName() + " to your inventory.");
    }

    public void removeItem(Item item) {

    }

    public List<Item> getItems() {
        return items;
    }


    public void displayInventory() {
        System.out.println("Inventory:");
        if (items.isEmpty()) {
            System.out.println("  (Your invetory is empty)");
        } else {
            for (Item item : items) {
                System.out.println(" " + item.getName() + " ");
            }
        }
    }
}