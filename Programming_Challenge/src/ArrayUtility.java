import java.util.Scanner;

public class ArrayUtility {
    // Method to input an integer array from the user
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Size Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Please Enter the Number of Elements ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Method to print the array
    public static void printArray(int[] arr){
        System.out.print("Array Elements : ");
        for(int num:arr){
            System.out.print(+num +" " );
        }
        System.out.println();
    }
}
