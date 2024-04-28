package item;


public class ItemFactory {

    // Creates a random item using Random Equipment Generator
    public static Item createRandomItem() {
        Item randomItem = RandomEquipmentGenerator.generateRandomEquipment();
        return randomItem;
    }

    // Allows creation of custom items (can be used for default items)
    public static Item createItem(String type, String name, String description, int strength, int vitality, int dexterity, int intelligence) {
        switch (type) {
            case "Weapon":
                return new Weapon(name, description, strength, vitality, dexterity, intelligence);
            case "Equipment":
                return new Equipment(name, description, strength, vitality, dexterity, intelligence);
            case "Consumable":
                return new Consumable(name, description);
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}

