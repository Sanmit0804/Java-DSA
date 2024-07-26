package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // Circle circle = new Circle();
        // Square square = new Square();
        // Shapes triangle = new Triangle();

        // triangle.area();

        // shape.area();
        // circle.area();

        Shapes.greetings(); // Calling Static method
        // Shapes.greetings2();   // This leads error -> coz we are trying to call Non-static method without creating an object
        shape.greetings2();
    }
}
