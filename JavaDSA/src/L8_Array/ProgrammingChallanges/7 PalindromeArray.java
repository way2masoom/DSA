package L8_Array.ProgrammingChallanges;

class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("---- Array Palindrome ---- \n");

        // taking Input array
        int[] numArray = ArrayUtility.inputArray();

        // Method Call
        boolean isPalindrome=isPalindrome(numArray);

        // Displaying result
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
        ArrayUtility.printArray(numArray);

    }

    // Method to check array is Palindrome or Not
    public static boolean isPalindrome(int[] arr) {
        int i=0;
        int lastIndex=arr.length-1;   // store LAST INDEX

        // Loop runs till middle of the array
        while (i<arr.length/2){
            // Compare element from start and end
            if (arr[i]!=arr[lastIndex-i]){
                return false;           // Not palindrome if any mismatch found
            }
            i++;
        }
        return true;
    }
}
