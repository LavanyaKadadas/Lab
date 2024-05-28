package lab;
//Class representing swapping of two numbers.
class Swapping 
{

 // Method to swap the values of two variables.
 public void swap() 
 {
     // Initializing variables a and b with values 10 and 20 respectively.
     int a = 10;
     int b = 20;
     
     // Swapping values without using a temporary variable.
     a = a + b;
     b = a - b;
     a = a - b;

     // Displaying the swapped values.
     System.out.println("After swapping a is " + a);
     System.out.println("After swapping b is " + b);
 }

 // Main method to execute the swapping functionality.
 public static void main(String[] args) 
 {
     // Creating an instance of Swapping class.
     Swapping obj = new Swapping();
     // Calling the swap method to perform swapping.
     obj.swap();
 }
}
