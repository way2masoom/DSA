class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker \n");

        // taking array as input
        int[] numArray=ArrayUtility.inputArray();

        // calling the Method
        boolean palindromeArray=isPalindrome(numArray);

        if(palindromeArray){
            System.out.println("Your array is Palindrome");
        }else {
            System.out.println("Your array is not Palindrome");
        }

    }

        // Method to check the array is Palindrome or not
        public static boolean isPalindrome(int[] arr){
            int i=0;
            while (i< arr.length){
                //Condition: Compare the current element with its corresponding element from the end
                if (arr[i]!=arr[(arr.length-1)-i]){
                    return false; //  // If not equal, it's not a palindrome
                }
                i++;
            }
            return true;
        }
    }
