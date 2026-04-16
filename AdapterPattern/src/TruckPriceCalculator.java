public class TruckPriceCalculator implements IPriceCalculator {
    private double basePrice = 2000.0;

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}