package L8_Array.ProgrammingChallanges;

import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        System.out.println("---- Search In 2DArray ----\n");
        Scanner input = new Scanner(System.in);

        int[][] numArray = ArrayUtility.input2DArray();

        System.out.print("Enter the Number you want to search : ");
        int num = input.nextInt();

        boolean isFound = isNumFound(numArray, num);

        if (isFound) {
            System.out.println("Your number Found in the array" + num);
        } else {
            System.out.println("Your number NOT Found in the array" + num);
        }
    }

    public static boolean isNumFound(int[][] numArray, int num) {
        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
