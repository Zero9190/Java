package Classes;

class OuterClass {

    int x = 10;

    //private class InnerClass {

        int y = 5;

  //  }

}


public class InnerPrivate {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        //OuterClass.InnerClass inner = outer.new InnerClass();
        // Error: cannot access private class
        System.out.println(outer.x);

    }
    
}
