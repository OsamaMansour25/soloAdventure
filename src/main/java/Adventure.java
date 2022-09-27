import java.util.ArrayList;

public class Adventure {
    Room currentRoom;
    // TODO: Find ud af hvordan man får player indført her. Ville godt kunne skrive map.get også bliver indekset af map.get
    // det rum man befinder sig i.
    private String player;

    public Adventure() {
        Room room1 = new Room(1, "Første rum");
        Room room2 = new Room(2, "Andet rum");
        Room room3 = new Room(3, "Tredje rum");
        Room room4 = new Room(4, "Fjerde rum");
        Room room5 = new Room(5, "Femte rum");
        Room room6 = new Room(6, "Sjette rum");
        Room room7 = new Room(7, "Syvende rum");
        Room room8 = new Room(8, "Ottende rum");
        Room room9 = new Room(9, "Ninende rum");


        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setWest(room7);
        room8.setEast(room9);
        room8.setNorth(room5);
        room9.setWest(room8);
        room9.setNorth(room6);

        currentRoom = room1;


    }

    public boolean goNorth() {
        if (currentRoom.getRoomNorth() == null) {

            return false;
        } else {
            currentRoom = currentRoom.getRoomNorth();
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getRoomWest() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomWest();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getRoomEast() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomEast();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getRoomSouth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomSouth();
            return true;
        }
    }

    public String look() {
        return currentRoom.getRoomNumber() + currentRoom.getRoomInfo();
    }
}


