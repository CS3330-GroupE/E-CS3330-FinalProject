package item;


public abstract class Item {
    protected String name;
    protected String type;
    protected String description;
    protected int strength;
    protected int vitality;
    protected int dexterity;
    protected int intelligence;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void examineItem() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Strength: " + strength);
        System.out.println("Vitality: " + vitality);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
    }

    public void takeItem(Item item, Inventory inventory) {
        inventory.addItem(item);
    }
}