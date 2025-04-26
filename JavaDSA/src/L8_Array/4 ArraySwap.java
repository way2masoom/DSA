package L8_Array;

class ArraySwap {
    public static void main(String[] args) {
        System.out.println("🔁 Array Swap Program");

        System.out.println("\n--- Case 1: Swap Single Element Arrays ---");
        int[] arri = {10};
        int[] arrj = {20};

        System.out.println("Before Swap: arri = " + arri[0] + ", arrj = " + arrj[0]);

        // Call method to swap first elements
        swapSimpleArray(arri, arrj);

        System.out.println("After Swap : arri = " + arri[0] + ", arrj = " + arrj[0]);

        System.out.println("\n--- Case 2: Swap Full Arrays ---");
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {1, 2, 4, 8};

        System.out.println("Before Swap:");
        printArray("arr1", arr1);
        printArray("arr2", arr2);

        // Call method to swap all elements of both arrays
        swapFullArrays(arr1, arr2);

        System.out.println("After Swap:");
        printArray("arr1", arr1);
        printArray("arr2", arr2);
    }

    // Swap method for two array
    public static void swapSimpleArray(int[] num1,int[] num2 ){
        int temp=num1[0];
        num1[0]=num2[0];
        num2[0]=temp;
    }

    // Swap Function for List of array
    public static void swapFullArrays(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
    }

    /**
     * Utility method to print array contents.
     */
    public static void printArray(String name, int[] array) {
        System.out.print(name + " = ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
