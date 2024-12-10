import java.util.Scanner;

public class Practice{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;
        String userChoice;

        do {

            boolean validInput = false;

          while (!validInput){

            System.out.print("Input a number: ");
              try {

                inputNumber = Integer.parseInt(scanner.nextLine());
                validInput = true;

              } catch (NumberFormatException e) {

                System.out.println("Invalid Input. Please enter a valid number.....");

              }

          }
            

            if (inputNumber > 0 ){

                for (int i = 1; i <= inputNumber; i++){

                    if (i % 3 == 0 && i != 0){

                        System.out.println("Buzz");

                    } 
                    
                    else if (i % 5 == 0) {

                        System.out.println("Beef");
                        
                    } else {
                    
                        System.out.println(i);
                    }     
            }
        } else {

            System.out.println("Postive number only!!!!");

        }

        do {

            System.out.print("Do you want to try again? Yes/No: ");
            userChoice = scanner.next();

            if (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")){

                System.out.println("Please enter a correct input....");

            }

        } while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no"));

    } while (userChoice.equalsIgnoreCase("yes"));

      System.out.println("Program Exited............");
      scanner.close();

  }

}