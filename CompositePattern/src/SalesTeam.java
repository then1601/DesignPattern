import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Manager> managers = new ArrayList<>();
    private List<Salesperson> salespersons = new ArrayList<>();

    public void addManager(Manager m) {
        managers.add(m);
    }

    public void addSalesperson(Salesperson s) {
        salespersons.add(s);
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Processing sales team payments:");
        for (Manager m : managers) {
            m.payExpenses(amount);
        }
        for (Salesperson s : salespersons) {
            s.payExpenses(amount);
        }
    }
}