import java.util.Scanner;

class Subtract {
    public static void main(String[] args) {
        System.out.println("Subtract Calculator");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First number : ");
        int num1=input.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2=input.nextInt();

        int subtract=num1-num2;

        System.out.print("Subtract of number is = "+subtract);
    }
}
