// Employee.java – Base class for all Employees
//CSIS 212-B02
//No external citations used
package assignmentseven;

 public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    // This is a constructor.
    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.birthDate = birthDate;
    }

    // This is a get methods.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

 // This returns string.
    public String toString() {
        return firstName + " " + lastName + "\nSSN: " + socialSecurityNumber +
               "\nBirth Date: " + birthDate;
    }

 // This is an abstract method to override.
    public abstract double earnings();
}
