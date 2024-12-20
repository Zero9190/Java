import java.util.Scanner;

public class Practice {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String userInput = " ";
        int enteredNum = 0;

        do {

            boolean isTrue = false;



            while (!isTrue) {

                try {

                    System.out.print("Enter a number: ");
                    enteredNum = Integer.parseInt(scanner.next());
                    isTrue = true;

                }

                catch (NumberFormatException e) {

                    System.out.println("Something went wrong, please enter a number");

                }

            }   

                for (int i = 1; i <= enteredNum; i++ ){

                    if (i % 3 == 0 && i !=0) {

                        System.out.println("Buzz");

                    }

                    else if (i % 5 == 0) {

                        System.out.println("Bees");

                    } 

                    else {

                        System.out.println(i);

                    }

                 }

                    do {

                        System.out.print("Do you want to enter again? Yes/No:  ");
                        userInput = scanner.next();

                        if (!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")) {

                            System.out.println("Error please enter correct input");

                        } 

                        else {

                            System.out.println("...............................................................................");

                        }

                    } while (!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no"));
            
        } while (userInput.equalsIgnoreCase("yes"));
        
        System.out.println("Program Exited.....");
        scanner.close();

    }
}