package lab;
import java.util.Scanner;

//Class representing functionality to check whether a given number is an Armstrong number or not.
public class Armstrong_Number_Class 
{
 // Method to calculate whether a given number is an Armstrong number or not.
 public void calculate(int number) 
 {
     int originalNumber = number; // Store the original number for comparison.
     int remainder;
     int sum = 0;

     // Calculate sum of cubes of each digit in the number.
     while (number != 0) 
     {
         remainder = number % 10;
         sum += Math.pow(remainder, 3);
         number /= 10;
     }

     // Check if the calculated sum is equal to the original number.
     if (sum == originalNumber) 
     {
         System.out.println("Armstrong Number");
     } 
     else 
     {
         System.out.println("Not Armstrong Number");
     }
 }

 // Main method to take user input and test ArmstrongNumber class.
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int userInput = scanner.nextInt(); // Read user input.
     Armstrong_Number_Class armstrongNumber = new Armstrong_Number_Class();
     armstrongNumber.calculate(userInput); // Check if the input is an Armstrong number.
     scanner.close();
 }
}

