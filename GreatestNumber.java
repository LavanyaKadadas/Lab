package java_internship;
import java.util.Scanner;


public class GreatestNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
      
        if (num1 > num2)
        {
            if (num1 > num3) 
            {
                System.out.println("The greatest number is: " + num1);
            } 
            else 
            {
                System.out.println("The greatest number is: " + num3);
            }
        }
        else 
        {
            if (num2 > num3) 
            {
                System.out.println("The greatest number is: " + num2);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        }
        
        
    }
}
