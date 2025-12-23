import java.util.Scanner;

class SumOfOddNumber {
    public static void main(String[] args) {
        System.out.println("Sum Of all Odd Number From 1 to Specific Number N \n");
        Scanner input=new Scanner(System.in);

        // Taking input from User
        System.out.print("Enter the number N: ");
        int num=input.nextInt();

        // calling method
        int oddSum=sumOfOddNumber(num);
        System.out.println("Sum of odd Number is = "+oddSum);
    }

    // Method to calculate sum of odd numbers up to N
    public static int sumOfOddNumber(int num) {
        int i=0;
        int sum=0;
        while (i<=num){
            if (i%2!=0){  // check if i is odd
                sum+=i;
            }
            i++;
        }
        return sum;
    }
    // Another Logic without IF
    public static int oddSum(int num) {
        int i=1;        // Start from first odd number
        int sum=0;
        while (i<num){
            sum=sum+i;
            i+=2;        // Move to next odd number
        }
        return sum;
    }
}
