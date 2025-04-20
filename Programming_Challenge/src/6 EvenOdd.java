import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Program to find Number is Even or Odd");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num=input.nextInt();

        // Condition to check number is odd or even
        if(num%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
