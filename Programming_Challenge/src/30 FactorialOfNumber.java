import java.util.Scanner;

class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("---- Factorial of Given Number ---- \n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number to Calculate the Factorial : ");
        int num=input.nextInt();

        // method call
        int fact=factoOfNum(num);
        System.out.println("Factorial of given Number is = "+fact);
    }

    // Method to display the factorial of Number
    public static int factoOfNum(int num) {
       int i=1;
       int fact=1;
        while (i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
