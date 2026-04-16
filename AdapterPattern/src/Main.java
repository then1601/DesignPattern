// Main.java
public class Main {
    public static void main(String[] args) {
        // Sử dụng các calculator đã có (tuân thủ IPriceCalculator)
        IPriceCalculator carCalc = new CarPriceCalculator();
        IPriceCalculator truckCalc = new TruckPriceCalculator();

        System.out.println("Car price: " + carCalc.calculatePrice());
        System.out.println("Truck price: " + truckCalc.calculatePrice());

        // Sử dụng Adapter để tính giá xe UK
        UKCarPriceCalculator ukCalc = new UKCarPriceCalculator();
        IPriceCalculator ukAdapter = new UKCarPriceAdapter(ukCalc);

        System.out.println("UK Car price (via adapter): " + ukAdapter.calculatePrice());
    }
}