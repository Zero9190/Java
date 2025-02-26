import java.util.Scanner;

public class Testing 
{

    public static int numberFormatChecker(String promt) {

        Scanner numberChecker = new Scanner(System.in);
        int number = 0; boolean validInput = false;
        
        while (!validInput){
            
            try 
            {
            
                System.out.print(promt);
                number = Integer.parseInt(numberChecker.next());
                validInput = true;
                
            }

            catch (NumberFormatException e)  
            {

                System.out.println("ERROR: Positive number only!!!!");

            }

        }

        return number;

    }

    public static void choiceChecker(String choice){

        if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No")){

            System.out.println("ERROR: Yes & NO only!!!");

        }

    }


    public static void main(String[] args)
    {

        Scanner inputReader = new Scanner(System.in);
        int inputNumber = 0; String inputChoice;

        do {

            inputNumber = numberFormatChecker( "Enter a number: ");

            if (inputNumber > 0){

                for (int i = 0; inputNumber >= i; i++){

                    if (i % 3 == 0){

                        System.out.println("Beez");

                    }

                    else if (i % 5 == 0){

                        System.out.println("Buzz");

                    }

                    else {

                        System.out.println(i);

                    }



                }
                
            }

            else {

                System.out.println("ERROR: Postive number only!!");

            }

            do{

                System.out.print("Do you want to re-eneter another number? Yes/No: ");
                inputChoice = inputReader.next();

                choiceChecker(inputChoice);

            } while(!inputChoice.equalsIgnoreCase("Yes") && !inputChoice.equalsIgnoreCase("No"));

        } while(inputChoice.equalsIgnoreCase("Yes"));

        System.out.println("Program ended");
        inputReader.close();

    }
    
}