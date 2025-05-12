package OOPs;

abstract class Animal {
    abstract void walk();
    
    void eat(){
        System.out.println("Eating...");
    }
}

class Horse extends Animal{
    void walk() {
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal{
    void walk() {
        System.out.println("Chicken is walking");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
