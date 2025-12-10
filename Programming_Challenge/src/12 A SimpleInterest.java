import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        // Formula for SI=(P*T*R)/100
        System.out.println("\n--- Simple Interest Calculator ---\n");

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Price Amount (₹): ");
        double P=input.nextDouble();

        System.out.print("Enter the Time (In year): ");
        double T=input.nextDouble();

          System.out.print("Enter the Rate (In %): ");
        double R=input.nextDouble();

        // Logic for the Simple Interest
        double SI=(P*T*R)/100;

        // Total Amount = Principal + SI
        double TotalAmount = P + SI; // SI+ Principal Amount

        // Displaying Results
        System.out.println("\n----- Results -----");
        System.out.printf("Simple Interest (SI) = ₹%.2f\n", SI);
        System.out.printf("Total Amount = ₹%.2f\n", TotalAmount);


    }
}
