package Classes.AdvancedSorting;
import java.util.ArrayList;
import java.util.Collections;

/*
 * The Comparable Interface
The Comparable interface allows an object to specify its own sorting 
rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the 
comparable with the argument to decide which one should go first in a 
list.

Like the comparator, the compareTo() method returns a number which is:

Negative if the comparable should go first in a list.
Positive if the other object should go first in a list.
Zero if the order does not matter.
Many native Java classes implement the Comparable interface, such as 
String and Integer.

This is why strings and numbers do not need a comparator to be sorted.

An object that implements the Comparable interface might look something 
like this:
 */
class Cars implements Comparable<Cars> {

    public String brand;
    public String model;
    public int year;

    public Cars(String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public int compareTo(Cars other) {

        if(year < other.year) return -1;
        if(year > other.year) return 1;
        return 0;

    }

}

public class JavaAdvancedSortingComparable {
    
    public static void main(String[] args){

        ArrayList<Cars> myCar = new ArrayList<Cars>();

        myCar.add(new Cars("Audi","R8",2021));
        myCar.add(new Cars("Lamborghini","Huracan",2022));
        myCar.add(new Cars("Tesla","Cybertruck",2023));

        Collections.sort(myCar);

        for (Cars c : myCar) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

    }

}


/*
 * Comparator vs. Comparable
A comparator is an object with one method that is used to compare two 
different objects.

A comparable is an object which can compare itself with other objects.

It is easier to use the Comparable interface when possible, but the 
Comparator interface is more powerful because it allows you to sort any
 kind of object even if you cannot change its code.

 */