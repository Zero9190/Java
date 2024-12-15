package Classes;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaListSorting {

    /*Java Sort a List
    In the previous chapters, you learned how to use two popular lists 
    in Java: ArrayList and LinkedList, which are found in the 
    java.util package.

    Another useful class in the java.util package is the Collections 
    class, which include the sort() method for sorting lists 
    alphabetically or numerically. */

    public static void main(String[] args) {

    /*
    Sort an ArrayList of Strings alphabetically in ascending order:   
    */

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Buggatti");
        list1.add("Audi");
        list1.add(0, "Marcedez Benz");
        list1.add(1, "Lamborghini");
        list1.add(0, "Ferrari");

        Collections.sort(list1);

        System.out.println(list1);

    /*
    Sort an LinkList of Integers numerically in ascending order: 
    */

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(2); 
        list2.addFirst(1);
        list2.add(3); 
        list2.add(4);
        list2.add(5);

        Collections.sort(list2);

        System.out.println(list2);

      /*Reverse the Order
        You can also sort a list in reverse order, by using the 
        reverseOrder() method.

        In the following example, we sort an ArrayList of Strings 
        alphabetically in reverse/descending order: */

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Red");
        list3.add("Ash Gray");
        list3.add("Black");
        list3.add("White");

        Collections.sort(list3,  Collections.reverseOrder());

        System.out.println(list3);

    /*
    Sort an LinkedList of Integers numerically in reverse/descending 
    order: 
    */

        LinkedList <Integer> list4 = new LinkedList <Integer>();
        list4.add(30);
        list4.addFirst(10);
        list4.add(56);
        list4.addLast(45);
        list4.addFirst(29);

        Collections.sort(list4, Collections.reverseOrder());

        System.out.println(list4);

        


    }
    
}
