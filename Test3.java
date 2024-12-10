import java.util.Scanner;
import Loopings.Looping;

public class Test3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChoice;
        int userInput;

        do {

            userInput = Looping.numberOnly("Enter a number: ");
            Looping.inputChecker(userInput);

            do {

                System.out.print("Want to enter again? Yes/NO: ");
                userChoice = scan.next();
                Looping.choiceChecker(userChoice);

            } while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no"));

        } while (userChoice.equalsIgnoreCase("yes"));

        System.out.println("Program Exited!!!!");
        scan.close();
       
    }
 

        
    }

