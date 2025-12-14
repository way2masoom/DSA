package L3_Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        //Logical Operators check whether the expression is true or false
        // They are used in Decision-making
        System.out.println("---- Logical Operators ----");

        // Logical AND (&&)
        System.out.println("Logical AND &&");
        System.out.println((6 > 3) && (5 < 9));   // true && true → true
        System.out.println((6 > 3) && (5 > 9));   // true && false → false

        // Logical OR (||)
        System.out.println("\nLogical OR ||");
        System.out.println((6 > 3) || (5 < 9));   // true || true → true
        System.out.println((6 > 3) || (5 > 9));   // true || false → true

        // Logical NOT (!)
        System.out.println("\nLogical NOT !");
        System.out.println(!(6 > 3));             // !true → false
        System.out.println(!(5 > 9));             // !false → true
    }
}

