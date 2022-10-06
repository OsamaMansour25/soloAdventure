import java.util.ArrayList;

public class Room {
    // Vi starter med at oprette alle de variabler vi har brug for.
    // Vi laver roomNorth, roomSouth osv fordi at vi skal have en variabel der siger at hvis vi f.eks. er i rum 1, så er rum 2 den der er roomEast.
    // Altså hvis vi går east fra rum 1 så lander vi i rum 2 som befinder sig der.
    private Integer roomNumber;
    private String roomInfo;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomWest;
    private Room roomEast;
    private ArrayList<Items> items = new ArrayList();

    // Vi laver en constructor der hedder Room som indeholder både nummeret af rummet og også en beskrivelse af rummet.
    public Room(Integer roomNumber, String roomInfo) {
        this.roomNumber = roomNumber;
        this.roomInfo = roomInfo;
    }

    // Vi laver get metoden til hver eneste variabel så vi kan bruge dem i Adventure classen. Vi laver en metode der hedder getRoomNorth() som bare returnere variablen
    // som vi oprettede tidligere som hedder roomNorth. Så altså bare en metode (get) som henter variablen roomNorth. Det gør vi så for alle variabler.
    public Room getRoomNorth() {
        return roomNorth;
    }

    public Room getRoomSouth() {
        return roomSouth;
    }

    public Room getRoomWest() {
        return roomWest;
    }

    public Room getRoomEast() {
        return roomEast;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    // Her laver vi set metoden. Metoden vil have et parameter af typen "room" derfor hedder den Room (typen) og et eller andet navn for den type. Navnet kan være hvad som helst
    // Det betyder ikke noget i denne sammenhæng. Derefter siger vi at f.eks. roomEast svarer til parameteren i metoden.
// F.eks. kunne vi skrive room1.setRoomEast(room2) Det betyder at room1's roomEast er room2, på den måde har vi sammensat
    // forbindelsen mellem dem. Går man east fra room 1 så kommer man til room 2.
    // Denne metode laver vi til hver retning vi har.
    public void setRoomNorth(Room room) {
        this.roomNorth = room;
    }

    public void setRoomSouth(Room room) {
        this.roomSouth = room;
    }

    public void setRoomWest(Room room) {
        this.roomWest = room;
    }

    public void setRoomEast(Room room) {
        this.roomEast = room;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void removeItem(Items item) {
        items.remove(item);
    }

    public Items searchItems(String itemName) {
        for (Items n : items) {
            if (n.getNameOfItem().equalsIgnoreCase(itemName)) {
                return n;
            }
        }
        return null;

    }


        }

