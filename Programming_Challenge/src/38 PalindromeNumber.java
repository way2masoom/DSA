import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- Palindrome Number ---- \n");

        System.out.print("Enter A number to Check it's Palindrome or not : ");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");

        }
    }

    // method to check the number is Palindrome
    public static boolean isPalindrome(int number) {
        int reversedNumber = reverseDigit(number);

        // Compare original number with reversed number
        return number == reversedNumber;
    }

    // method to reverse the number
    public static int reverseDigit(int num) {
        // Loop runs until all digits are processed
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;      // Get last digit
            reverse = reverse * 10 + lastDigit; // Append digit to reverse
            num = num / 10;                // Remove last digit
        }
        return reverse;
    }
}
