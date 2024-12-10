package Loopings;
import java.util.Scanner;
public class Whileloop{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int inputNum, i = 0;

        System.out.print("Enter a number for program to count: ");
           inputNum = scanner.nextInt();
        
           while(i <= inputNum) {
              System.out.println(i);
              i++;
           }

           scanner.close();
    }
}