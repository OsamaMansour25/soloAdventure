import java.util.ArrayList;

public class Player {
private Integer health = 100;
    private Room currentRoom;
    private Map map;
    private ArrayList<Items> inventory;

    public Player() {
        inventory = new ArrayList<>();
        map = new Map();
        setCurrentRoom(map.getStarterRoom());

    }

    // Her laver vi en metode der hedder look som bare returnere rummets informationer. Vi printer metoden senere så brugeren kan få informationer omkring det rum man er i.
    public String look() {
        return currentRoom.getRoomNumber() + currentRoom.getRoomInfo();

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String printInventory() {

        return inventory.toString();
    }

    public boolean takeItem(String itemName) {
        boolean itemTaken = false;
        Items item = currentRoom.searchItems(itemName);
        if (item != null) {
            inventory.add(item);
            currentRoom.removeItem(item);
            itemTaken = true;
        }
        return itemTaken;
    }
    public Items searchInventory(String itemName) {
        for (Items n : inventory) {
            if (n.getNameOfItem().equalsIgnoreCase(itemName)) {
                return n;
            }
        }
        return null;

    }


    public boolean dropItem(String itemName) {
        boolean itemDropped = false;
        Items item = searchInventory(itemName);
        if (item != null) {
            inventory.remove(item);
            itemDropped = true;
        }
        return itemDropped;
    }
    public Integer gethealth() {
       return health;
    }
}


