import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");

        
        int f = 0, s = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(f + " ");

            int sum = f + s;
            f = s;
            s = sum;
			System.out.print(sum);
        }

        
    }
}
