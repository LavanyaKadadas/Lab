package lab; // Define the package name

import java.util.Scanner; // Import Scanner class from java.util package

// Define the Employee class
class Employee 
{
    // Define attributes of Employee class
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Constructor to initialize the attributes
    Employee(String name, int yearOfJoining, double salary, String address) 
    {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee information
    void displayInfo() 
    {
        System.out.printf("%-10s %-18d %-10.2f %s%n", name, yearOfJoining, salary, address);
    }
}

// Main class to run the program
public class Employee_details 
{
    // Main method, entry point of the program
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Taking input for employee1
        System.out.println("Enter details for Employee 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Year of Joining: ");
        int yearOfJoining1 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Address: ");
        String address1 = scanner.nextLine();

        // Taking input for employee2
        System.out.println("\nEnter details for Employee 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Year of Joining: ");
        int yearOfJoining2 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Address: ");
        String address2 = scanner.nextLine();

        // Taking input for employee3
        System.out.println("\nEnter details for Employee 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Year of Joining: ");
        int yearOfJoining3 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary3 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Address: ");
        String address3 = scanner.nextLine();

        // Creating Employee objects
        Employee employee1 = new Employee(name1, yearOfJoining1, salary1, address1);
        Employee employee2 = new Employee(name2, yearOfJoining2, salary2, address2);
        Employee employee3 = new Employee(name3, yearOfJoining3, salary3, address3);

        // Displaying employee information header
        System.out.printf("%-10s %-18s %-10s %s%n", "Name", "Year of Joining", "Salary", "Address");
        
        // Displaying employee information using displayInfo method
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();

        scanner.close(); // Closing Scanner object to release resources
    }
}
