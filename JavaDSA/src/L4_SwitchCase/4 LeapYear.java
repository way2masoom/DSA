package L4_SwitchCase;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args){
        System.out.println("Program to find out Leap Year");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a year to check the Leap Year : ");
        int year=input.nextInt();

        // logic to find out the leap year
        if((year%400==0)|| (year%4==0 && year%100!=0)){
            System.out.println(year+" Is a leap Year");
        } else if ((year%4==0 && !(year%100==0))) {
            System.out.println(year+" Is leap Year");
        }else {
            System.out.println(year+" Is Not a leap Year");
        }
    }
}
