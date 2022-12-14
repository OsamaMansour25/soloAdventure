import java.util.ArrayList;

public class Player {
    private Integer health = 100;
    private Room currentRoom;
    private Map map;
    private ArrayList<Items> inventory;
    private ArrayList<Food> food;
    private Weapons equippedWeapon;
    private Enemy currentEnemy;

    public Player() {
        inventory = new ArrayList<>();
        map = new Map();
        setCurrentRoom(map.getStarterRoom());
        food = new ArrayList<>();



    }

    // Her laver vi en metode der hedder look som bare returnere rummets informationer. Vi printer metoden senere så brugeren kan få informationer omkring det rum man er i.
    public String look() {
        return currentRoom.getRoomNumber() + currentRoom.getRoomInfo();

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setEquippedWeapon(Weapons equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
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

    public void removeItemFromInventory(Items item) {
        inventory.remove(item);
    }

    public Items searchInventory(String itemName) {
        for (Items n : inventory) {
            if (n.getNameOfItem().equalsIgnoreCase(itemName)) {
                return n;

            }
        }
        return null;

    }
    public AttackEnum attack() {
        if (equippedWeapon instanceof Weapons) {
            currentEnemy.setHealth(currentEnemy.getHealth()- equippedWeapon.getDamage());
            return equippedWeapon.attack();
        } else if (currentRoom.getEnemy() != null) {
            currentEnemy.attack();
            health = health - equippedWeapon.getDamage();
            return AttackEnum.ENEMY_ATTACKED;

        } else if(currentEnemy.getHealth() <= 0) {
            currentEnemy.enemyDefeated();
            return AttackEnum.ENEMY_DEFEATED;
        } else if(health <= 0) {
            return AttackEnum.PLAYER_DEFEATED;
        }
        else return AttackEnum.NO_WEAPON_EQUIPPED;
    }


    public WeaponEnum equipWeapon(String itemName) {
        Items equipWeapons = searchInventory(itemName);
        if (equipWeapons == null) {
            return WeaponEnum.NOT_FOUND;
        } else if (equipWeapons instanceof Weapons) {
            currentRoom.removeItem(equipWeapons);
            setEquippedWeapon((Weapons) equipWeapons);
            return WeaponEnum.WEAPON;

        } else
            return WeaponEnum.NOT_FOUND;
    }



    public boolean dropItem(String itemName) {
        boolean itemDropped = false;
        Items item = searchInventory(itemName);
        if (item != null) {
            inventory.remove(item);
            currentRoom.addItem(item);
            itemDropped = true;
        }
        return itemDropped;
    }
    public FoodEnum consumeFood(String itemName) {
        Items consumeItem = searchInventory(itemName);
        if (consumeItem == null) {
            return FoodEnum.NOT_FOUND;

        } else if (consumeItem instanceof Food) {
            setHealth(consumeItem);
            removeItemFromInventory(consumeItem);
            return FoodEnum.FOOD;
        } else
            return FoodEnum.NOT_FOOD;
    /* TODO: Find ud af hvorfor den ikke fjerner item
    public boolean eatItemFromInv(String itemName) {
        boolean itemConsumed = false;
        Items item = searchInventory(itemName);
        if (item instanceof Food) {
            inventory.remove(item);
            itemConsumed = true;
        }
        return itemConsumed;
    }
// TODO: Find ud af hvorfor den ikke fjerner item
    public boolean eatItemFromRoom(String itemName) {
        boolean itemConsumed = false;
        Items item = currentRoom.searchItems(itemName);
        if (item instanceof Food) {
            currentRoom.getItems().remove(itemName);
            itemConsumed = true;
        }
        return itemConsumed;
    } */
    }


    public Integer gethealth() {
        return health;
    }

public void setHealth(Items item) {
        if (item instanceof Food) {
            this.health += 20;
        }
        if (health > 100) {
            health = 100;
        }
}
public Weapons getEquippedWeapon() {
        return equippedWeapon;
}
public Enemy getCurrentEnemy() {
        return currentEnemy;
}

}
    /* TODO: Health editor, fjern hp eller tilføj hp når du spiser
    public boolean editsHp(String itemName) {
        boolean editsHp = false;
        Items item = searchInventory(itemName);
        if(item instanceof Food);
        health =
    }

    */