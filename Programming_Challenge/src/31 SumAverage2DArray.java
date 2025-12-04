class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array");

        // taking 2D Array Input
        int[][] numArray = ArrayUtility.input2DArray();

        long totalSum = calculateSum(numArray);
        double average = average(numArray);

        System.out.println("Sum of 2D array is = " + totalSum);
        System.out.println("Average of 2D array is = " + average);
    }

    //Method to calculate the total sum of all elements in a 2D array.
    public static long calculateSum(int[][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                sum += numArray[i][j];
            }
        }
        return sum;
    }

    //Method to calculate the average of all elements in a 2D array.
    public static double average(int[][] numArray) {
        // If array is empty, return 0 to avoid division by zero
        if(numArray.length==0){
            return 0;
        }

        int rows = numArray.length;          // Number of rows
        int column = numArray[0].length;     // Number of columns in each row (assumes uniform size)

        double size = rows * column;         // Total number of elements in the 2D array

        // Calculate average by dividing total sum by number of elements
        return calculateSum(numArray) / size;
    }
}
