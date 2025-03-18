package L3_Operators;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("ifElse Condition Operators");

        // Amazon Prime
        boolean primeSub = true;

        if (primeSub == true) {
            System.out.println("Welcome to Prime Subscription");
            System.out.println("Enjoy Unlimited movies and shows");
        } else {
            System.out.println("Please Become Prime member");
        }
        System.out.println();

        System.out.println("Another Example");
        // another example
        int num=-10;
        if(num<0){
            System.out.println("It's a Positive  Number");
        }else {
            System.out.println("It's a Negative Number");
        }
    }
}
