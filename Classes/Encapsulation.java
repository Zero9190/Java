package Classes;
import java.util.Scanner;

class Person 
{

    private String fName, mName, lName;

    public String getName()
    {

        return fName + " " + mName + " " + lName;

    }

    public void setName(String fN, String mN, String lN)
    {

        this.fName = fN;
        this.mName = mN;
        this.lName = lN;

    }

}


public class Encapsulation
{

    public static String checker(String promt)
    {
        Scanner check = new Scanner(System.in);

        String input = " ";
        boolean isValid = false;

        while (!isValid)
        {


         
                System.out.print(promt);
                input = check.nextLine().trim(); 
                if ( input.matches("[a-zA-Z ]+"))
                {

                    isValid = true;
                    break;

                }

                else 
                {

                    System.out.println("ERROR: all names must be filled with letters only......");

                }

        }

        return input;

    }

    public static void main(String[] args)
    {
        Scanner check = new Scanner(System.in);
        Person user = new Person();
        String fN, mN, lN, choice;
      do {
  
        fN = checker("Enter your first name: ");
     
        mN = checker("Enter your middle name: ");
  
        lN =  checker("Enter your last name: ");

        user.setName(fN, mN, lN);

        System.out.println(user.getName());

        do 
        {

            System.out.println("Do you want to re-enter again: Yes or No : ");
            choice = check.next();

    

            if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No") )
            {

                System.out.println("ERROR: YES and NO only......");

            }

        }while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));

      } while (choice.equalsIgnoreCase("Yes"));

      System.out.println("Exited");
      check.close();

    }

  

}