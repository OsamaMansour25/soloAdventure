public class Player {

    private Map map;
    // Room currentRoom;

    public Player() {
         map = new Map();
        // map.startRoom = currentRoom; Hvorfor virker denne metode ikke? TODO:

    }

    // Her laver vi en metode for at brugeren kan bevæge sig fra rum til rum.
    // Metoden siger, at hvis currentRoom (det rum man er i) ikke har en RoomNorth så returnerer metoden en boolean der er false
    // Og ellers så bliver currentRoom til currentRoom's RoomNorth. Altså bevæger man sig fra rummet man er i til rummet nord fra det rum man var i.
    // Denne metode gentages for alle retninger.

    public boolean goNorth() {

        if (map.currentRoom.getRoomNorth() == null) {

            return false;
        } else {
            map.currentRoom = map.currentRoom.getRoomNorth();
            return true;

        }
    }

    public boolean goWest() {
        if (map.currentRoom.getRoomWest() == null) {
            return false;
        } else {
            map.currentRoom = map.currentRoom.getRoomWest();
            return true;
        }
    }

    public boolean goEast() {
        if (map.currentRoom.getRoomEast() == null) {
            return false;
        } else {
            map.currentRoom = map.currentRoom.getRoomEast();
            return true;
        }
    }

    public boolean goSouth() {
        if (map.currentRoom.getRoomSouth() == null) {
            return false;
        } else {
            map.currentRoom = map.currentRoom.getRoomSouth();
            return true;
        }
    }

    // Her laver vi en metode der hedder look som bare returnere rummets informationer. Vi printer metoden senere så brugeren kan få informationer omkring det rum man er i.
    public String look() {
        return map.currentRoom.getRoomNumber() + map.currentRoom.getRoomInfo();
    }
}
