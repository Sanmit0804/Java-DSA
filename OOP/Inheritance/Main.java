package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box newBox = new Box();
        Box newBox2 = new Box(newBox);
        BoxWeight b3 = new BoxWeight();
        System.out.println(b3.weight);
        System.out.println(b3.l);
        // System.out.println(newBox.l);
        // System.out.println(newBox2.l);
    }
}
