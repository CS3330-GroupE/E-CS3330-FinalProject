package item;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


//generates items with random attributes and names
public class RandomEquipmentGenerator {
    private static List<String> EQUIPMENT_TYPES = Arrays.asList(
              "Sword and Shield", "Steel Armor", "Bow", "Leather Armor", "Magic Staff", "Magic Robes"
    );
    private static List<String> SUFFIXES = Arrays.asList(
            "of Strength", "of Dexterity", "of Intelligence", "of Vitality"
    );
    
    private static Random RANDOM = new Random();
    
    //generates a random number from 1-100 and selects a prefix based on result
    private static String getPrefix() {
        int randomValue = RANDOM.nextInt(100) + 1; 

        if (randomValue <= 50) {
            return "Beginner";
            
        } else if (randomValue <= 80) {
            return "Intermediate";
            
        } else if (randomValue <= 95) {
            return "Expert";
            
        } else {
            return "Legendary";
        }
    }
    
    //makes a random item giving name based on prefix, type, and suffix rolls. 
    public static Item generateRandomEquipment() {
        String equipmentType = EQUIPMENT_TYPES.get(RANDOM.nextInt(EQUIPMENT_TYPES.size()));
        String prefix = getPrefix();
        String suffix = SUFFIXES.get(RANDOM.nextInt(SUFFIXES.size()));
        String name = prefix + " " + equipmentType + " " + suffix;
    
        
        //enumMap should be 0 by default and this sets based on equipmentType

        int strength = 0;
        int vitality = 0;
        int dexterity = 0;
        int intelligence = 0;

        switch (equipmentType) {
            case "Sword and Shield":
                strength = 6;
                dexterity = 1;
                intelligence = 1;
                vitality = 6;
                break;
            case "Steel Armor":
                strength = 5;
                dexterity = 1;
                intelligence = 1;
                vitality = 7;
                break;
            case "Bow":
                strength = 1;
                dexterity = 7;
                intelligence = 3;
                vitality = 3;
                break;
            case "Leather Armor":
                strength = 2;
                dexterity = 5;
                intelligence = 2;
                vitality = 5;
                break;
            case "Magic Staff":
                strength = 2;
                dexterity = 2;
                intelligence = 7;
                vitality = 3;
                break;
            case "Magic Robes":
                strength = 1;
                dexterity = 3;
                intelligence = 7;
                vitality = 3;
                break;
        }

        // This adds prefix modifier
        if (prefix.equals("Beginner")) {
            strength += 2;
            vitality += 2;
            dexterity += 2;
            intelligence += 2;
        } else if (prefix.equals("Intermediate")) {
            strength += 4;
            vitality += 4;
            dexterity += 4;
            intelligence += 4;
        } else if (prefix.equals("Expert")) {
            strength += 6;
            vitality += 6;
            dexterity += 6;
            intelligence += 6;
        } else if (prefix.equals("Legendary")) {
            strength += 10;
            vitality += 10;
            dexterity += 10;
            intelligence += 10;
        }

        // This adds suffix modifier
        if (suffix.equals("of Strength")) {
            strength += 3;
        } else if (suffix.equals("of Dexterity")) {
            dexterity += 3;
        } else if (suffix.equals("of Intelligence")) {
            intelligence += 3;
        } else if (suffix.equals("of Vitality")) {
            vitality += 3;
        }
        
     // Creates the item and returns it
        if ("Sword and Shield".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A sword and shield that can be equipped as a weapon.", strength, vitality, dexterity, intelligence);
        } else if ("Steel Armor".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A steel armor set that can be used as equipment.", strength, vitality, dexterity, intelligence);
        } else if ("Bow".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A sturdy bow that can be equipped as a weapon. It even comes with arrows!", strength, vitality, dexterity, intelligence);
        } else if ("Leather Armor".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A leather armor set that can be used as equipment.", strength, vitality, dexterity, intelligence);
        } else if ("Magic Staff".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A shimmering staff that can be equipped as a weapon.", strength, vitality, dexterity, intelligence);
        } else if ("Magic Robes".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A set of magical robes that can be used as equipment.", strength, vitality, dexterity, intelligence);
        } else {
            return null;
        }
    }


}

