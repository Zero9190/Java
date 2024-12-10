package Classes;

public class Abstract1 {


    public static void main(String[] args) {

        User Obj = new User();

        System.out.println("User's full name: " + Obj.fName + " " + Obj.lName);
        System.out.println("User's age: " + Obj.age);
        Obj.greetings();
        Obj.emote();
    }
    
}
