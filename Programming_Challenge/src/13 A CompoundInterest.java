import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Compound Interest calculator");
        // Formula for CI=P(1 + R/100)^T
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Price Amount (₹): ");
        double P=input.nextDouble();

        System.out.print("Enter the Rate (In %): ");
        double R=input.nextDouble();

        System.out.print("Enter the Time (In year): ");
        double T=input.nextDouble();

        // Logic for the Compound Interest
        double TotalAmount=P*Math.pow((1+R/100),T); // Total Amount after compounding
        double CI=TotalAmount-P;    // Compound Interest

        // Displaying Results
        System.out.println("\n----- Result -----");
        System.out.printf("Total Amount = ₹%.2f\n", TotalAmount);
        System.out.printf("Compound Interest (CI)= ₹% .2f\n",CI);

    }
}
