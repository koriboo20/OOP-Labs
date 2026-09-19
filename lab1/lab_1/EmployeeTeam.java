package lab_1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

   
    private void printDetails(Employee e) {
        System.out.println(e.getFirstName() + " " + e.getLastName()
                + ", salary: " + e.getSalary());
    }

    public void printEmployeeDetails() {
        printDetails(employee);
    }

    public void printAllEmployeesDetails() {
        printDetails(boss);
        printDetails(employee);
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        updateIfNameMatches(boss, firstname, newSalary);
        updateIfNameMatches(employee, firstname, newSalary);
    }

    private void updateIfNameMatches(Employee e, String firstname, double newSalary) {
        if (e.getFirstName().equals(firstname)) {
            e.setSalary(newSalary);  
        }
    }

    public void giveRaiseToAllEmployees() {
        boss.giveRaise(10);
        employee.giveRaise(10);
    }
}
