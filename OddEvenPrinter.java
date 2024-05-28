package lab;
 

public class OddEvenPrinter 
{
    public static void main(String[] args) 
    {
        // Created threads for printing odd and even numbers
        Thread oddThread = new Thread(new OddNumberPrinter());
        Thread evenThread = new Thread(new EvenNumberPrinter());

        // Started both threads
        oddThread.start();
        evenThread.start();
    }
}

// Runnable implementation to print odd numbers
class OddNumberPrinter implements Runnable
{
    @Override
    public void run()
    {
        // Iterated from 1 to 100, incrementing by 2 to print odd numbers
        for (int i = 1; i <= 100; i += 2) 
        {
            // Printed each odd number
            System.out.println("Odd number: " + i);
        }
    }
}

// Runnable implementation to print even numbers
class EvenNumberPrinter implements Runnable
{
    @Override
    public void run()
    {
        // Iterated from 2 to 100, incrementing by 2 to print even numbers
        for (int i = 2; i <= 100; i += 2)
        {
            // Printed each even number
            System.out.println("Even number: " + i);
        }
        // Printed an empty line after printing all even numbers
        System.out.println();
    }
}


 

 
