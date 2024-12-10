package Loopings;
import java.util.Scanner;

public class Looping {

    public static int numberOnly(String prompt) {
        Scanner checker = new Scanner(System.in); 
        int inputNumber = 0;
        boolean validInput = false;

        while (!validInput){

          
            try {
                System.out.print(prompt);
              inputNumber = Integer.parseInt(checker.next());
              validInput = true;

            } catch (NumberFormatException e) {

              System.out.println("Invalid Input. Postive numbers only!!!");

            }

            checker.close();
        }

        return inputNumber;
        
    }

    public static void inputChecker(int num){

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0) {
                    System.out.println("Buzz");
                } else if (i % 5 == 0) {
                    System.out.println("Beef");
                } else {
                    System.out.println(i);
                }
            }

        } else {

            System.out.println("Postive number only!!!!");
        }

    }


    public static void choiceChecker(String input) {

        if (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
            System.out.println("Please enter Yes/No");
        }

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        String userInput;

        do {
            System.out.print("Enter a number that will be counted by the program: ");
            inputNum = scanner.nextInt();

            inputChecker(inputNum);


            do { 
                System.out.print("Do you want to try again?: ");
                userInput = scanner.next();

                choiceChecker(userInput);
                
            } while (!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no"));

            
        } while (userInput.equalsIgnoreCase("yes"));
        
        System.out.println("Program Exited");
        scanner.close();
        
    }
}
