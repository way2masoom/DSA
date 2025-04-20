import java.util.Scanner;

class Swap2Numbers {
    public static void main(String[] args) {
        System.out.println("Swap of Two Numbers");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number :");
        int num1=input.nextInt();

        System.out.print("Enter Second Number :");
        int num2=input.nextInt();

        System.out.println("Number Before Swap");
        System.out.println("Num1 = "+num1+ " Num2 = "+num2);
        System.out.println();

        // Logic to swap two numbers
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Number After Swap");
        System.out.println("Num1 = "+num1+ " Num2 = "+num2);
    }
}
