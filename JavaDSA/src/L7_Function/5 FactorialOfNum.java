package L7_Function;

import java.util.Scanner;

class FactorialOfNum {
    public static void main(String[] args) {
        System.out.println("Factorial Of Given Number");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=input.nextInt();

        //Calling Function
        long fact=Factorial(num);
        System.out.println("Factorial of Given Number is = "+fact);

    }

    // Function to find the Factorial of given Number
    public static long Factorial(int num){
        // Base case
        if(num<2){
            return 1;
        }

        long fact=1;
        int i=2;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
