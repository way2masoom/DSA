import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Sum of Digit");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number Of Digits : ");
        int digit=input.nextInt();

        int sum=SumOfDigit(digit);
        System.out.println("Sum of Digit "+digit+" is = "+sum);
    }

    // Method to find the sum of the digit
    public static int SumOfDigit(int num){
        int sum=0;
        int i=0;
        while (num>0){
            //lastNumber=num%10;
            //sum=sum+lastNumber;

            sum+=num%10; // sum= sum+(num%10) Sum and the last number is added
            num/=10;
            i++;
        }
        return sum;
    }
}
