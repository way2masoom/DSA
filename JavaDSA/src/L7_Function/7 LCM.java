package L7_Function;

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        System.out.println("LCM Lowest Common Multiple");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int a=input.nextInt();
        System.out.print("Enter Second Number : ");
        int b=input.nextInt();

        int lcm=LCMOfNumber(a,b);
        System.out.println("LCM of "+a+" and "+b+" is = "+lcm);
    }

    // Function to find the Lowest Common Multiple
    public static int LCMOfNumber(int first,int second){
        int i=1;
        // loop will run till the Multiple of Both number
        while (true){
            int factor=first*i;
            if (factor%second==0){
                return factor; // Return the LCM
            }
            i++;
        }
    }
}
