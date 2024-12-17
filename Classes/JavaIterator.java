package Classes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class JavaIterator {

    public static void main(String[] args) {

        /*
         * Java Iterator
        An Iterator is an object that can be used to loop through 
        collections, like ArrayList and HashSet. 
        It is called an "iterator" because "iterating" is the technical 
        term for looping.

        To use an Iterator, 
        you must import it from the java.util package.

        Getting an Iterator
        The iterator() method can be used to get an Iterator for any 
        collection:
         */

        ArrayList<String> cars = new ArrayList<String>();

         cars.add("Audi");
         cars.add("Frod");
         cars.add("Lamborghini");
         cars.add("Ferrari");

         Iterator<String> it  = cars.iterator();

         System.out.println(it.next());

         /*Looping Through a Collection
          To loop through a collection, use the hasNext() and next() 
          methods of the Iterator: */

         while (it.hasNext()) {

            System.out.println(it.next());

         }

         /*Removing Items from a Collection
          Iterators are designed to easily change the collections that 
          they loop through. The remove() method can remove items from 
          a collection while looping. */

         LinkedList <Integer> num = new LinkedList <Integer>();
         
         num.add(12);
         num.add(14);
         num.add(16);
         num.add(18);
         num.add(20);
         num.addFirst(10);

         Iterator <Integer> a = num.iterator();

         /*Example
         Use an iterator to remove numbers less than 10 from a 
         collection: */

         while (a.hasNext()) {

            Integer i = a.next();

            if (i < 15) {

                a.remove();

            }

         }

        System.out.println(num);
         
    }

}
