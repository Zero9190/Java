package Classes;
import java.util.ArrayList;
import java.util.Collections;

/*The ArrayList class is a resizable array, which can be found 
in the java.util package.

 The difference between a built-in array and an ArrayList in Java, is that
 the size of an array cannot be modified (if you want to add or remove 
 elements to/from an array, you have to create a new one). 
 While elements can be added and removed from an ArrayList whenever you 
 want. The syntax is also slightly different: */

public class JavaArrayList {
    public static void main(String[] args) {

    /*The ArrayList class has many useful methods. 
    For example, to add elements to the list, use the add() method: 

    You can also add an item at a specified position by referring to 
    the index number:*/

        ArrayList <String> cars = new ArrayList <String>();
        cars.add("Toyota");
        cars.add("Ferrari");
        cars.add(0, "Audi");
        cars.add(1, "Lamborghini");
        System.out.println(cars);

        /*To access an element in the ArrayList, 
        use the get() method and refer to the index number: */

        
        System.out.println(cars.get(2));

        /*To modify an element, use the set() method and refer to 
        the index number: */

        cars.set(2, "Mercedez");
        System.out.println(cars.get(2));

        /*To remove an element, use the remove() method and refer to 
        the index number: */

        cars.remove(2);
        System.out.println(cars);

        /*To remove all the elements in the ArrayList, 
        use the clear() method: */

        //cars.clear();

        /*To find out how many elements an ArrayList have, 
        use the size method: */

        //System.out.println(cars.size());

        /*Loop through the elements of an ArrayList with a for loop, 
        and use the size() method to specify how many times the loop 
        should run: */

        for (int i = 0; i < cars.size(); i++) {

            System.out.println(cars.get(i));
        }

        for (String a : cars) {

            System.out.println(a);
        }


        /*Other Types:

        Elements in an ArrayList are actually objects. 
        In the examples above, we created elements (objects) of 
        type "String". Remember that a String in Java is an object 
        (not a primitive type). To use other types, such as int, 
        you must specify an equivalent wrapper class: Integer. 

        For other primitive types, use: Boolean for boolean, 
        Character for char, Double for double, etc: */

        ArrayList <Integer> num = new ArrayList <Integer>();

        num.add(44);
        num.add(22);
        num.add(11);
        num.add(33);

        for (int b : num) {

            System.out.println(b);

        }

        /*Another useful class in the java.util package is the 
        Collections class, which include the sort() method for sorting 
        lists alphabetically or numerically: */

        Collections.sort(cars);

        for (String c : cars) {

            System.out.println(c);

        }

        //Sort an ArrayList of Integers:

        Collections.sort(num);

        for (int d : num) {

            System.out.println(d);

        }


    }
}
