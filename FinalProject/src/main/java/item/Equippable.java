package item;

public interface Equippable {
    void equip(Character character, Inventory inventory);
    void unequip(Character character, Inventory inventory);
}
