import java.util.ArrayList;

public class Map {
    private Room starterRoom;

    public Map() {
        // Vi opretter alle rummene med deres nummer og beskrivelse.
        Room room1 = new Room(1, "Første rum");
        Room room2 = new Room(2, "Andet rum");
        Room room3 = new Room(3, "Tredje rum");
        Room room4 = new Room(4, "Fjerde rum");
        Room room5 = new Room(5, "Femte rum");
        Room room6 = new Room(6, "Sjette rum");
        Room room7 = new Room(7, "Syvende rum");
        Room room8 = new Room(8, "Ottende rum");
        Room room9 = new Room(9, "Ninende rum");

// Her bruger vi vores set metode og laver forbindelserne mellem alle rummene
        // F.eks. så siger første linje at room1's RoomEast er room2. Så hvis brugeren skriver east mens brugeren er i room1 så kommer man til room2.
        room1.setRoomEast(room2);
        room1.setRoomSouth(room4);
        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room5.setRoomSouth(room8);
        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);
        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room8.setRoomWest(room7);
        room8.setRoomEast(room9);
        room8.setRoomNorth(room5);
        room9.setRoomWest(room8);
        room9.setRoomNorth(room6);
        starterRoom = room1;

        // Items
        room1.getItems().add(new Items("Bright lamp"));
        room2.getItems().add(new Items("lol"));
        room3.getItems().add(new Items("Candle"));
        room4.getItems().add(new Items("Map"));
        room5.getItems().add(new Items("Samurai sword"));
        room6.getItems().add(new Items("Samurai sword"));
        room7.getItems().add(new Items("Elixir"));
        room8.getItems().add(new Items("Golden key"));
        room9.getItems().add(new Items("Old trophy"));

        // Food
        room1.getItems().add(new Food("Apple", +10));



    }
    public Room getStarterRoom() {
        return starterRoom;

    }
}

