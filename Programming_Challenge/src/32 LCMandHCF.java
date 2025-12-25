import java.util.Scanner;

class LCMandHCF{
    public static void main(String[] args) {
        System.out.println("----- LCM of Number ------ \n");
        Scanner input=new Scanner(System.in);

        // Input From user
        System.out.print("Enter the First number : ");
        int num1=input.nextInt();

        System.out.print("Enter the Second number : ");
        int num2=input.nextInt();

        int LCM=findLCM(num1,num2);
        System.out.println("LCM of "+num1 +" and "+num2+" is = "+LCM);

        int HCF=findHCF(num1,num2);
        System.out.println("HCF of "+num1 +" and "+num2+" is = "+HCF);
    }

    // Method to find LCM of the Number
    public static int findLCM(int num1,int num2){
        int i=Math.max(num1,num2);
        while (i<=num1*num2){
            if (i % num1 == 0 && i % num2 == 0){
                return i;
            }
            i++;
        }
        return 0;
    }

    //Method to find the HCF of the Number
    public static int findHCF(int num1,int num2){
       int factor=Math.min(num1,num2);
       while (factor>1){
           if(num1%factor==0 && num2%factor==0){
               return factor;
           }
           factor--;
       }
        return 1;
    }
}
