package Classes.AdvancedSorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 *   Java Advanced Sorting
    In the List Sorting Chapter, you learned how to sort lists 
    alphabetically and numerically, but what if the list has objects in 
    it?

    To sort objects you need to specify a rule that decides how objects 
    should be sorted. For example, if you have a list of cars you might 
    want to sort them by year, the rule could be that cars with an 
    earlier year go first.

    The Comparator and Comparable interfaces allow you to specify what 
    rule is used to sort objects.

    Being able to specify a sorting rule also allows you to change how 
    strings and numbers are sorted.
 */

class Car {

    public String brand;
    public String model;
    public int    year;

    public Car(String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;

    }

}

/*
 * Comparators
An object that implements the Comparator interface is called a comparator.

The Comparator interface allows you to create a class with a compare() method 
that compares two objects to decide which one should go first in a list.

The compare() method should return a number which is:

Negative if the first object should go first in a list.
Positive if the second object should go first in a list.
Zero if the order does not matter.
A class that implements the Comparator interface might look something 
like this:
 */

class SortByYear implements Comparator<Car> {

    public int compare(Car a, Car b) {

        return a.year - b.year;
    }

}

public class JavaAdvancedSorting {

    public static void main(String[] args) {

        ArrayList <Car> myCars = new ArrayList <Car>();

        myCars.add(new Car("Audi","R8", 2019));
        myCars.add(new Car("Lamborghini","Aventador",2017));
        myCars.add(new Car("Tesla","X1",2020));

//To use the comparator, pass it as an argument into a sorting method:
        Comparator<Car> myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

    } 
    
}
