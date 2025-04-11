package L5_IterativeLoops;

import java.util.Scanner;

class PrimeNotPrime {
    public static void main(String[] args) {
        System.out.println("Check if a number is Prime or Not");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number to Check Prime or Not: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is NOT prime");
        }
    }
    // Function to check prime number
    public static boolean isPrime(int num){
        // base case
        if(num<=1){
            return false;
        }
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
