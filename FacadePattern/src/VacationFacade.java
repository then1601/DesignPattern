import java.util.Date;

public class VacationFacade {
    private CarRental carRental;
    private HotelBooking hotelBooking;
    private FlightArrangement flightArrangement;

    public VacationFacade() {
        this.carRental = new CarRental();
        this.hotelBooking = new HotelBooking();
        this.flightArrangement = new FlightArrangement();
    }

    public void bookCompleteVacation(String destination, String hotel, String from, Date dates, int nights) {
        System.out.println("Starting to book a complete vacation package...");
        flightArrangement.bookFlight(from, destination, dates);
        hotelBooking.reserveRoom(hotel, nights);
        carRental.bookCar(destination, dates);
        System.out.println("Vacation package booking completed!");
    }
}