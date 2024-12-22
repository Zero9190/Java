package Classes;
import java.util.ArrayList;
import java.util.function.Consumer;

/*Java Lambda Expressions
Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters 
and returns a value. Lambda expressions are similar to methods, 
but they do not need a name and they can be implemented right in the 
body of a method. 

Syntax
The simplest lambda expression contains a single parameter and an 
expression:

parameter -> expression 

To use more than one parameter, wrap them in parentheses:

(parameter1, parameter2) -> expression

Expressions are limited. They have to immediately return a value, and 
they cannot contain variables, assignments or statements such as if or 
for. In order to do more complex operations, a code block can be used 
with curly braces. If the lambda expression needs to return a value, 
then the code block should have a return statement.

(parameter1, parameter2) -> { code block }

Using Lambda Expressions
Lambda expressions are usually passed as parameters to a function:

Example:
Use a lambda expression in the ArrayList's forEach() method to print 
every item in the list:
*/

public class LambdaExpression {

    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList <Integer>();

        num.add(5);
        num.add(9);
        num.add(10);
        num.add(18);
        num.forEach( (n) -> { System.out.println(n); } );

        /*Lambda expressions can be stored in variables if the variable's 
        type is an interface which has only one method. 
        The lambda expression should have the same number of parameters 
        and the same return type as that method. Java has many of these 
        kinds of interfaces built in, such as the Consumer interface 
        (found in the java.util package) used by lists. */

        Consumer<Integer> method = (n) -> {System.out.println(n); };
        num.forEach(method);

    }

}
