package abstractionBasics.abstractClass;
// Abstraction
// Class and methods can be abstract using abstract keyword
 
abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}

public class one {
    public static void main(String[] args) {
        System.out.println("Abstraction concept..");
        Horse h1 = new Horse();
        h1.walk();
    }
}
