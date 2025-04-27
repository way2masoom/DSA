class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("Min Max of Given Array Element");

        // Taking Array Elements from User
        int[] numArray=ArrayUtility.inputArray();

        // Calling Methods to find Min and Max
        int minValue=min(numArray);
        int maxvalue=max(numArray);

        // Displaying Results
        System.out.println("Min of the Array is "+minValue);
        System.out.println("Max of the Array is "+maxvalue);

    }

    // Method to find the Minimum value in the Array List
    public static int min(int[] numArray){
       int min=Integer.MAX_VALUE;  // Start with the maximum possible value
        int i=0;
        while (i< numArray.length){
            // If current element is smaller, update min
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
        return min; // Return the final minimum value
    }

    // Method to find the Maximum value in the Array List
    public static int max(int[] numArray){
        if(numArray.length==0){
            // Edge case: if array is empty, return the smallest possible integer
            return Integer.MIN_VALUE;
        }
        int max=numArray[0]; // Start with the first element as the maximum

        int i=0;
        while (i<numArray.length){
            // If current element is bigger, update max
            if(max<numArray[i]){
                max=numArray[i];
            }
            i++;
        }
        return max;
    }
}
