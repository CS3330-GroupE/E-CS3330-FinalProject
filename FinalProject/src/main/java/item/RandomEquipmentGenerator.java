package item;

import java.util.Arrays;
import java.util.EnumMap;
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
        EnumMap<ItemStat, Integer> stats = new EnumMap<>(ItemStat.class);
        switch (equipmentType) {
            case "Sword and Shield":
                stats.put(ItemStat.STRENGTH, 6);
                stats.put(ItemStat.DEXTERITY, 1);
                stats.put(ItemStat.INTELLIGENCE, 1);
                stats.put(ItemStat.VITALITY, 6);
                break;
            case "Steel Armor":
                stats.put(ItemStat.STRENGTH, 5);
                stats.put(ItemStat.DEXTERITY, 1);
                stats.put(ItemStat.INTELLIGENCE, 1);
                stats.put(ItemStat.VITALITY, 7);
                break;
            case "Bow":
                stats.put(ItemStat.STRENGTH, 1);
                stats.put(ItemStat.DEXTERITY, 7);
                stats.put(ItemStat.INTELLIGENCE, 3);
                stats.put(ItemStat.VITALITY, 3);
                break;
            case "Leather Armor":
                stats.put(ItemStat.STRENGTH, 2);
                stats.put(ItemStat.DEXTERITY, 5);
                stats.put(ItemStat.INTELLIGENCE, 2);
                stats.put(ItemStat.VITALITY, 5);
                break;
            case "Magic Staff":
                stats.put(ItemStat.STRENGTH, 2);
                stats.put(ItemStat.DEXTERITY, 2);
                stats.put(ItemStat.INTELLIGENCE, 7);
                stats.put(ItemStat.VITALITY, 3);
                break;
            case "Magic Robes":
                stats.put(ItemStat.STRENGTH, 1);
                stats.put(ItemStat.DEXTERITY, 3);
                stats.put(ItemStat.INTELLIGENCE, 7);
                stats.put(ItemStat.VITALITY, 3);
                break;
        }

        // This adds prefix modifier
        if (prefix.equals("Beginner")) {
            
        	for (ItemStat stat : stats.keySet()) {
                stats.put(stat, stats.get(stat) + 2);
            }
        } else if (prefix.equals("Intermediate")) {
            
        	for (ItemStat stat : stats.keySet()) {
                stats.put(stat, stats.get(stat) + 4);
            }
        } else if (prefix.equals("Expert")) {
            
        	for (ItemStat stat : stats.keySet()) {
                stats.put(stat, stats.get(stat) + 6);
            }
            
        } else if (prefix.equals("Legendary")) {
            
        	for (ItemStat stat : stats.keySet()) {
                stats.put(stat, stats.get(stat) + 10);
            }
        }

        // This adds suffix modifier
        if (suffix.equals("of Strength")) {
            stats.put(ItemStat.STRENGTH, stats.get(ItemStat.STRENGTH) + 3);
            
        } else if (suffix.equals("of Dexterity")) {
            stats.put(ItemStat.DEXTERITY, stats.get(ItemStat.DEXTERITY) + 3);
            
        } else if (suffix.equals("of Intelligence")) {
            stats.put(ItemStat.INTELLIGENCE, stats.get(ItemStat.INTELLIGENCE) + 3);
            
        } else if (suffix.equals("of Vitality")) {
            stats.put(ItemStat.VITALITY, stats.get(ItemStat.VITALITY) + 3);
        }

        
        //creates the item and returns it
        if ("Sword and Shield".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A sword and shield that can be equipped as a weapon.", stats);
            
        } else if ("Steel Armor".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A steel armor set that can be used as equipment.", stats);
            
        } else if ("Bow".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A sturdy bow that can be equipped as a weapon. It even comes with arrows!", stats);
            
        } else if ("Leather Armor".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A leather armor set that can be used as equipment.", stats);
            
        } else if ("Magic Staff".equals(equipmentType)) {
            return ItemFactory.createItem("Weapon", name, "A shimmering staff that can be equipped as a weapon.", stats);
            
        } else if ("Magic Robes".equals(equipmentType)) {
            return ItemFactory.createItem("Equipment", name, "A set of magical robes that can be used as equipment.", stats);
            
        } else {
            return null; 
        }
    }


}

