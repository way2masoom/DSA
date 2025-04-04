package L7_Function;

import java.util.Scanner;

class FunctionDemo {
    public static void main(String[] args){
        System.out.println("Function or Method Demo");
        Scanner input=new Scanner(System.in);

        // Method calling
        System.out.println("In the Main method");
        greeting();
        System.out.println("after Function call");

        System.out.println();

        // Input From User
        System.out.print("Enter first Number : ");
        int num1=input.nextInt();

        System.out.print("Enter second Number : ");
        int num2=input.nextInt();

        // calling sum Method
        Sum(num1,num2);
    }

    // Function/ Method creation
    public static void greeting(){
        System.out.println("Hello World");
        System.out.println("Good morning");
    }

    public static int Sum(int num1,int num2){
            int sum=0;
        sum=num1+num2;
        System.out.println("Sum of Two number is = "+sum);
        return sum;
    }
}
