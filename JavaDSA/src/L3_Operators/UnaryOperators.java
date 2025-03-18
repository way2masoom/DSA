package L3_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Unary Operators are used with one Operand. Ex: ++
        System.out.println("Unary Operators");

        int a=10,b=20;
        System.out.println("A = "+a + " B = "+b);
       int res1,res2;

       //Increment Operator
       res1=++a;
        System.out.println("A ="+res1);
       //Decrement Operator
        res2=--b;
        System.out.println("B ="+res2);

        // Different between a++ and ++a
        int var1=10 ,var2=20;

        // If I used a++ then the original value of var will return first and var will increase by 1
        // If I used ++a then the original values of var will increase by 1 and then return
        System.out.println(var1++);
        System.out.println(++var1);

        System.out.println();

        System.out.println(++var2);
        System.out.println(var2++);
    }
}
