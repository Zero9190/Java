interface Animal {
    public void animalSound();
    public void emote();
}

class Lion implements Animal{
    public void animalSound() {
        System.out.println("Rawr Rawr");
    }
    public void emote() {
        System.out.println("ZZzz");
    }
}

public class Second {
    public static void main(String[] args) {
        Lion lion = new Lion();

        lion.animalSound();
        lion.emote();
    }
}