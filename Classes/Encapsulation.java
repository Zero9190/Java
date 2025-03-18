package Classes;
import java.util.Scanner;

class Person 
{
    private String fName, mName, lName;

    public String  getFulName()
    {

        return fName + " " + mName + " " + lName; 

    }


    public void setFullName(String fN, String mN, String lN)
    {

        this.fName = fN;
        this.mName = mN;
        this.lName = lN;

    }

}


public class Encapsulation
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        String fN, mN, lN;

        System.out.println("First name: ");
        fN = scanner.nextLine().trim();
        System.out.println("Middle name: ");
        mN = scanner.nextLine().trim();
        System.out.println("Last Name: ");
        lN = scanner.nextLine().trim();

        person.setFullName(fN, mN, lN);

        System.out.println(person.getFulName());
        

    }

}