public class CarPriceCalculator implements IPriceCalculator {
    private double basePrice = 1000.0;

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}