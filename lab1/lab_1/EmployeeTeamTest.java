package lab_1;

public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("Ada", "Lovelace", 5000);
        Employee worker = new Employee("Alan", "Turing", 3000);
        EmployeeTeam team = new EmployeeTeam(boss, worker);

        System.out.println("--- printEmployeeDetails ---");
        team.printEmployeeDetails();

        System.out.println("\n--- printAllEmployeesDetails ---");
        team.printAllEmployeesDetails();

        System.out.println("\n--- update Alan to 3500 (valid) ---");
        team.updateSalaryOfEmployee("Alan", 3500);
        team.printAllEmployeesDetails();

        System.out.println("\n--- update Ada to -100 (invalid, no change) ---");
        team.updateSalaryOfEmployee("Ada", -100);
        team.printAllEmployeesDetails();

        System.out.println("\n--- update Ada to 0 (invalid, no change) ---");
        team.updateSalaryOfEmployee("Ada", 0);
        team.printAllEmployeesDetails();

        System.out.println("\n--- update unknown name (no change) ---");
        team.updateSalaryOfEmployee("Bob", 9999);
        team.printAllEmployeesDetails();

        System.out.println("\n--- both share a first name: both should update ---");
        EmployeeTeam sameName = new EmployeeTeam(
                new Employee("Sam", "Boss", 6000),
                new Employee("Sam", "Worker", 2000));
        sameName.updateSalaryOfEmployee("Sam", 7000);
        sameName.printAllEmployeesDetails();

        System.out.println("\n--- 10% raise for everyone ---");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}