import java.util.Scanner;

// WAP to Search in 2D array
class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Searching in 2D Array ");

        //Taking 2D Array Input
        int[][] numArray = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number you want to Search : ");
        int num = input.nextInt();

        // Method call to search the number in the 2D array
        boolean isFound = Search2D(numArray, num);

        // Displaying result
        if (isFound) {
            System.out.println("Your Number was Found in 2D array");
        } else {
            System.out.println("Your Number was NOT Found in 2D Array ");
        }

    }

    //Method to find Search Number in 2D array
    public static boolean Search2D(int[][] numArray, int num) {
        // Loop through each row
        for (int i = 0; i < numArray.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < numArray[i].length; j++) {
                // Condition to check if the current element matches the number
                if (numArray[i][j] == num) {
                    return true; // Number found
                }
            }
        }
        return false; // Number not found
    }
}
