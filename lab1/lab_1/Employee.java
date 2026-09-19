package lab_1;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;   

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(salary);   
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getYearlySalary() {
        return salary * 12;
    }

    public void giveRaise(double percent) {
        setSalary(salary * (1 + percent / 100));
    }
}