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

    // Sum of Odd NUmber
    public static int oddSum(int num){
        int i=0;
        int sum=0;
        while (i<num){
            sum=sum+i;
            i+=2;
        }
        return sum;
    }
}
