import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse the Given Number");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number to be Reverse : ");
        int num=input.nextInt();

        System.out.println("Original Number "+num);

        int reverse=ReverseDigit(num);
        System.out.print("Reverse Number "+reverse);

    }
    public static int ReverseDigit(int num){
        int rev=0;
        int i=0;
        while (i<num){
            int lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
       return rev;
    }
}
