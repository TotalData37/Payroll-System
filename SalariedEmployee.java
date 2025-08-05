// SalariedEmployee.java – subclass of Employee.java for fixed salary workers
//CSIS 212-B02
//No external citations used
package assignmentseven;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String ssn,
                            Date birthDate, double weeklySalary) {
        super(firstName, lastName, ssn, birthDate); 
        this.weeklySalary = weeklySalary;
    }

    // set & get
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    // This allows override of earnings
    @Override
    public double earnings() {
        return weeklySalary;
    }

    // Formats the output.
    @Override
    public String toString() {
        return "Salaried Employee: " + super.toString() +
               "\nWeekly Salary: $" + String.format("%.2f", weeklySalary);
    }
}
