package L7_Function;

import java.util.Scanner;

class SumUsingMethod {
    public static void main(String[] args) {
        System.out.println("Sum using Method");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the First number Num1 : ");
        int num1=input.nextInt();
        System.out.print("Enter the Second number Num2 : ");
        int num2=input.nextInt();

        // calling the sum Method
        int addition =Sum(num1,num2);

        System.out.println("Sum of Number is = "+addition);

    }

    public static int Sum(int num1,int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }
}
