package Classes;
import java.util.LinkedList;
import java.util.Collections;

/*Java LinkedList:
In the previous chapter, you learned about the ArrayList class. 
The LinkedList class is almost identical to the ArrayList: */

public class JavaLinkedList {

    public static void main(String[] args) {

        LinkedList<String> food = new LinkedList<String>();

        food.add("Adobo");
        food.add("Sisig");
        food.add("Dinakdakan");
        food.add("Asado");

        System.out.println(food);

        food.addFirst("Kare Kareng baka");
        food.addLast("Chicken Curry");

        System.out.println(food);
        
        food.removeFirst();
        food.removeLast();

        System.out.println(food);

        System.out.println(food.getFirst());

        System.out.println(food.getLast());
        

        Collections.sort(food);

        for (int a = 0; a < food.size(); a++) {

            System.out.println(food.get(a));

        }

        for (String b : food) {

            System.out.println(b);

        }

        food.add(0, "Menudo");

        System.out.println(food);


        food.set(4, "Pancit Bihon");

        food.remove(0);

        System.out.println(food);

        
        



    /*  Method	        Description
    
        addFirst()	    Adds an item to the beginning of the list	
        addLast()	    Add an item to the end of the list	
        removeFirst()	Remove an item from the beginning of the list	
        removeLast()	Remove an item from the end of the list	
        getFirst()	    Get the item at the beginning of the list	
        getLast()	    Get the item at the end of the list 
    */

    }

}


/*ArrayList vs. LinkedList
The LinkedList class is a collection which can contain many objects of 
the same type, just like the ArrayList.

The LinkedList class has all of the same methods as the ArrayList class- 
because they both implement the List interface. 
This means that you can add items, change items, remove items and clear- 
the list in the same way.

However, while the ArrayList class and the LinkedList class can be used 
in the same way, they are built very differently.

How the ArrayList works:
The ArrayList class has a regular array inside it. 
When an element is added, it is placed into the array. 
If the array is not big enough, a new, larger array is created to replace 
the old one and the old one is removed.

How the LinkedList works:
The LinkedList stores its items in "containers." The list has a link to 
the first container and each container has a link to the next container 
in the list. To add an element to the list, the element is placed into a 
new container and that container is linked to one of the other containers 
in the list. */