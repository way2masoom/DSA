package L5_IterativeLoops;

import java.util.Scanner;

class PrimeNotPrime {
    public static void main(String[] args) {
        System.out.println("Check if a number is Prime or Not");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number to Check Prime or Not: ");
        int num = input.nextInt();
        input.close(); // Always close the scanner to prevent resource leaks

        // Handle edge cases
        if (num <= 1) {
            System.out.println("Number is NOT prime");
            return;
        }

        boolean isPrime = true;

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; Math.sqrt(num)<= num; i++) { // we can also do i*i inste of math method
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is NOT prime");
        }
    }
}
