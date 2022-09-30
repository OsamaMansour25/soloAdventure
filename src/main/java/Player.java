public class Player {

   private Room currentRoom;
   private Map map;

    public Player() {
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
}
