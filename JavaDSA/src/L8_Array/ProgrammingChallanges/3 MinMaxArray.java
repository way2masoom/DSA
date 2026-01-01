package L8_Array.ProgrammingChallanges;

class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("---- Min Max of Array ---- \n");
        int[] numArray = ArrayUtility.inputArray();

        // method call
        int minValue = findMin(numArray);
        int maxValue = findMax(numArray);

        // Displaying results
        System.out.println("Minimum value in the array = " + minValue);
        System.out.println("Maximum value in the array = " + maxValue);
    }

    // Method to find the Minium Element in  array
    public static int findMin(int[] numArray) {
        int min=Integer.MAX_VALUE;
        int i=0;
        while (i<numArray.length){
            if (min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
        return min;
    }

    // Method to find the Maximum Element in  array
    public static int findMax(int[] numArray) {
       // Base Condition: empty array
        if (numArray.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = numArray[0];    // Assume first element is Maximum
        int i = 1;
        while (i < numArray.length) {
            if (max < numArray[i]) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }

}
