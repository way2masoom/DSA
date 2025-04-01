package L4_SwitchCase;

import java.util.Scanner;

class GratesOf3Number {
    public static void main(String[] args){
        System.out.println("Grates among 3 Numbers");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1=input.nextInt();
        System.out.print("Enter Second number : ");
        int num2=input.nextInt();
        System.out.print("Enter Third number : ");
        int num3=input.nextInt();

        // condition to check the grates among three
        if(num1>num2 && num1>num3){
            System.out.println("Num 1 is grater "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Num 2 is grater " +num2);
        }else {
            System.out.println("Num 3 is grater "+num3);
        }
    }
}
