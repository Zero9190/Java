package Classes;

public class Objects {
    int x = 5; // < Class attribute - variables that are inside the class.
    
    public static void main(String[] args){

        Objects myObj = new Objects();  // Class object To create , specify the class name, 
                                       //   followed by the object name, and use the keyword new.
        System.out.print(myObj.x);
    }
}
