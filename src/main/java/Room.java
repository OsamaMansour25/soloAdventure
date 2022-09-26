public class Room {
    private Integer roomNumber;
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
}