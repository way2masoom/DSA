package L8_Array.ProgrammingChallanges;

import java.lang.reflect.Array;

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("----- Reverse Array ----\n");

        //Array Utility Classes
        int[] numArray = ArrayUtility.inputArray();

        System.out.println("Your original Array is ");
        ArrayUtility.printArray(numArray);

        // Method call for reversing the array
        ReverseArr(numArray);


        System.out.println("\n Your Reverse array is ");
        ArrayUtility.printArray(numArray);

    }

    // Method to Reverse Array
    public static void ReverseArr(int[] arr) {
        int i = 0;
        while (i < arr.length/2) {
            // Store current element in temporary variable
            int temp = arr[i];

            // Calculate index of element from the end
            int lastIndex=arr.length - 1 - i;

            // Swap elements
            arr[i] = arr[lastIndex];
            arr[lastIndex] = temp;

            i++;
        }
    }
}
