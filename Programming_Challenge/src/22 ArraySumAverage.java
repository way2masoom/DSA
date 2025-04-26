// Create Sum and Average of All Element in an array
class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Array sum and Average");

        // Taking array Input from user
        int[] numArray=ArrayUtility.inputArray();

        long sum=sum(numArray);
        int avg=average(numArray);

        System.out.println("The Sum of the number is = "+sum);
        System.out.println("The Average of the number is = "+avg);

    }

    // Method to Find the sum of array Elements
    public static long sum(int[] numArray){
        int sum=0;
        for (int i=0;i< numArray.length;i++){
            sum+=numArray[i];
        }
        return sum;
    }

    // Method to Find the sum of array Elements
    public static int average(int[] numArray){
        long sum=sum(numArray);
        return (int) (sum/ numArray.length);
    }
}
