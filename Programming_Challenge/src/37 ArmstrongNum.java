import java.util.Scanner;

class ArmstrongNumb {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---- Check Number is Armstrong or not ----\n");

        System.out.print("Enter a Number : ");
        int num=input.nextInt();

        int ArmstrongNum=ArmstrongNumber(num);
        if (ArmstrongNum==num){
            System.out.println(num+" is Armstrong Number ");
        }else {
            System.out.println(num+" is Not Armstrong Number ");
        }
    }

    public static int ArmstrongNumber(int number){
        int sumOfCubes = 0;           // Stores sum of cubes of digits
        int originalNumber = number; // Copy of original number

        // Extract digits and calculate sum of cubes
        while (originalNumber != 0) {
            int LastDigit = originalNumber % 10;              // Get last digit
            sumOfCubes += LastDigit * LastDigit * LastDigit;      // Add cube of digit
            originalNumber /= 10;                      // Remove last digit
        }
        return sumOfCubes;
    }
}
