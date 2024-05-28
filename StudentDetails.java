package lab;
import java.util.Scanner;

// Student class representing a basic student with roll number and name.
class Student 
{
    private int rollNumber;
    private String name;

    // Constructor to initialize roll number and name.
    public Student(int rollNumber, String name) 
    {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details.
    public void display() 
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

// MarksDetails class extending Student class to include marks details.
class MarksDetails extends Student 
{
    private int[] marks = new int[5]; // Array to store marks of 5 subjects.

    // Constructor to initialize roll number and name through superclass constructor.
    public MarksDetails(int rollNumber, String name) 
    {
        super(rollNumber, name);
    }

    // Method to accept marks for 5 subjects.
    public void acceptMarks()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to display total marks and percentage.
    public void displayResult() 
    {
        int totalMarks = 0;
        for (int mark : marks)
        {
            totalMarks += mark;
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + (totalMarks / 5.0));
    }
}

 
public class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting roll number and name from the user.
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // Creating an instance of MarksDetails class with roll number and name.
        MarksDetails student = new MarksDetails(rollNumber, name);
        student.acceptMarks(); // Accepting marks for 5 subjects from the user.

        // Displaying student details and result.
        System.out.println("\nStudent Details:");
        student.display();
        System.out.println("\nResult:");
        student.displayResult();
    }
}



