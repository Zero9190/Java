package Classes;
import java.util.Scanner;

public class Encapsulation {
    
    private String fName, lName, mName;

   

    public String getFullName() {

        return fName + " " + lName + " " + mName;

    }

    public void  setterFullName(String fN, String lN, String mN) {
        this.fName = fN;
        this.lName = lN;
        this.mName = mN;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Encapsulation Ob = new Encapsulation();

        System.out.print("What is your first name: ");
        String fn = scanner.nextLine();
        System.out.print("Whats is your last name: ");
        String ln = scanner.next();
        System.out.print("What is your middle name: ");
        String mn = scanner.next();

        Ob.setterFullName(fn, ln, mn);

        System.out.print(Ob.fName + " " + Ob.lName + " " + Ob.mName);

        scanner.close();


        





    }
}
