public class UKCarPriceAdapter implements IPriceCalculator {
    private UKCarPriceCalculator ukCarPriceCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator uk) {
        this.ukCarPriceCalculator = uk;
    }

    @Override
    public double calculatePrice() {
    	return ukCarPriceCalculator.getPrice();
    }
}