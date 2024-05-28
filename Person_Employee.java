package lab; // Define the package name

import java.util.Scanner; // Import Scanner class from java.util package

// Abstract class for Person details
abstract class Person_details 
{
    int id;
    String name;
    double salary;

    // Constructor to initialize the attributes
    Person_details(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to display details, to be implemented by subclasses
    abstract void displayDetails();
}

// Subclass Manager extending Person_details
class Manager extends Person_details
{
    String department;

    // Constructor for Manager class
    Manager(int id, String name, double salary, String department) 
    {
        super(id, name, salary); // Call superclass constructor
        this.department = department;
    }

    // Override displayDetails method to display Manager details
    @Override
    void displayDetails() 
    {
        System.out.println("Manager Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}

// Subclass Employee1 extending Person_details
class Employee1 extends Person_details 
{
    String designation;

    // Constructor for Employee1 class
    Employee1(int id, String name, double salary, String designation) 
    {
        super(id, name, salary); // Call superclass constructor
        this.designation = designation;
    }

    // Override displayDetails method to display Employee1 details
    @Override
    void displayDetails() 
    {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Designation: " + designation);
    }
}

// Main class to run the program
public class Person_Employee 
{
    // Main method, entry point of the program
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Taking input for Manager
        System.out.println("Enter details for Manager:");
        System.out.print("ID: ");
        int managerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        // Create Manager object
        Manager manager = new Manager(managerId, managerName, managerSalary, managerDepartment);

        // Taking input for Employee1
        System.out.println("\nEnter details for Employee:");
        System.out.print("ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Salary: ");
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Designation: ");
        String employeeDesignation = scanner.nextLine();

        // Create Employee1 object
        Employee1 employee = new Employee1(employeeId, employeeName, employeeSalary, employeeDesignation);

        scanner.close(); // Closing Scanner object to release resources

        // Display Manager and Employee details
        System.out.println();
        manager.displayDetails();
        System.out.println();
        employee.displayDetails();
    }
}
