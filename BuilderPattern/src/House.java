import java.util.ArrayList;
import java.util.List;

public class House {
	private List<Room> rooms = new ArrayList<>();
    private int floors;

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House with " + floors + " floors and rooms: " + rooms.size();
    }
}
