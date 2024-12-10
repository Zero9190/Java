package Classes;

public class Modifiersmethod {
    static void staticMethod() {
        
        System.out.println("Static methods can be called without creating objects");

    }

    public void publicMethod() {

        System.out.println("Public methods must be called by creating objects");

    }


    public static void main(String[] args) {
        
        Modifiersmethod Obj = new Modifiersmethod();

        staticMethod();

        Obj.publicMethod();

    }


}
