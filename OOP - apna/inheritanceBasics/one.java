package inheritanceBasics;
// Inheritance

// 1. Single-level Inheritance
// 2. Multi-level Inheritance
// 3. Hierarchical Inheritance

class Shape {
    String color;

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area() {
        System.out.println("This is Triangle's area");
    }
}

class Circle extends Shape{
    public void area(){
        System.out.println("This is circle's area");
    }
}

public class one {
    public static void main(String[] args) {
        System.out.println("Inheritance concepts..!");

        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();
    }
}
