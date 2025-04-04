package L6_TypeConversionAndMore;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series From 0 to N");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number for Fibonacci Serie : ");
        int num = input.nextInt();

        System.out.println("Fibonacci Series up to " + num + ":");

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
