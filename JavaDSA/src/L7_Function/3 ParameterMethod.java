package L7_Function;

class ParameterMethod {
    public static void main(String[] args) {

        System.out.println("---- Method with Parameters & Return Value ----\n");

        // Calling the method and passing arguments (actual values)
        int result = addTwoNumbers(4, 6);

        // Printing the returned value
        System.out.println("Sum of two numbers = " + result);
    }

    // method to SumTwo numbers
    public static int addTwoNumbers(int num1,int num2){
        int sum=num1+num2;

        // Returning the result to main method
        return sum;
    }
}
