package Classes;

interface Animals {
    public void animalsSound(); // interface method (does not have a body)
    public void knownAs();
}

class Tiger implements Animals {
    public void animalsSound() {
        System.out.println("Rawr Rawr");
    }

    public void knownAs() {
        System.out.println("Big cat of the jungle");
    }
}

class Jaguar implements Animals {
    public void animalsSound() {
        System.out.println("Roar Roar");
    }

    public void knownAs() {
        System.out.println("Big cat of the night");
    }
}



 class Interface {
    public static void main(String[] args) {
    Tiger bigcat1 = new Tiger();
    Jaguar bigCat2 = new Jaguar();
    
    bigcat1.animalsSound();
    bigcat1.knownAs();
    bigCat2.animalsSound();
    bigCat2.knownAs();
    

    }
}
