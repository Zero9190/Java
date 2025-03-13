package Classes;

class OuterClass 
{

    String fname = "Jesver Kevin";

    class InnerClassPart
    {

        String lname = "Abelda";

    }

}


public class InnerClass 
{

    public static void main(String[] args)
    {

        OuterClass outer = new OuterClass();
        OuterClass.InnerClassPart inner = outer.new InnerClassPart();

        System.out.println(outer.fname + " " + inner.lname);

    }
   

}