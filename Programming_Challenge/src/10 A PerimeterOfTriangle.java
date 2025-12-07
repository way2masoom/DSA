import java.util.Scanner;

class PerimeterOfTriangle {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle");
        Scanner input=new Scanner(System.in);
        // Formula of Perimeter of Rectangle P=A+B+C+D

        System.out.println("Enter the Four Size of Rectangle ");

        System.out.print("Side A = ");
        int a=input.nextInt();

        System.out.print("Side B = ");
        int b=input.nextInt();

        System.out.print("Side C = ");
        int c=input.nextInt();

        System.out.print("Side D = ");
        int d=input.nextInt();

        int perimeter=a+b+c+d;
        System.out.println("Perimeter of rectangle is = "+perimeter +"\n");

        System.out.println("Another Approach");
        // Another Approach
        System.out.print("Enter the Length of rectangle : ");
        int length=input.nextInt();
        System.out.print("Enter the Breath of rectangle : ");
        int breath=input.nextInt();

        // Logic for it
        int pere= 2*(length+breath);
        System.out.println("Perimeter of the rectangle = " + perimeter);



    }
}
