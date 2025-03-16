import java.util.Scanner;

class Sum {
    public static void main(String[] args){
      System.out.println("Sum calculator ");
//      for Input
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        int num1=input.nextInt();

        System.out.print("Enter the second number : ");
        int num2=input.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two number is = "+sum);

    }
}
