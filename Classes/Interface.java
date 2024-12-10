package Classes;

interface Animals {
    public void animalsSound(); // interface method (does not have a body)
    public void knownAs();
}
// Pig "implements" the Animal interface
class Tiger implements Animals {
    public void animalsSound() {
        // The body of animalSound() is provided here
        System.out.println("Rawr Rawwwr");
    }

    public void knownAs() {
        // The body of animalSound() is provided here
        System.out.println("Big Cat");
    }
}

public class Interface {
    public static void main(String[] args) {
    Tiger lion = new Tiger();

    lion.animalsSound();
    lion.knownAs();

    }
}
