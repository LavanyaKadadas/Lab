package java_internship;

import java.util.Scanner;

public class LoanEligibilityChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Is the person a citizen of INDIA? (true/false): ");
        boolean isIndianCitizen = scanner.nextBoolean();

        if (salary > 50000 && isIndianCitizen)
        {
            System.out.println("Congratulations! The person is eligible for a loan.");
        } else {
            System.out.println("Sorry, the person is not eligible for a loan.");
        }
    }
}
