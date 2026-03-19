
public class MainApp {
	 public static void main(String[] args) {

	        Bedroom bedroom = new BedroomBuilder()
	                .setBedCount(2)
	                .setWallColor("Blue")
	                .setArea(25.5)
	                .setHasTV(true)
	                .setHasAC(true)
	                .setHasBalcony(true)
	                .setWindowCount(3)
	                .setFloorMaterial("Wood")
	                .build();

	        System.out.println(bedroom);

	        Architect architect = new Architect();
	        KitchenBuilder kitchenBuilder = new KitchenBuilder();

	        architect.setRoomBuilder(kitchenBuilder);

	        House house = architect.constructBasicHouse();

	        System.out.println(house);
	    }
}
