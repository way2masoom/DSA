import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("---- Prime Number ----- \n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num=input.nextInt();

        // Method call
        boolean isPrime =isPrime(num);

        if (isPrime) {
            System.out.println(num + " is a prime Number");
        } else {
            System.out.println(num + " is Not a prime Number");
        }
    }

    // Method to check Given Number is Prime or not
    public static boolean isPrime(int num){
        int i=2;
        while (i<num) {
            if (num % i== 0) {
                return false;
            }
            i++;
        }
        return  false;
    }
}
