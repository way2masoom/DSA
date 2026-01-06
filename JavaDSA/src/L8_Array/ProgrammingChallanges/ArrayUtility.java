package L8_Array.ProgrammingChallanges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        // Asking user for number of elements
        System.out.print("Enter the number of elements you want in the array: ");
        int size = input.nextInt();

        // Creating array of given size
        int[] nums = new int[size];

        // Loop to take array elements from user
        int i = 0;
        while (i < size) {
            System.out.print("Please Enter the Element No " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    // Method to Display Array Elements
    public static void printArray(int[] numArray) {
        System.out.print("Array Elements : ");
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Array Input for 2D array
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Rows :");
        int rows = input.nextInt();

        System.out.print("Enter the number of Columns :");
        int columns = input.nextInt();

        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Please Enter the Rows No " + (i + 1) + " and ,Columns: " + (j + 1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return numArray;
    }
}

//// Method to Display 2DArray Elements
//public static void print2DArray(int[][] rows int[][]columns) {
//    System.out.print("Array Elements : ");
//    int i = 0;
//    while (i < rows) {
//        int j = 0;
//        while (j < columns) {
//            System.out.print("Rows : "+rows[i] +" and Columns : "+columns[j]);
//            j++;
//        }
//        i++;
//    }
//    System.out.println();
//}
