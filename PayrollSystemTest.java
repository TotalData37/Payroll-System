// PayrollSystemTest.java – calculates employee pay and adds birthday bonus
//CSIS 212-B02
//No external citations used
package assignmentseven;


public class PayrollSystemTest {
    public static void main(String[] args) {

        // This set the current month for the bonus
        int currentMonth = 5;  // May

        // This uses polumorphism when creating employees
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111",
                         new Date(5, 15, 1980), 800.00);

        employees[1] = new SalariedEmployee("Jane", "Doe", "222-22-2222",
                         new Date(12, 1, 1990), 950.00);

        // This is a loop through employees and calculate pay
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);  // Print currentEmployee

            double earnings = currentEmployee.earnings();

            // A check for currentEmployee birthday for bonus
            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                earnings += 100.00;  // birthday bonus
                System.out.println("Birthday Bonus Applied: +$100.00");
            }

            // Print total earnings
            System.out.printf("Total Earnings: $%.2f%n", earnings);
            System.out.println("----------------------------------");
            System.out.println("David Lyman – Assignment 7\n");
        }
    }
}
