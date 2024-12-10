package Classes;

public class Constractors {
int x;
String fName;
public Constractors(int y, String fName){
    x = y;
    this.fName = fName;
}

public static void main(String[] args) {
    Constractors myObj = new Constractors(5, "Jesver");

    System.out.print(myObj.x +" " + myObj.fName);
}
}
// Also note that the constructor is called when the object is created.