class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array");

        // taking 2D Array Input
        int[][] numArray = ArrayUtility.input2DArray();

        int sumOfArray = sumArray(numArray);
        double average = average(numArray);

        System.out.println("Sum of 2D array is = " + sumOfArray);
        System.out.println("Average of 2D array is = " + average);
    }

    //Method to Find the sum of 2D Array
    public static int sumArray(int[][] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                sum += numArray[i][j];
            }
        }
        return sum;
    }

    //Method to Find the sum of 2D Array
    public static int average(int[][] numArray) {
        // calling sum method
        int sum = sumArray(numArray);

        int totalElements = 0;

        for (int i = 0; i < numArray.length; i++) {
            totalElements += numArray[i].length;
        }
        return (int) (sum / totalElements);
    }
}
