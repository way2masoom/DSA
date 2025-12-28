import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("----- Fibonacci Series ----- \n");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many terms you want: ");
        int num = input.nextInt();

        // Method call
        printFibonacci(num);
    }

    // method to Print the Fibonacci Series
    public static void printFibonacci(int num) {
        // Base condition: no terms
        if (num <= 0) {
            System.out.println("No Fibonacci terms to display.");
            return;
        }

        // Base condition: only one term
        if (num == 1) {
            System.out.print("Fibonacci Series: 0");
            return;
        }

        int first = 0;   // first Fibonacci number
        int second = 1;  // second Fibonacci number
        int i = 0;
        System.out.print("Fibonacci Series: ");

        while (i < num) {
            System.out.print(first + " ");
            int next = first + second;      // Next Fibonacci number
            first = second;                 // Swap first with second number
            second = next;                  // Swap second with Next Number
            i++;
        }
    }
}
