import java.util.Date;

public class VacationClient {
    public static void main(String[] args) {
        VacationFacade vacationFacade = new VacationFacade();
        
        System.out.println("=== Booking a vacation to Paris ===");
        vacationFacade.bookCompleteVacation("Paris", "The Ritz", "Hanoi", new Date(), 5);
        
        System.out.println("\n=== Booking a vacation to New York ===");
        vacationFacade.bookCompleteVacation("New York", "Marriott", "Saigon", new Date(), 7);
    }
}