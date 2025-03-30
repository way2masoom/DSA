package L4_SwitchCase;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

class ValidTriangle {
    public static void main(String[] args){
        System.out.println("Valid Triangle based on the side");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the three side of triangle");
        System.out.println("Enter the first Side A :");
        int num1=input.nextInt();

        System.out.println("Enter the Second Side B :");
        int num2=input.nextInt();

        System.out.println("Enter the Third Side C :");
        int num3=input.nextInt();

        // Condition to check the valid Triangle
        if(num1+num2>num3 && num1+num3>num2 && num2+num3>num1){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }

        System.out.println();
        System.out.println("Valid Triangle based on the Angle");
        System.out.print("Enter Angle A : ");
        int a=input.nextInt();

        System.out.print("Enter Angle B : ");
        int b=input.nextInt();

        System.out.print("Enter Angle C : ");
        int c=input.nextInt();

        int sum=a+b+c;

    // logi to find the valid triangle based on the angle
        if(sum==180 && a>0 && b>0 && c>0){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
