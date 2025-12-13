import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Program to Check Positive Negative Or Zero");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=input.nextInt();

        if(num>0){
            System.out.println(num+" is A Positive Number");
        } else if (num==0) {
            System.out.println("Number is Zero");
        }else {
            System.out.println(num+" is A Negative Number");
        }
    }

}
