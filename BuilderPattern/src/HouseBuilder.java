
public class HouseBuilder {
	private House house;

    public HouseBuilder() {
        reset();
    }

    public void reset() {
        house = new House();
    }

    public void addRoom(Room room) {
        house.addRoom(room);
    }

    public void setFloors(int floors) {
        house.setFloors(floors);
    }

    public House build() {
        return house;
    }
}
