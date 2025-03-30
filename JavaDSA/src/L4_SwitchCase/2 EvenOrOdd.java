package L4_SwitchCase;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Even Or Odd Using Switch Caase ");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number to check Even or Odd : ");
        int num=input.nextInt();

        switch (num%2){
            case 0:
                System.out.println(num +" is Even number");
                break;
            case 1:
                System.out.println(num+"is Odd Number"+num);
                break;
            default:
                System.out.println("Invalid Number");
        }
        System.out.println();
        System.out.println("Even or Odd Using if Else");

        System.out.println("Enter a number to check Number is Even or Odd");
        int num2=input.nextInt();

        // If Else Logic
        if(num2%2==0){
            System.out.print(num2+" is Even number");
        }else {
            System.out.print(num2+" is Odd numberr");
        }

    }

}
