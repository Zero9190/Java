package Classes;
import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {

<<<<<<< HEAD
        /*Java HashMap
        In the ArrayList chapter, you learned that Arrays store items 
        as an ordered collection, and you have to access them with an 
        index number (int type). A HashMap however, store items in 
        "key/value" pairs, and you can access them by an index of 
        another type (e.g. a String).

        One object is used as a key (index) to another object (value). 
        It can store different types: String keys and Integer values, 
        or the same type, like: String keys and String values: */

        /*Add Items
        The HashMap class has many useful methods. For example, to add 
        items to it, use the put() method: */

        HashMap<String, String> capitalCities = new HashMap <String, String>();

        capitalCities.put("England","London");
        capitalCities.put("Philippines","Manila");
        capitalCities.put("Japan","Tokyo");
        capitalCities.put("USA","LA California");
        System.out.println(capitalCities);


        /*Access an Item
        To access a value in the HashMap, use the get() method and 
        refer to its key: */

        System.out.println( capitalCities.get("Japan"));

        /* 
        Remove an Item
        To remove an item, use the remove() method and refer to the 
        key:

        capitalCities.remove("England");
        System.out.println(capitalCities);

        To remove all items, use the clear() method:

        capitalCities.clear();
        System.out.println(capitalCities);*/

        /*HashMap Size
        To find out how many items there are, use the size() method: */

        System.out.println(capitalCities.size());

        /*Loop Through a HashMap
          Loop through the items of a HashMap with a for-each loop.

          Note: Use the keySet() method if you only want the keys, and 
          use the values() method if you only want the values: */

        for (String a : capitalCities.keySet()) {

            System.out.println(a);

        }

        for (String b : capitalCities.values()) {

            System.out.println(b);

        }

        for (String c : capitalCities.keySet()) {

            System.out.println("Key: " + c + "Values: " + capitalCities.get(c));
   
        }

        /*Other Types
        Keys and values in a HashMap are actually objects. 
        In the examples above, we used objects of type "String". 
        Remember that a String in Java is an object -
        (not a primitive type). To use other types, such as int, 
        you must specify an equivalent wrapper class: Integer. 
        For other primitive types, use: Boolean for boolean, 
        Character for char, Double for double, etc: 
        
        Example:
        Create a HashMap object called people that will store String 
        keys and Integer values: */

        HashMap <String, Integer> people = new HashMap <String, Integer>();

        people.put("Jesver Kevin", 23);
        people.put("John Harold",24);
        people.put("Gherald", 23);
        people.put("Alexander Troy",27);

         for(String d : people.keySet()) {

         System.out.println("Key: " + d + "Values: " + people.get(d));

        }

     }

=======
    HashMap<String, String> capitalCities = new HashMap <String, String>();

    capitalCities.put("England","London");
    capitalCities.put("Philippines","Manila");
    capitalCities.put("Japan","Tokyo");
    capitalCities.put("USA","LA California");
    System.out.println(capitalCities);


   
    System.out.println( capitalCities.get("Japan"));

    //capitalCities.remove("England");
    //System.out.println(capitalCities);

    /*capitalCities.clear();
    System.out.println(capitalCities);*/

    System.out.println(capitalCities.size());


    for (String a : capitalCities.keySet()) {

        System.out.println(a);

    }

    for (String b : capitalCities.values()) {

        System.out.println(b);

    }


    


    }
>>>>>>> d750aeca0bfae62f4805ebd2a27e4df8c1e854d8
}
