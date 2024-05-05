package item;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventoryTest {
	 Inventory inventory = new Inventory();


    @Test
    public void testAddItem() {
        Item weapon = new Weapon("Sword", "A powerful sword", 10, 0, 0, 0, 0);
        inventory.addItem(weapon);
        assertTrue(inventory.getItems().contains(weapon));
    }

    @Test
    public void testRemoveItem() {
        Item weapon = new Weapon("Axe", "A sharp axe", 12, 0, 0, 0, 0);
        inventory.addItem(weapon);
        inventory.removeItem(weapon);
        assertFalse(inventory.getItems().contains(weapon));
    }

    @Test
    public void testDisplayInventory() {
        Item weapon1 = new Weapon("Sword", "", 10, 0, 0, 0, 0);
        Item weapon2 = new Weapon("Staff", "", 8, 0, 0, 0, 0);
        inventory.addItem(weapon1);
        inventory.addItem(weapon2);
        inventory.displayInventory();
        assertTrue(inventory.getItems().contains(weapon1));
    }
}