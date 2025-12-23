package L7_Function;

import java.util.Scanner;

class SumOfOddNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sum of all Odd Number from Specific Number");
        System.out.print("Enter a NUmber : ");
        int num =input.nextInt();

        // Calling function
       int sum=oddSum(num);
        System.out.println("Sum of Odd number  till "+num + " is "+sum);
    }

    // Sum of Odd Number
    public static int oddSum(int num){
        int i=1;        // Start from first odd number
        int sum=0;
        while (i<num){
            sum=sum+i;
            i+=2;        // Move to next odd number
        }
        return sum;
    }
}
