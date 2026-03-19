
public class Architect {
	private RoomBuilder roomBuilder;
    private HouseBuilder houseBuilder;

    public Architect() {
        houseBuilder = new HouseBuilder();
    }

    public void setRoomBuilder(RoomBuilder builder) {
        this.roomBuilder = builder;
    }

    public Room constructBasicRoom() {
        roomBuilder.reset();
        roomBuilder.buildStructure();
        roomBuilder.buildUtilities();
        return roomBuilder.build();
    }

    public House constructBasicHouse() {
        houseBuilder.reset();
        houseBuilder.setFloors(1);

        Room room = constructBasicRoom();
        houseBuilder.addRoom(room);

        return houseBuilder.build();
    }
}
