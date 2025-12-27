import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("----- Reverse the Given Digit ---- \n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Digit (Ex: 456) : ");
        int num=input.nextInt();

        System.out.println("Original Digit : "+num);

        // Calling method
        int reverseNumber=reverseDigit(num);
        System.out.println("Reverse Digit : "+reverseNumber);
    }
    public static int reverseDigit(int num){
        // Loop runs until all digits are processed
        int reverse=0;
        while (num > 0) {
            int lastDigit = num % 10;      // Get last digit
            reverse = reverse * 10 + lastDigit; // Append digit to reverse
            num = num / 10;                // Remove last digit
        }
        return reverse;
    }
}
