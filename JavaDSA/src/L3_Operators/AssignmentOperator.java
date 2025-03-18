package L3_Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment Operator");

        int age=12;
        int val=age;
        System.out.println("Age is = "+val);

        int a=20;
        val+=a;
        System.out.println("Age is = "+val);

        val*=a;
        System.out.println(val);

        val/=a;
        System.out.println(val);
    }
}
