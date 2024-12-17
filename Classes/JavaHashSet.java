package Classes;
import java.util.HashSet;

public class JavaHashSet {

    public static void main(String[] args) {

        /*
         * A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

            ExampleGet your own Java Server
            Create a HashSet object called cars that will store strings:
         */

        HashSet <String> ig = new HashSet<String>();

        /*Add Items
        The HashSet class has many useful methods. 
        For example, to add items to it, use the add() method: */

        ig.add("natsu");
        ig.add("Zeref");
        ig.add("Zero9190");
        ig.add("Zener");
        ig.add("Jesver");
        ig.add("Zener");

        System.out.println(ig);

        /*In the example above, even though BMW is added twice it only 
        appears once in the set because every item in a set has to be 
        unique. */

        /*Check If an Item Exists
        To check whether an item exists in a HashSet, use the contains()
        method: */


        System.out.println(ig.contains("Zero9190"));

        /*Remove an Item
        To remove an item, use the remove() method: */


        ig.remove("Jesver");

        //To remove all items, use the clear() method:
        //ig.clear();

        /*HashSet Size
        To find out how many items there are, use the size method: */

        System.out.println(ig.size());

        /*Loop Through a HashSet
        Loop through the items of an HashSet with a for-each loop:  */

        for (String a : ig) {

            System.out.println(a);

        }
        
    /*Other Types
    Items in an HashSet are actually objects. In the examples above, 
    we created items (objects) of type "String". 
    Remember that a String in Java is an object (not a primitive type). 
    To use other types, such as int, you must specify an equivalent 
    wrapper class: Integer. For other primitive types, use: 
    Boolean for boolean, Character for char, Double for double, 
    etc: */

        HashSet <Integer> age = new HashSet <Integer>();

        age.add(10);
        age.add(12);
        age.add(16);
        age.add(18);
        age.add(20);

        for (int b = 1; b <= 20; b++) {

            if (age.contains(b)) {

                System.out.println(b + " Was found in set");

            } else {

                System.out.println(b + " Was not found!!");

            }
        }
    }
}