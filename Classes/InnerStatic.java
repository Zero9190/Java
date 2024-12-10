package Classes;

class Outer {
    static int x = 10;

    static class Inner {

        int y = 5;
        int a =  x;
// Static Inner Class can only access outer fields or methods who also in static.
    }
}



public class InnerStatic {
    public static void main(String[] args) {
       Outer.Inner inner = new Outer.Inner(); 
       // no need to create OuterClass object because the InnerClass is static a static.
       System.out.println(inner.y + inner.a);
    }
}
