import java.util.Scanner;

class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("Program to check the Triangle is Valid or not");
        Scanner input=new Scanner(System.in);

        System.out.println("Valid Based on the side \n");
        System.out.print("Enter Side A : ");
        int num1=input.nextInt();

        System.out.print("Enter Side B : ");
        int num2=input.nextInt();

        System.out.print("Enter Side C : ");
        int num3=input.nextInt();

        // Condition to check the triangle is valid or not
        if(num1+num2>num3 && num1+num3>num2 && num2+num3>num1){
            System.out.println("It's a valid Triangle");
        }else {
            System.out.println("It's not Valid Triangle");
        }


        System.out.println("Valid Based on the Angle \n");
        System.out.print("Enter Side A : ");
        int a=input.nextInt();

        System.out.print("Enter Side B : ");
        int b=input.nextInt();

        System.out.print("Enter Side C : ");
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
