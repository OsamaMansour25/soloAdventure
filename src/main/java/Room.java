public class Room {
    private Integer roomNumber;
    private Integer currentRoom;
    private String roomInfo;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomWest;
    private Room roomEast;
public Room(Integer roomNumber, String roomInfo) {
    this.roomNumber = roomNumber;
    this.roomInfo = roomInfo;
}
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
public void setEast(Room room) {
    this.roomEast = room;

}
public void setSouth(Room room) {
    this.roomSouth = room;
}
public void setNorth(Room room) {
    this.roomNorth = room;
}
public void setWest(Room room) {
    this.roomWest = room;
}
}