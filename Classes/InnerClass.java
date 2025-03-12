package Classes;

class OuterClassPart 
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

        OuterClassPart outer = new OuterClassPart();
        OuterClassPart.InnerClassPart inner = outer.new InnerClassPart();



        System.out.print(outer.fname + " " + inner.lname);


    }

}