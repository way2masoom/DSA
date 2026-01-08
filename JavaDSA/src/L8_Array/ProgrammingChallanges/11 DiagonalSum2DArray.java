package L8_Array.ProgrammingChallanges;

class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("----- Sum of Diagonal 2D Array ---- \n");

        // Input 2D Array from Utility Classes
        int[][] numAray=ArrayUtility.input2DArray();

        long sum=DiagonalSum(numAray);

        System.out.println("Sum of Digonal Element = "+sum);

    }

    // Method to find the sum of Diagonal Elements
    public static long DiagonalSum(int[][] numArray){
        long sum = 0;
        int n = numArray.length;
        int i = 0;

        // Single loop for both diagonals
        while (i < n) {
            // Primary diagonal element
            sum += numArray[i][i];

            // Secondary diagonal element
            sum += numArray[i][n - 1 - i];

            i++;
        }

        // If matrix size is odd, subtract middle element once
        if (n % 2 == 1) {
            int mid = n / 2;
            sum -= numArray[mid][mid];
        }

        return sum;
    }
}
