package L8_Array.ProgrammingChallanges;

import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        System.out.println("---- Delete Element From Array -----\n");
        Scanner input = new Scanner(System.in);

        // Array Utility || Array Input
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter the Number you want to Delete : ");
        int numToDelete = input.nextInt();

        int[] newArr = deleteArray(numArray, numToDelete);
        System.out.println("Here the new Array");
        ArrayUtility.printArray(newArr);

    }

    // method to find the Number of Occurrences in the Array
    public static int countOccurrences(int[] numArray, int targetNum) {
        int i = 0, occr = 0;
        while (i < numArray.length) {
            // Condition to check match with target number
            if (numArray[i] == targetNum) {
                occr++;
            }
            i++;
        }
        return occr;
    }

    // Method to delete Number from array
    public static int[] deleteArray(int[] numArr, int numToDelete) {
        // Method call for Count the Number of occurrences
        int occ = countOccurrences(numArr, numToDelete);

        // If element not found, return original array
        if (occ == 0) {
            return numArr;
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        // Copy elements except the target
        int i = 0;      // i → index for original array
        int j = 0;      // j → index for new array

        while (i < numArr.length) {
            // If current element is NOT the number to delete,
            // copy it into the new array
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];      // Copy Element from original array to New Array
                j++;
            }
            i++;
        }

        return newArr;
    }


}
