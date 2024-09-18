package polymorphismBasics;
// Polymorphism
// Types - 1. Function OverLoading (CompileTime Polymorphism)
//         2. Function Overriding (Runtime polymorphism)


class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class one {
    public static void main(String[] args) {
        System.out.println("Polymorphism concept..");

        Student s1 = new Student();
        s1.name = "Sanmit";
        s1.printInfo(s1.name);
    }
}