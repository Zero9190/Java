import java.util.Scanner;
public class Swicth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("number 1 to 6: ");
           int userAge = scanner.nextInt();

        switch(userAge){

            case 1:
              System.out.println("Handsome");
              break;

            case 2:  
               System.out.println("Strong");
               break;
            
            case 3:  
               System.out.println("Smart");
               break;

            case 4:
              System.out.println("Ugly");
              break;

            case 5:  
               System.out.println("Idiot");
               break;
            
            case 6:  
               System.out.println("Fat");
               break;

            default:
               System.out.println("pussy!!");
                
        }
        scanner.close();
            }
}
