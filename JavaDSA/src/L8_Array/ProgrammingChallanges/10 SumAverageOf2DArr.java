package L8_Array.ProgrammingChallanges;

class SumAverageOf2DArr {
    public static void main(String[] args) {
        System.out.println("---- Sum and Average of 2D Array ----\n");

        // Taking Input 2D Array From ArrayUtility
        int[][] numArray=ArrayUtility.input2DArray();

        // Calling Sum Method
        int Sum=SumArray(numArray);
        System.out.println("Sum of Array Elements = "+Sum);

        // Calling Average Method
        double Average=Average(numArray);
        System.out.println("Average of Array Elements = "+Average);
    }

    // Sum of the 2D Array
    public static int SumArray(int[][] numArray){
        int sum=0;
        int i=0;
        while (i<numArray.length){
            int j=0;
            while (j<numArray[i].length) {
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    // Method to Find Average Of the 2D Array Element
    public static double Average(int[][] numArr){
       // Base Case
        if(numArr.length==0){
            return 0;
        }

        // Calling SumArray Method
        int sum=SumArray(numArr);
        int totalElement=0; // initial total element of arr is 0

        int i=0;
        while (i<numArr.length){
            totalElement += numArr[i].length; // count elements row-wise
            i++;
        }
        return (double)sum/totalElement;
    }
}
