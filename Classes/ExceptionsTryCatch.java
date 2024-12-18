package Classes;
import java.util.Scanner;

public class ExceptionsTryCatch {

    public static void main(String[] args) {

        /*Java Exceptions
        When executing Java code, different errors can occur: 
        coding errors made by the programmer, errors due to wrong input, 
        or other unforeseeable things.

        When an error occurs, Java will normally stop and generate an 
        error message. The technical term for this is: Java will throw an 
        exception (throw an error).

        Java try and catch
        The try statement allows you to define a block of code to be 
        tested for errors while it is being executed.

        The catch statement allows you to define a block of code to be 
        executed, if an error occurs in the try block.

        The try and catch keywords come in pairs: 
        
        
        Consider the following example:

        This will generate an error, because myNumbers[10] does not 
        exist.

        public class Main {
        public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
       }
     }

        The output will be something like this:

        Exception in thread "main" java.lang.ArrayIndexOutOfBounds
        Exception: 10 at Main.main(Main.java:4)

        Note: ArrayIndexOutOfBoundsException occurs when you try to 
        access an index number that does not exist.

        If an error occurs, we can use try...catch to catch the error 
        and execute some code to handle it:*/


        try {

            int[] myNum = {1, 2, 3, 4};
            System.out.print(myNum[10]);

        }

        catch (Exception e) {

            System.out.println("Something went wrong!");

        }

        /*Finally
        The finally statement lets you execute code, after try...catch, 
        regardless of the result: */
        
        finally {

            System.out.println("Finish!!!");

        }



        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean  isCorrect = false;

        while (!isCorrect) {

            try {

             System.out.print("Enter a number: ");
             num = Integer.parseInt(scanner.next());
             checkAge(num);
             isCorrect = true;

            }

            catch (NumberFormatException e) {

                System.out.println("Please enter a number!");
                

            }
            
        }

        System.out.println("Number that the user entered: " + num);
        scanner.close();

    }


    /*The throw keyword
    The throw statement allows you to create a custom error.

    The throw statement is used together with an exception type. 
    There are many exception types available in Java: 
    ArithmeticException, FileNotFoundException, 
    ArrayIndexOutOfBoundsException, SecurityException, etc: */


    public static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be atleast 18 year old");
        }

        else {

            System.out.println("Access granted!!!");

        }


    }
    
}
