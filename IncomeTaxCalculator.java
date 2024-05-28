package com.task;
import java.util.Scanner;

import java.util.Scanner;

public class IncomeTaxCalculator 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Accepting name of the employee
        System.out.print("Enter the name of the employee: ");
        String name = scanner.nextLine();

        // Accepting annual income of the employee
        System.out.print("Enter the annual income of the employee: ");
        double income = scanner.nextDouble();

        // Calculating income tax and storing the result in the tax
        double tax = calculateIncomeTax(income);

        // Displaying the name of the employee and the calculated income tax
        System.out.println("Name: " + name);
        System.out.println("Income Tax: ₹" + tax);
    }

    // Function to calculate income tax
    public static double calculateIncomeTax(double income)
    {
        double tax = 0;

        // Applying income tax rates based on salary
        if (income <= 250000) 
        {
            // No tax for income up to ₹2,50,000
            tax = 0;
        }
        else if (income <= 500000) 
        {
            // 10% tax on income exceeding ₹2,50,000 up to ₹5,00,000
            tax = 0.1 * (income - 250000);
        } 
        else if (income <= 1000000) 
        {
            // ₹30,000 + 20% tax on income exceeding ₹5,00,000 up to ₹10,00,000
            tax = 30000 + 0.2 * (income - 500000);
        }
        else 
        {
            // ₹50,000 + 30% tax on income exceeding ₹10,00,000
            tax = 50000 + 0.3 * (income - 1000000);
        }
        return tax; // Returning the calculated income tax
    }
}
