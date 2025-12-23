package L7_Function;

import java.util.Scanner;

class ReturnFunction {
    public static void main(String[] args) {
        greet();

        int num1=readNumber();
        int num2=readNumber();

        int sum=num1+num2;
        System.out.println("Sum of Number is = "+sum);
    }

    // great Function
    public static void  greet(){
        System.out.println("Welcome to Calculator \n");
    }

    // Taking Input from user
    public static int readNumber(){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number=input.nextInt();

        return number;
    }
}
