class ArraySwap {
    public static void main(String[] args) {
        System.out.println("🔁 Array Swap Program");

        System.out.println("\n--- Case 1: Swap Single Element Arrays ---");

        // Declare two single-element arrays
        int[] arrayA = {20};
        int[] arrayB = {30};

        // Display arrays before swapping
        System.out.println("Before Swap:");
        printArray("arrayA", arrayA);
        printArray("arrayB", arrayB);

        // Swap their values
        swapSingleElementArrays(arrayA, arrayB);

        // Display arrays after swapping
        System.out.println("After Swap:");
        printArray("arrayA", arrayA);
        printArray("arrayB", arrayB);

        System.out.println("\n--- Case 2: S Swap Full Arrays ---");

        // Declare two same-length arrays
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println("Before Swap:");
        printArray("array1", arr1);
        printArray("array2", arr2);

        // Swap values element by element
        swapFullArrays(arr1, arr2);

        System.out.println("After Swap:");
        printArray("array1", arr1);
        printArray("array2", arr2);
    }


    // Prints the contents of a given array with a label.
    public static void printArray(String name, int[] arr) {
        System.out.print(name + " = ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Swaps the first elements of two single-element arrays.
    public static void swapSingleElementArrays(int[] arrA, int[] arrB) {
        int temp = arrA[0];
        arrA[0] = arrB[0];
        arrB[0] = temp;
    }

    //Swaps each element of two arrays of the same length
    public static void swapFullArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[0];
            arr1[0] = arr2[0];
            arr2[0] = temp;
        }
    }
}
