package lab;// package name
import java.util.Scanner;// importing Scanner class for user input
public class StringReverse 
{
	public static void main(String[] args)// main method
	{
		Scanner scanner = new Scanner(System.in);// creating a new Scanner object
	    System.out.print("Enter a string to reverse: ");// prompting user to enter a string
	    String input = scanner.nextLine();// reading the user input
	    scanner.close(); // closing the Scanner object
	    String reversed = "";// initializing an empty string to store the reversed string
	    for (int i = input.length() - 1; i >= 0; i--) // iterating through the input string from end to start
	    {
	    	reversed += input.charAt(i);// adding each character to the reversed string
	    }
	    System.out.println("Reversed string: " + reversed);// printing the reversed string
	}
}

 