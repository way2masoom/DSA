import java.util.Scanner;

class Sum {
    public static void main(String[] args){
        System.out.println("Sum calculator");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your first number : ");
        int num1=input.nextInt();

        System.out.print("Enter Your Second number : ");
        int num2=input.nextInt();

        int sum=num1+num2;
       System.out.print("Sum of number is = "+sum);
    }
}
