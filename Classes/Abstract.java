package Classes;

abstract class Abstract {
    public String fName = "Jesver Kevin";
    public int age = 23;
    public abstract void greetings();
    public void emote(){
        System.out.print("Daddy's Home!!!");
    }
}


class User extends Abstract {
    public String lName = "Abelda";
    public void greetings() {
        System.out.print("Hello World ");
    }
}
