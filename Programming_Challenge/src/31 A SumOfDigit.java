import java.util.Scanner;

class sumOfDigit {
    public static void main(String[] args) {
        System.out.println("----------- Sum of Digit -------- \n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Digit(Ex: 123) : ");
        int num=input.nextInt();

        // calling the method
        int sum=sumDigit(num);
        System.out.println("Sum of Digit of give Number "+num+" is = "+sum);
    }
    // Method to Display the sum of digit
    public static int sumDigit(int num) {
        int sum = 0;   // Variable to store sum of digits

        // Loop runs until number becomes 0
        while (num > 0) {
            int lastDigit = num % 10; // Extract last digit
            sum = sum + lastDigit;    // Add digit to sum
            num = num / 10;       // Remove last digit
        }
        // Returning final sum
        return sum;
    }

    // another method
    public static int sumDigitMethod2(int num) {
        int sum = 0;   // Variable to store sum of digits

        // Loop runs until number becomes 0
        while (num > 0) {
            sum+=num%10;
            num/=10;
        }
        // Returning final sum
        return sum;
    }

}
