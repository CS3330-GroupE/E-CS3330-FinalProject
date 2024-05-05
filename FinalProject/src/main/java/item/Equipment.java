package item;
/**
 * This Equipment class is made for the creation of items to be equipped to the player character
 * in their equippedEquipment slot with emphasis on increasing armor class.
 * 
 * @author Jonathan Hatfield
 * 
 * 
 */
public class Equipment extends Item {

	public Equipment(String name, String description, int strength, int vitality, int dexterity, int intelligence, int armorClass) {
		this.name = name;
		this.description = description;
		this.strength = strength;
		this.vitality = vitality;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.armorClass = armorClass;
	}
}
