import java.util.Scanner;
public class IFcondition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user's name: ");
        String userName = scanner.nextLine();
        System.out.print("Eneter your age: ");
        int inputAge = scanner.nextInt();
        int votingAge = 18;

        if(inputAge >= votingAge){
            System.out.println(userName + " "+"You're legal to vote!!");
        }else{
            System.out.println(userName + " "+"You're not yet legal to vote this year!!");
        }
      scanner.close();

    }

}
