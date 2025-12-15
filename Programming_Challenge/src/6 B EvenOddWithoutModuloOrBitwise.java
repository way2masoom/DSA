import java.util.Scanner;

class EvenOddWithoutModuloOrBitwise {
    public static void main(String[] args) {
        System.out.println("---- Even Odd Number without modulo or Bitwise ----");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=input.nextInt();

        // Logic to check even or odd without using % or bitwise operators
        if((num/2*2)==num){
            System.out.println(num+ " is Event Number");
        }else {
            System.out.println(num+ " is Odd Number");
        }
    }
}
