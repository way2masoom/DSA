import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Occurrences Finder In Array Element");
        Scanner input=new Scanner(System.in);

        // Taking Array Elements from User
        int[] numArray=ArrayUtility.inputArray();

        System.out.print("Enter the Number you Want to Find :");
        int num=input.nextInt();

        // Calling method to find the Number of Occurrences
        int occurrences=noOfOccurrences(numArray,num);
        System.out.println("Your element is found " + occurrences + " time(s) in the array.");
    }

    //Method to find the Number of Occurrences in the Array List
    public static int noOfOccurrences(int[] numArray,int num){
        int count=0;
        for (int i=0;i<numArray.length;i++){
            if(numArray[i]==num){
                count++;
            }
        }
        return count;
    }
}
