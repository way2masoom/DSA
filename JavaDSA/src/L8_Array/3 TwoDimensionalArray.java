package L8_Array;

class TwoDimensionalArray  {
    public static void main(String[] args) {
        System.out.println("---- Demo of 2D Array ---- \n");

        int[][] numArray=new int[2][3];
        System.out.println("Length of Array = "+numArray.length);
        int[][] arr={{1,2,3},{4,5,6}};

        int i=0;
        while (i<arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();

            i++;
        }
    }
}
