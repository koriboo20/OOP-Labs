package lab_1;

public class EmployeeTest {
    public static void main(String[] args) {
        // Part 1: one employee, read and modify every attribute
        Employee e = new Employee("Ada", "Lovelace", 3000);
        System.out.println("Initial: " + e.getFirstName() + " " + e.getLastName()
                + ", salary " + e.getSalary());

        e.setFirstName("Grace");
        e.setLastName("Hopper");
        e.setSalary(4000);
        System.out.println("After valid updates: " + e.getFirstName() + " "
                + e.getLastName() + ", salary " + e.getSalary());

        e.setSalary(-500);
        System.out.println("After setSalary(-500): " + e.getSalary());   
        e.setSalary(0);
        System.out.println("After setSalary(0): " + e.getSalary());      

        Employee a = new Employee("Alan", "Turing", 3000);   
        Employee b = new Employee("Linus", "Torvalds");      
        b.setSalary(2500);

        System.out.println("\nYearly salaries:");
        System.out.println(a.getFirstName() + ": " + a.getYearlySalary());   
        System.out.println(b.getFirstName() + ": " + b.getYearlySalary());   

        
        a.giveRaise(10);
        b.giveRaise(10);

        System.out.println("\nYearly salaries after 10% raise:");
        System.out.println(a.getFirstName() + ": " + a.getYearlySalary());   
        System.out.println(b.getFirstName() + ": " + b.getYearlySalary());   
    }
}