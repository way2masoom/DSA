class ArraySwap {
    public static void main(String[] args) {
        System.out.println("🔁 Array Swap Program");

        System.out.println("\n--- Case 1: Swap Single Element Arrays ---");
        int[] arri={20};
        int[] arrj={30};

        System.out.println("Array Before Swap");
        printArray(arri);
        printArray(arrj);


    }
    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
