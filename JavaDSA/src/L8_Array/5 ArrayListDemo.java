package L8_Array;
import java.util.ArrayList;
class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("Demo of Array List");

        // Syntax : ArrayList<Type> arrayList= new ArrayList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<String> language=new ArrayList<>();

        // adding String Element to the array(language)
        language.add("Java");
        language.add("JavaScript");
        language.add("C++");
        System.out.println(language);

        // Accessing String Element of the arrayList(language)
        String str = language.get(1);
        System.out.println(str);

        // removing String Element from the array(language)
        language.remove(1);
        System.out.println(language);

        language.add("SQL");
        language.add("Go");
        System.out.println(language);

        // Changing the String Element of the Array(Language)
        language.set(3,"Swift");
        System.out.println(language);



    }
}
