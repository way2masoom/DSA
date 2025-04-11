import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number up to you want to print : ");
        int num=input.nextInt();

        System.out.println("Fibonacci Series up to " + num + ":");
        // calling the Function
        PrintFibonacci(num);
    }

    // Function to print the Fibonacci series
    public static void PrintFibonacci(int num){
        int first = 0; // First Number
        int second = 1; // Second NUmber

        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
