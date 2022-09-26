import java.util.ArrayList;

public class Adventure {
    private ArrayList<Room>map;
    Room currentRoom;
    // TODO: Find ud af hvordan man får player indført her. Ville godt kunne skrive map.get også bliver indekset af map.get
    // det rum man befinder sig i.
    private String player;

    public Adventure() {
        public void createMap() {
            this.map = new ArrayList<Room>();
            map.add(new Room(1, "This is the first room, its cold"));
            map.add(new Room(2, "Second"));
            map.add(new Room(3, "Third"));
            map.add(new Room(4, "Fourth"));
            map.add(new Room(5, "Fifth"));
            map.add(new Room(6, "Sixth"));
            map.add(new Room(7, "Seventh"));
            map.add(new Room(8, "Eighth"));
            map.add(new Room(9, "Nineth. This is the finale room"));
            IndexOf(map) = currentRoom;

        }
    }
}
