package L8_Array;

import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        System.out.println("---- Array Search ----\n");
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 6, 5, 9, 11, 30};
        System.out.print("Enter a Number you want to Search : ");
        int num = input.nextInt();

        // Method call
        boolean found = searchInArray(arr, num);

        // Checking result
        if (found) {
            System.out.println(num + " is FOUND in the array.");
        } else {
            System.out.println(num + " is NOT found in the array.");
        }
    }

    // method to find the number in the arrayList
    public static boolean searchInArray(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
