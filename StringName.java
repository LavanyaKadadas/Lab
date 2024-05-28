package lab;
import java.util.Scanner;
public class StringName
{
   public static void main(String[] args) 
   {
	   // List of student names
	   String[] studentNames = {"lavanya", "shrutika", "anjali", "ritu", "sneha"};
	   // Getting the student name to search from the user
	   System.out.println("Enter the student name to search: ");
	   Scanner scanner = new Scanner(System.in);
	   String searchName = scanner.nextLine();
	   // Flag to check if the name is found
	   boolean isFound = false;
	   // Loop through the array to search for the name
	   for (String name : studentNames)
	   {
		   if (name.equals(searchName)) 
		   {
			   isFound = true;
	           break;
	       }
		}
	   // Print the result
	        if (isFound)
	        {
	            System.out.println(searchName + " is found in the list.");
	        } 
	        else 
	        {
	            System.out.println(searchName + " is not found in the list.");
	        }
	    }
}
