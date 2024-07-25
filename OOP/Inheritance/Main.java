package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box newBox = new Box();
        Box newBox2 = new Box(newBox);
        System.out.println(newBox.l);
        System.out.println(newBox2.l);
    }
}
