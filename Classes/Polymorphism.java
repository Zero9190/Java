package Classes;


class Animal{

    public  void animalSound(){

        System.out.println("Animal Sounds.");

    }

}

class Dog extends Animal{

    public void animalSound(){

        System.out.println("Dog says: Woof Woof");

    }

}

class Cat extends Animal{

    public  void animalSound(){

        System.out.println("Cat says: Meow Meow");

    }

}



public class Polymorphism {

    public static void main(String[] args){

        Animal myAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();


        myAnimal.animalSound();
        dog.animalSound();
        cat.animalSound();





    }

}