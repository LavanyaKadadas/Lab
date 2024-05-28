package com.task;
import java.util.Scanner;

public class PerimeterMenuDriven {
    public static void main(String []args) 
    {
        int choice;
        // Displaying the menu options
        System.out.println("Enter a choice:\n 1. Perimeter of Square \n 2. Perimeter of Rectangle \n 3. Perimeter of Circle");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        
        switch(choice) 
        {
            case 1:
                double side;
                // Getting input for the side of the square
                System.out.println("Enter a side of Square");
                side=sc.nextDouble();
                double perimeter;
                // Calculating perimeter of square
                perimeter=4*side;
                // Printing the perimeter of square
                System.out.println("The Perimeter of Square is:"+perimeter);
                break;
            case 2:
                double length, breadth, perimeter1;
                // Getting input for length and breadth of rectangle
                System.out.println("Enter Length and Breadth of the rectangle");
                length=sc.nextDouble();
                breadth=sc.nextDouble();
                // Calculating perimeter of rectangle
                perimeter1=2*(length+breadth);
                // Printing the perimeter of rectangle
                System.out.println("The Perimeter of rectangle is :"+perimeter1);
                break;
            case 3:
                double radius, perimeter2;
                // Getting input for the radius of the circle
                System.out.println("Enter radius of a circle: ");
                radius=sc.nextDouble();
                // Calculating perimeter of circle
                perimeter2=2*3.14*radius; // Assuming pi as 3.14
                // Printing the perimeter of circle
                System.out.println("The Perimeter Of Circle is :"+perimeter2);
                break;
            default:
                // Handling invalid choice
                System.out.println("Enter a valid number");
        }
    }
}
