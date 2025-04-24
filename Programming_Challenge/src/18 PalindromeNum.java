import java.util.Scanner;

class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Palindrome Number checker");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        // Call the function to check if the number is  Palindrome number or NOT
        boolean palindromeNum = isPalindrome(num);


        // Display the result
        if (palindromeNum) {
            System.out.println(num + " is an Palindrome Number");
        } else {
            System.out.println(num + " is NOT an Palindrome Number");
        }

    }

    // Function to check whether the given number is a Palindrome
    public static boolean isPalindrome(int num) {
        int rev = 0; // To store the reversed number
        int copyNumber = num; // Make a copy of the original number

        while (num != 0) {
            int digit = num % 10;      // Extract the last digit
            rev = rev * 10 + digit;    // Append digit to reverse (e.g., 12 -> 120 + digit)
            num /= 10;                 // Remove the last digit from num
        }

        return rev == copyNumber; // Compare original and reversed numbers
    }
}
