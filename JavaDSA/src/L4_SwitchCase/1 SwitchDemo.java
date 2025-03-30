package L4_SwitchCase;

import java.util.Scanner;

class SwitchDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Switch Demo");

        System.out.print("Enter Your Day in number : ");
        int day=input.nextInt();

        // Switch case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day");
        }
    }
}
