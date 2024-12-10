package Methods;
import java.util.Scanner;
public class Recursion {
    public static int sum(int x) {

        if(x > 0) {
            return x + sum(x - 2);
        } else {
            return 0;
        }
        
    }
    
   public static int sumloop(int x) {
        int result = 0;
        for(int i = x; i > 0; i-= 2){
            result += i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        System.out.println(sum(input));
        System.out.println(sumloop(500));

        scanner.close();
        

        
    }
}
