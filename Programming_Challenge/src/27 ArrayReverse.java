class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Swap Program");

        // Taking Array Input
        int[] numArray=ArrayUtility.inputArray();

        System.out.println("original Array");
        ArrayUtility.printArray(numArray);

        System.out.println();

        reverse(numArray);
        System.out.println("Reversed Array:");
        ArrayUtility.printArray(numArray);
    }

    // Method to reverse the Array
    public static void reverse(int[] arr){
        int n=arr.length;
        int mid=n/2;
        for (int i = 0; i < mid; i++) {
            // Swap element at index i with the element at the mirrored position from end
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
        }
    }
}
