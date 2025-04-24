package L8_Array;

class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Array Demo");

        // Declaration
        int[] myArr=new int[5];
        myArr[0]=65;
        myArr[1]=44;
        myArr[4]=55;
        myArr[3]=21;

        System.out.println(myArr[3]);
        System.out.println(myArr);
        System.out.println(myArr.length);

        for (int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }

        System.out.println("Printing in reverse");
        for(int i= myArr.length-1;i>=0;i--){
            System.out.print(" "+myArr[i]);
        }

    }
}
