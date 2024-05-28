package com.task;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Iterate through the characters of the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--)
        {
            // Append each character to the reversed string
            reversed += input.charAt(i);
        }

        // Printing the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
