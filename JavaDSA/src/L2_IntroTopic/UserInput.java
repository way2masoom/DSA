package L2_IntroTopic;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("This is User Input Program");

        // User Input
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your name :");
        String name=input.nextLine();

        System.out.print("Enter your age :");
        int age=input.nextInt();

        System.out.print("Enter your weight : ");
        float weight=input.nextFloat();

        System.out.println("\nDisplaying the Details of User");
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Weight : "+weight);


    }
}
