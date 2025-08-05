Payroll System

This is a Java-based payroll system developed as part of CSIS 212-B02 coursework. It demonstrates the use of object-oriented programming principles such as inheritance, polymorphism, and encapsulation to calculate employee earnings, including a birthday bonus.

Project Structure 

Payroll-System/
├── Date.java                // Date class for birthdates
├── Employee.java            // Abstract class defining the employee structure
├── SalariedEmployee.java    // Subclass for salaried employees
├── PayrollSystemTest.java   // Main application logic
├── *.class                  // Compiled bytecode files
├── README.md                // Project documentation

💡 Features
Object-oriented design using abstract and concrete classes
Calculates weekly earnings for salaried employees
Adds a $100 birthday bonus if the employee's birth month matches the current month
Demonstrates polymorphism via a superclass array
Clean, console-based output with formatted pay details

🛠️ Getting Started
✅ Prerequisites
Java Development Kit (JDK) 8 or later
Text editor or IDE (e.g. IntelliJ, Eclipse, VS Code)

📦 Installation
Clone this repository or download the source files.
Open a terminal and navigate to the project directory.
Compile all .java files: javac *.java
Run the application: java PayrollSystemTest

Sample Output
Name: John Smith
SSN: 111-11-1111
Birth Date: 5/15/1980
Birthday Bonus Applied: +$100.00
Total Earnings: $900.00
----------------------------------
David Lyman – Assignment 7

Name: Jane Doe
SSN: 222-22-2222
Birth Date: 12/1/1990
Total Earnings: $950.00
----------------------------------
David Lyman – Assignment 7

🧠 Concepts Demonstrated
Encapsulation with private fields and getters/setters
Inheritance through SalariedEmployee extending Employee
Polymorphism using a superclass reference array
Conditionals to apply bonuses based on birth month
Formatted console output

🚫 License
This project is for academic purposes and is not licensed for commercial use.

Author: David Lyman
Assignment: 7
No external citations used
