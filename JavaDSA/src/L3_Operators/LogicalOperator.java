package L3_Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        //Logical Operators check whether the expression is true or false
        // They are used in Decision making
        System.out.println("Logical Operator");

        System.out.println("Logical AND &&");
        // Logical AND (&&)
        System.out.println((6 > 3) && (5 < 9));
        System.out.println((6 > 3) && (5 > 9));

        System.out.println("Logical OR ||");
        // Logical OR (||)
        System.out.println((6 > 3) ||(5 < 9));
        System.out.println((6 > 3) || (5 > 9));

        System.out.println("Logical NOT !");
        // Logical NOT (!)
        System.out.println(!(6 > 3) );
        System.out.println(!(5 > 9));



    }
}
