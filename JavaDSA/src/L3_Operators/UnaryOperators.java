package L3_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Unary Operators are used with one Operand. Ex: ++
        System.out.println("Unary Operators");

        int a=10,b=20;
        System.out.println("value of A = "+a + " value of B = "+b);


       //Increment Operator
        int inc=++a;
        System.out.println("Value of A After increment  ="+inc);

        //Decrement Operator
        int dec=--b;
        System.out.println("Value of B after Decrement  ="+dec);

        // Different between a++ and ++a
        int var1=10 ,var2=20;

        System.out.println();
        // If I used a++ then the original value of var will return first and var will increase by 1
        // If I used ++a then the original values of var will increase by 1 and then return
        System.out.println("Var1 = "+var1 +" Var2 = "+var2+ "\n");
        System.out.println("Pree Increment var1 = "+ ++var1);
        System.out.println("Pree Decrement var1= "+ --var1 +"\n");

        System.out.println();

        System.out.println("Post Increment var2 = "+ var2++);
        System.out.println("Post Decrement var2= "+var2--);
    }
}
