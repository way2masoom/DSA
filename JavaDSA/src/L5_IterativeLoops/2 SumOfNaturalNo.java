package L5_IterativeLoops;

import java.util.Scanner;

class SumOfNaturalNo {
    public static void main(String[] args) {
        System.out.println("Sum of natural Numbers");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num=input.nextInt();

        // Logic to print the sum of natural numbers
        int sum=0;
        for (int i = 0; i < num; i++) {
            sum+=i;
        }
        System.out.println("The sum of natural number is = "+sum);
    }

}
