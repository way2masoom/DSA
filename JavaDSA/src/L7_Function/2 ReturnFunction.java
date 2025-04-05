package L7_Function;

import java.util.Scanner;

class ReturnFunction {
    public static void main(String[] args) {
        greet();

        int first=readNumber();
        int second=readNumber();

        int sum=first+second;
        System.out.println("Sum of Number is = "+sum);
    }

    // great Function
    public static void  greet(){
        System.out.println("Welcome to Calculator");
    }

    // Taking Input from user
    public static int readNumber(){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number=input.nextInt();

        return number;
    }
}
