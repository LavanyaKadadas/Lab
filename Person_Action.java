package lab;

// Define the Person interface
interface Person 
{
    // Method to speak, to be implemented by classes implementing this interface
    void speak();
}

// Implement the Person interface in the Student_Data class
class Student_Data implements Person 
{
    // Override the speak method to specify the behavior for students
    @Override
    public void speak() 
    {
        System.out.println("I am a student.");
    }
}

// Implement the Person interface in the Teacher class
class Teacher implements Person
{
    // Override the speak method to specify the behavior for teachers
    @Override
    public void speak() 
    {
        System.out.println("I am a teacher.");
    }
}

public class  Person_Action 
{
    public static void main(String[] args) 
    {
        // Create objects of Student_Data and Teacher classes
        Student_Data student = new Student_Data();
        Teacher teacher = new Teacher();

        // Call the speak method of both objects
        student.speak(); // Output: "I am a student."
        teacher.speak(); // Output: "I am a teacher."
    }
}
