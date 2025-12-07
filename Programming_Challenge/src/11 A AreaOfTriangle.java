import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        // formula of are of Triangle is A=1/2(B*H) OR A= (breath * height)/2

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Breath of Triangle : ");
        double breath=input.nextDouble();

        System.out.print("Enter the Height of Triangle : ");
        double height=input.nextDouble();

        // Logic For Area of Triangle
        double area=0.5f*(breath*height);

        // we can also Use this logic
        //double area = (base * height) / 2;


        System.out.println("Area of Triangle is = "+area);
    }
}
