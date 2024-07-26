package Polymorphism;

public class Circle extends Shapes {

    // This will run when obj of Circle is created
    // Hence, It's overriding the parent class
    @Override // This is called Annotation
    void area() {
        System.out.println("I am in Circle");
    }
}
