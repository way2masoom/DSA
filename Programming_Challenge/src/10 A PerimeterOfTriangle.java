import java.util.Scanner;

class PerimeterOfTriangle {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle");
        Scanner input=new Scanner(System.in);
        // Formula of Perimeter of Rectangle P=A+B+C+D

        System.out.println("Enter the Four Size of Rectangle in CMS");

        System.out.print("Side A = ");
        double a=input.nextDouble();

        System.out.print("Side B = ");
        double b=input.nextDouble();

        System.out.print("Side C = ");
        double c=input.nextDouble();

        System.out.print("Side D = ");
        double d=input.nextDouble();

        double perimeter=a+b+c+d;
        System.out.println("Perimeter of rectangle is = "+perimeter +" cms \n");

        System.out.println("Another Approach");
        // Another Approach
        System.out.print("Enter the Length of rectangle in CM: ");
        double length=input.nextDouble();
        System.out.print("Enter the Breath of rectangle CM: ");
        double breath=input.nextDouble();

        // Logic for it
        double pere= 2*(length+breath);
        System.out.println("Perimeter of the rectangle = " + perimeter +" CMS");



    }
}
