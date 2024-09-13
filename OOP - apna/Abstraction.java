// Process of hiding irrelevant details from user is called data abstraction.

/*

Two ways: 1. Abstract class
             2. Interface 

*/

// End users had no point to view what is in Animal class, so to remove irrelevent data from user "abstract" keyword is used.
// abstract class Animal {
//     abstract void walk();

//     Animal() {
//         System.out.println("You are creating new animal");
//     }

//     public void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Created a horse");
//     }

//     public void walk() {
//         System.out.println("Walks on 4 legs..!");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs..!");
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         // horse.walk();
//         // horse.eat();
//     }
// }


// Abstraction using Interface

interface Animal {
    int eyes = 2;
    void walks();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Walks on 4 legs..!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }

}
