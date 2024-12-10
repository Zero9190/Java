package Classes;

class Animal {

    public void animalSound(){

        System.out.println("The animal makes a sound");

    } 
   
}

class Lion extends Animal {

    public void animalSound(){

        System.out.println("The Lion says: rawr rawr");

    }

}

class Gorilla extends Animal {

    public void animalSound() {

        System.out.println("The Gorilla says: ho ho");

    }

}

class Inheritance {

    public static void main(String[] args){

        Animal myAnimal = new Animal();
        Animal myLion = new Lion();
        Animal myGorrila = new Gorilla();

        myAnimal.animalSound();
        myLion.animalSound();
        myGorrila.animalSound();


    }

}



