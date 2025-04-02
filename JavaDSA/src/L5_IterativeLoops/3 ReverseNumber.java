package L5_IterativeLoops;

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse Given Number");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number you want to reverse : ");
        int num=input.nextInt();
        System.out.println("Original Number "+num);

        //logic to find the reverse of number
        int rev=0;
       while (num>0){
          int last_digit=num%10;
           rev=rev*10+last_digit;
           num=num/10;
       }

        System.out.print("Reverse Number "+rev);
    }
}
