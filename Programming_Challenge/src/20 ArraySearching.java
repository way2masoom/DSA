import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        System.out.println("Array Searching");
        Scanner input = new Scanner(System.in);

        // Declaring an array
        int[] arr = {20, 1, 44, 67, 38, 88, 334, 24, 53, 6, 8, 9};
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Enter the Number you want to Find In array List : ");
        int num = input.nextInt();

        System.out.println();

        // Calling the Function
        boolean isFound = isFound(arr, num);

        if (isFound) {
            System.out.println(num + " Number Found in Array List");
        } else {
            System.out.println(num + " Number NOT Found in Array List");
        }
    }

    // Function to find the Number is in Array List or not
    public static boolean isFound(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
