package L8_Array.ProgrammingChallanges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input=new Scanner(System.in);

        // Asking user for number of elements
        System.out.print("Enter the number of elements you want in the array: ");
        int size=input.nextInt();

        // Creating array of given size
        int[] nums=new int[size];

        // Loop to take array elements from user
        int i=0;
        while (i<size){
            System.out.print("Please Enter the Element No "+(i+1) + " : ");
            nums[i] =input.nextInt();
            i++;
        }
        return nums;
    }

    // Method to Display Array Elements
    public static void printArray(int[] numArray){
        System.out.print("Array Elements : ");
        int i=0;
        while (i<numArray.length){
            System.out.print(numArray[i]+" ");
            i++;
        }
        System.out.println();
    }
}
