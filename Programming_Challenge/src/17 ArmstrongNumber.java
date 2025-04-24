import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number Checker");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        // Call the function to check if the number is an Armstrong number
        boolean isArmstrong = isArmstrong(num);

        // Display the result
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }

    // Function to check whether a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int original = num;

        // Count the number of digits in the number
        int digits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of total digits
        while (num != 0) {
            int digit = num % 10;                  // Get the last digit Num=125
            sum += Math.pow(digit, digits);        // Add digit^digits(5^3) to sum
            num /= 10;                             // Remove the last digit (Num=125/10=12)
        }

        // If sum equals the original number, it is an Armstrong number
        return sum == original;
    }
}
