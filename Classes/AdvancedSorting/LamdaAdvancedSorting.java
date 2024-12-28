package Classes.AdvancedSorting;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

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


public class LamdaAdvancedSorting {

    public static void main(String[] args) {

        ArrayList <Car> myCars = new ArrayList <Car>();

        myCars.add(new Car("Audi","R8", 2019));
        myCars.add(new Car("Lamborghini","Aventador",2017));
        myCars.add(new Car("Tesla","X1",2020));
/*
 * Using a Lambda Expression
To make the code shorter, the comparator can be replaced with a lambda 
expression which has the same arguments and return value as the compare() 
method: 

or

Collections.sort(mycar, (a, b) -> Integer.compare(a.year, b.year));
 */
  
        Collections.sort(myCars, (obj1, obj2) -> {

            Car a = (Car) obj1;
            Car b = (Car) obj2;
    
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;

        });


        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

    } 
    
}
