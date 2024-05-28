package lab;

import java.util.Scanner;

public class FindMinMax
{
    public static void main(String[] args) 
    {
        // Created a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Created an array to store the integers
        int[] numbers = new int[10];

        // Prompting the user to input ten integers
        System.out.println("Enter ten integers:");

        // Reading the integers from the user and store them in the array
        for (int i = 0; i < 10; i++)
        {
            // Prompting the user to enter an integer
            System.out.print("Enter integer " + (i + 1) + ": ");
            // Reading the integer input and store it in the array
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Find the smallest and largest values in the array
        int smallest = numbers[0];
        int largest = numbers[0];

        // Iterate through the array to find the smallest and largest values
        for (int number : numbers)
        {
            // Check if the current number is smaller than the smallest found so far
            if (number < smallest) 
            {
                // Update the smallest value
                smallest = number;
            }
            // Check if the current number is larger than the largest found so far
            if (number > largest) 
            {
                // Update the largest value
                largest = number;
            }
        }

        // Print the smallest and largest values
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
