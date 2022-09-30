import java.util.ArrayList;

public class Adventure {
    private Player player;
    private Map map;


    public Adventure() {
        player = new Player();
        map = new Map();
        player.setCurrentRoom(map.getStarterRoom());
        // Her laver vi en metode for at brugeren kan bevæge sig fra rum til rum.
        // Metoden siger, at hvis currentRoom (det rum man er i) ikke har en RoomNorth så returnerer metoden en boolean der er false
        // Og ellers så bliver currentRoom til currentRoom's RoomNorth. Altså bevæger man sig fra rummet man er i til rummet nord fra det rum man var i.
        // Denne metode gentages for alle retninger.
    }
        public boolean goNorth() {

            if (player.getCurrentRoom().getRoomNorth() == null) {
                return false;
            } else {
                player.setCurrentRoom(player.getCurrentRoom().getRoomNorth());
                return true;

            }
        }

        public boolean goWest() {
            if (player.getCurrentRoom().getRoomWest() == null) {
                return false;
            } else {
                player.setCurrentRoom(player.getCurrentRoom().getRoomWest());
                return true;
            }
        }

        public boolean goEast() {
            if (player.getCurrentRoom().getRoomEast() == null) {
                return false;
            } else {
                player.setCurrentRoom(player.getCurrentRoom().getRoomEast());
                return true;
            }
        }

        public boolean goSouth() {
            if (player.getCurrentRoom().getRoomSouth() == null) {
                return false;
            } else {
                player.setCurrentRoom(player.getCurrentRoom().getRoomSouth());
                return true;
            }
        }
// Vi angiver hvor brugeren starter.


    }



