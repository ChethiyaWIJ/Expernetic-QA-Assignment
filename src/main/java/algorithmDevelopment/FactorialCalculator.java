package algorithmDevelopment;
import java.util.Scanner;

public class FactorialCalculator {

    // Function to calculate factorial
    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        //getting user input
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            n = scanner.nextInt();

            if (n >= 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        }
        //printing the output
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

        scanner.close();
    }
}