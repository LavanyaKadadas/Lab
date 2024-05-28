package lab;
import java.util.Scanner;
public class CapitalizeWord 
{
	public static void main(String []args) 
	{
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare variables to store input string and the capitalized string
        String str;
        String str_capital = "";
        
        // Prompt the user to enter a string
        System.out.println("Enter a String");
        
        // Read the input string
        str = sc.nextLine();
        
        // Capitalize the first character of the input string
        str_capital = str_capital + str.substring(0, 1).toUpperCase();
        
        // Print message indicating the string with capitalization process is starting
        System.out.println("String with capitalize");
        
        // Loop through each character of the input string
        for(int i = 1; i < str.length(); i++)
        {
            // If the previous character is a whitespace
            if(Character.isWhitespace(str.charAt(i - 1)))
            {
                // Capitalize the current character and append it to str_capital
                str_capital = str_capital + str.substring(i, i + 1).toUpperCase();
            }
            else
            {
                // Otherwise, append the current character to str_capital
                str_capital = str_capital + str.charAt(i);
            }
        }
        
        // Print the capitalized string
        System.out.println(str_capital);
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
