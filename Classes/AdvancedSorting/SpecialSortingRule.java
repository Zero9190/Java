package Classes.AdvancedSorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator <Integer> {

    public int compare(Integer a, Integer b) {


        boolean aIseven = (a % 2) == 0;
        boolean bIseven = (b % 2) == 0; 

        if (aIseven == bIseven) {

            if (a < b ) return -1;
            if (a > b ) return 1;
            return 0;

        }

        else {

            if (aIseven) {

                return -1;
                
            } 

            else {

                return 1;

            }

        }

    }

}

public class SpecialSortingRule {

    public static void main(String[] args) {

        ArrayList <Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(26);
        myNumbers.add(44);
        myNumbers.add(8);
        myNumbers.add(100);

        Comparator<Integer> myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        for (int i : myNumbers) {

            System.out.println(i);

        }

    }
    
}
