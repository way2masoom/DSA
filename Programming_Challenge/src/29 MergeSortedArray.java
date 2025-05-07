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

    // Method to merge to shorted array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
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
