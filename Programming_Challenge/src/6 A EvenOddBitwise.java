import java.util.Scanner;

class EvenOddBitwise {
    public static void main(String[] args) {
        System.out.println("---- Even Odd Number Using Bitwise ----");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=input.nextInt();

        if((num & 1)==1){
            System.out.println(num+ " is Odd Number");
        }else {
            System.out.println(num+" is Even number");
        }
    }
}
