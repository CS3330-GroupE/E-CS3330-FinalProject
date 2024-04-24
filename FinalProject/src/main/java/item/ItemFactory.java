package item;

import java.util.EnumMap;

public class ItemFactory {
    
	//Creates a random item using Random Equipment Generator 
	public static Item createRandomItem() {
        Item randomItem = RandomEquipmentGenerator.generateRandomEquipment();
        return randomItem;
    }
	//allows creation of custom items (can be used for default items)
    public static Item createItem(String type, String name, String description, EnumMap<ItemStat, Integer> stats) {
        switch (type) {
            case "Weapon":
                return new Weapon();
            case "Equipment":
                return new Equipment();
            case "Consumable":
                return new Consumable();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
        
    }
}


