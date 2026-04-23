public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("Charlie", m1);
        Salesperson s2 = new Salesperson("David", m1);
        Salesperson s3 = new Salesperson("Eve", m2);

        SalesTeam team = new SalesTeam();
        team.addManager(m1);
        team.addManager(m2);
        team.addSalesperson(s1);
        team.addSalesperson(s2);
        team.addSalesperson(s3);

        System.out.println("=== Paying Individual Manager Alice ===");
        m1.payExpenses(100);

        System.out.println("\n=== Paying Entire Sales Team ===");
        team.payExpenses(50);
    }
}