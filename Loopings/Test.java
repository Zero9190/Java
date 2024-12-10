package Loopings;
public class Test {

    public static void main(String[] args){
        int num = 100;

        for (int i = 1; i <= num; i++){

            if (i % 3 == 0 && i != 0){
                System.out.println("Buzz");
            }else if (i % 5 == 0){
                System.out.println("Beef");
            }else if (i % 2 == 0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}