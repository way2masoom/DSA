package L8_Array.ProgrammingChallanges;

import java.lang.reflect.Array;
import java.util.Scanner;

class OccurrencesInArray {
    public static void main(String[] args) {
        System.out.println("---- Find Number of Occurrences in an Array ----\n");
        Scanner input=new Scanner(System.in);

        // calling Array utility
        int[] numArray=ArrayUtility.inputArray();

        System.out.print("Enter the Number you want to Search : ");
        int targetNum=input.nextInt();

        // Method call
        int occurrence= countOccurrences(numArray,targetNum);
        System.out.println("The number : " + targetNum + " appears : " + occurrence + " time(s) in the array.");
    }

    // method to find the Number of Occurrences in the Array
    public static int countOccurrences(int[] numArray,int targetNum){
        int i=0,occr=0;
        while (i<numArray.length){
            // Condition to check match with target number
            if(numArray[i]==targetNum){
                occr++;
            }
            i++;
        }
        return occr;
    }
}
