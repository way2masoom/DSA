package L8_Array.ProgrammingChallanges;

class ShortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Point of Array is shorted or Not");

        // Taking array as input from user
        int[] numArray = ArrayUtility.inputArray();

        boolean isInc = IsIncreasing(numArray);
        boolean isDec = IsDecreasing(numArray);

        // Check Point is the array is shorted or not
        if (isInc || isDec) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }

    // Check if the array is in Increasing Order
    public static boolean IsIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] < numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Check if the array is in Decreasing Order
    public static boolean IsDecreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] > numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
