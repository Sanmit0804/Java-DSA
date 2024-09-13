class Shape {
    String color;

    public void area() {
        System.out.println("Display's area");
    }
}

class Triangle extends Shape {
    public void area(int length, int height) {
        System.out.println(1 / 2 * height * length);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int length, int height) {
        System.out.println(1 / 2 * height * length);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}
