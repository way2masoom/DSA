package L7_Function;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number which table you want to Print : ");
        int num=input.nextInt();

        // calling function
        printTableOfNum(num);
    }

    public static void printTableOfNum(int num){
        int i=1;
        while (i<=10){
            System.out.println(num+" X "+i +" = "+(num*i));
            i++;
        }
    }
}
