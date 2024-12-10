package Loopings;
import java.util.Scanner;

public class Forloopeach{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String[] myColor = {"Black", "Red", "Dark Gray", "White"};
        String userInput, choice;

        do {
            System.out.print("Guess my favorite color: ");
            userInput = scanner.nextLine();

            boolean isCorrect = false;

            for (String c : myColor) {

                String colorRank = "";

                switch(c){
                    
                    case "Black":

                        colorRank = "1st favorite color";

                        break;

                    case "Red":

                        colorRank = "2nd favorite color";

                        break;

                    case "Dark Gray":

                         colorRank = "3rd favorite color";

                         break;

                    case "White":

                          colorRank = "4th favorite color";
                    
                          break;

                }
             

                if (userInput.equalsIgnoreCase(c)) {

                    System.out.println("Correct " + c + " is my " + colorRank);
                    isCorrect = true;
                    break;

                } 

                }


                    if (!isCorrect){

                        System.out.println("Wrong try again");
                        
                    }
                

                    do{
                        System.out.print("Do you want to guess again? Yes/No: ");
                        choice = scanner.nextLine();
                             
                        if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
  
                            System.out.println("Pls enter the correct input");
                          } 
  
                    } while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));
                  
            } while (choice.equalsIgnoreCase("yes"));

            System.out.print("Program Exited :)");
            scanner.close();

              

                 
        } 

    }
