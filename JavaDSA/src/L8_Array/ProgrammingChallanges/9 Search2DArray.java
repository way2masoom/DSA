package L8_Array.ProgrammingChallanges;

import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        System.out.println("---- Search In 2DArray ----\n");
        Scanner input=new Scanner(System.in);

        int[][] numArray=ArrayUtility.input2DArray();

        System.out.print("Enter the Number you want to search : ");
        int num=input.nextInt();

    }

    public static boolean isNumFound(int[][] numArray,int num){

        int i=0;
        while (i<numArray.length){
            if(numArray[i]==num){
                return true;
            }else {
                return false;
            }
            i++;
        }

    }
}
