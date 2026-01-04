package L8_Array.ProgrammingChallanges;

class MergeShortedArr {
    public static void main(String[] args) {
        System.out.println("---- Merge two Shorted Array ----\n");

        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        // Method call
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Displaying result
        System.out.println("Merged sorted array:");
        ArrayUtility.printArray(mergedArray);

    }

    // Method to Merge Two Shorted Array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] newArr = new int[size];
        // i for arr1 , j for arr2 and k for new arr
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        return newArr;
    }
}
