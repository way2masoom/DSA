import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        System.out.println("Program to fin the Leap Year");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a year to check the Leap Year : ");
        int year=input.nextInt();

        // Logic to find it out
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
