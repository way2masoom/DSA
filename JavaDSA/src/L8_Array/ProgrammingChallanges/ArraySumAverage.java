package L8_Array.ProgrammingChallanges;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] numArray=ArrayUtility.inputArray();

        // calling sum of array
        long sum=calculateSum(numArray);

        // calling Average of array
        int average=calculateAverage(numArray);

        // Displaying results
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

    }
    // Method for sum Array
    public static long calculateSum(int[] numArray) {
        long sum=0;
        int index=0;
        while (index<numArray.length){
            sum+=numArray[index];
            index++;
        }
        return sum;
    }

    // Method for Average Array
    public static int calculateAverage(int[] numArray) {
        // Calling the sum array method
        long sum = calculateSum(numArray);

        int length = numArray.length; // Number of elements

        return (int)(sum/length);
    }
}

