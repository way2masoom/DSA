import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(" -------  Multiplication Table ----- \n ");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number whose table you want to print: ");
        int num=input.nextInt();

        // Method call
        printMultiplicationTable(num);
    }

    // Method that print the Table of Given Number
    public static void printMultiplicationTable(int num){
        int i=1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
