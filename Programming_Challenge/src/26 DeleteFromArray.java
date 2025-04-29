import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        System.out.println("Delete a specific element and return a new Array");
        Scanner input=new Scanner(System.in);

        // Taking an array input
        int[] numArray=ArrayUtility.inputArray();

        System.out.print("Enter the Element you want to delete from Array: ");
        int elementToDelete=input.nextInt();

        System.out.println("\nArray Before Deletion:");
        ArrayUtility.printArray(numArray);
        System.out.println();

        // Call method to delete the element
        int[] newArr=deleteNumber(numArray,elementToDelete);

        System.out.println("\nArray After Deletion:");
        ArrayUtility.printArray(newArr);
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

    public static int[] deleteNumber(int[] numArray, int elementToDelete){
        int occ=noOfOccurrences(numArray,elementToDelete);
        // Base Case
        if(occ==0){
            System.out.println("Element not found in the array.");
            return numArray;
        }

        int newSize=numArray.length-occ;
        int[] newArr= new int[newSize];

        int i=0, j=0;
        while (i<numArray.length){
            if(numArray[i]!=elementToDelete){
                newArr[j]=numArray[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
