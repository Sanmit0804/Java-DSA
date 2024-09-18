package abstractionBasics.interfaces;

interface Animal {
    void walk();
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

public class one {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
