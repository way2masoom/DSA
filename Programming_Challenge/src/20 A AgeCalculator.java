import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("---- Age Category Calculator ----");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age=input.nextInt();

        // Validation
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        }
        // Logic to calculate age
        if(age>=65){
            System.out.println("You are SeniorCitizen");
        } else if (age>=20) {
            System.out.println("You are Adult");
        } else if (age>=13) {
            System.out.println("You are Teen");
        }else {
            System.out.println("You are a Child");
        }
    }
}
