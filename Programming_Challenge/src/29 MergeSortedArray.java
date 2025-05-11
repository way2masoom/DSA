class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Program to Merge two shorted Array");

        //Taking input as array
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Second Array");
        int[] arr2 = ArrayUtility.inputArray();

        // calling mergeSort array
        int[] mergeArr = mergeSortedArrays(arr1, arr2);
        System.out.println("Your Merge array is : ");
        ArrayUtility.printArray(mergeArr);
    }

    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length; // Total size of merged array
        int[] newArr = new int[newSize]; // Resultant array to store merged output

        int i = 0, j = 0, k = 0; // i for arr1, j for arr2, k for newArr

        // Loop until one of the arrays is completely traversed
        while (i < arr1.length || j < arr2.length) {
            // If arr2 is exhausted OR arr1 element is smaller -> take from arr1
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i]; // Copy from arr1
                i++;
            } else {
                newArr[k] = arr2[j]; // Copy from arr2
                j++;
            }
            k++; // Move to next position in newArr
        }

        return newArr; // Return the final merged sorted array
    }

}
