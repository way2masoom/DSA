package L5_IterativeLoops;

import java.util.Scanner;

class LoopDemoProgram {
    public static void main(String[] args) {
        //Another Example Taking User Input 5 times
        Scanner input=new Scanner(System.in);
        int x = 1;
        while (x<5){
            System.out.print("Enter your "+x+" Number : ");
            int num=input.nextInt();

            System.out.println("Your Number is "+num);
            x+=1; // Updating the condition
        }
    }
}
