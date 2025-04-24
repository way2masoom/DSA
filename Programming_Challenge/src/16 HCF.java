import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        System.out.println("HCF Heights Common Factors");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number a : ");
        int num1=input.nextInt();
        System.out.print("Enter Second Number b : ");
        int num2=input.nextInt();

        int hcf=Hcf(num1,num2);
        System.out.println("HCF of "+num1 +" && "+num2+" is = "+hcf);
    }

    public static int Hcf(int a, int b){
        // int h=a<b?a:b; // Minium of two number
        int min=Math.min(a,b);
        for (int i = min; i >=0 ; i--) {
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}
