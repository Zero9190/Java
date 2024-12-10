package Methods;

public class Haltingcondition {

    public static int sum(int start, int end) {
        if (start > end) {

            return start + sum(start - 1, end);

        }else {
            return start;
        }
    }

    public static int loopsum (int start, int end) {

        int sum = 0;

       for (int i = start; i >= end; i-- ){
        
        sum += i;

       }

       return sum;

    }

    

    public static void main(String[] args){

        int result = loopsum(10, 5);
        System.out.println(result);

        int results = sum(10, 5);
        System.out.print(results);

        

        
    }
}
