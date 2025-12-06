import java.util.Scanner;

class Swap2Numbers {
    public static void main(String[] args) {
        System.out.println("Swap of Two Numbers");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number A: ");
        int num1=input.nextInt();

        System.out.print("Enter the second Number B : ");
        int num2=input.nextInt();

        System.out.println("Number Before swap");
        System.out.println("Num1 A= "+num1 +" Num2 B= "+num2 +"\n");

        // Swap logic
        int temp=num1; // Storing the num1 value in 'temp'
        num1=num2;      //
        num2=temp;

        System.out.println("Number After swap");
        System.out.println("Num1 A= "+num1 +" Num2 B= "+num2);


    }
}
