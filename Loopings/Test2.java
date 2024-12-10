package Loopings;
import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] myColor = {"Red", "Black", "Dark Gray", "White"};
        String userInput, choice;

        do {
            System.out.print("Guess my favorite color: ");
              userInput = scanner.nextLine();

              boolean isCorrect = false;

              for (String colors : myColor) {

                String colorRank = "";

                switch(colors){

                    case "Black":
                        colorRank = "My 1st favorite color";
                    break;

                    case "Red":
                        colorRank = "My 2nd favorite color";
                    break;

                    case "Dark Gray":
                         colorRank = "My 3rd favorite color";
                    break;

                    case "White":
                         colorRank = "My 4th favorite color";
                    break;
                          
                }
                    if (userInput.equalsIgnoreCase(colors)){
                          
                         System.out.println("You're guess was correct " + colors +" is " + colorRank);
                         isCorrect = true;
                         break;
                    }
              }

                     if (!isCorrect){
                         System.out.println("You're guess was incorrect");
                     }

                     do {
                         System.out.print("Do you want to try again? Yes/No: ");
                           choice = scanner.nextLine();

                           if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
                              
                            System.out.println("Please enter the correct input!!");
                         }

                     }while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));

        } while (choice.equalsIgnoreCase("yes"));
          
           System.out.println("Proram Exited");
           scanner.close();
                      
    }
}