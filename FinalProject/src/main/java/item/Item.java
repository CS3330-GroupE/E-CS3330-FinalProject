package item;

import java.util.EnumMap;

abstract class Item {
    protected String name;
    protected String type;
    protected String description;
    protected EnumMap<ItemStat, Integer> stats;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public EnumMap<ItemStat, Integer> getStats() {
        return stats;
    }

    public void examineItem() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Stats: " + stats);
    }

    public void takeItem(Item item, Inventory inventory) {
        inventory.addItem(item);
    }
}
