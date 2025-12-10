import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("---- Fahrenheit To Celsius Calculator --- ");
        // Formula C= (F-32)*5/9
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Temperature in Fahrenheit (°F):  ");
        double fah=input.nextDouble();

        // Formula: C = (F - 32) * 5/9
        double cel=(fah-32)*5.0f/9.0f;

        System.out.printf("Temperature in Celsius = %.2f°C\n", cel);

    }
}
