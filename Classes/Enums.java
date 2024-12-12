package Classes;
import java.util.Scanner;

public class Enums {

/*An enum is a special "class" that represents a group of constants 
(unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface),
and separate the constants with a 
comma. Note that they should be in uppercase letters: */
    enum Level {  

        LOW,
        MEDIUM,
        HIGH

    }

/*Use enums when you have values that you know aren't going to change,
like month days, days, colors, deck of cards, etc. */ 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

       
        System.out.print("Enter your difficulty: ");
        String choice = scanner.next().toUpperCase(); 
        
        Level lvl = Level.valueOf(choice);

        switch(lvl) {
            
            case LOW: 
                 System.out.println("Low Level");
            break;
            
            case MEDIUM:
                 System.out.println("Medium Level");
            break;
            
            case HIGH:
                 System.out.println("High Level");
            break;     
        }


    scanner.close();

    for (Level level : Level.values()) {

        System.out .println(level);

    }
        
    }
}

    /*Difference between Enums and Classes
    An enum can, just like a class, have attributes and methods. 
    The only difference is that enum constants are public, 
    static and final (unchangeable - cannot be overridden). */