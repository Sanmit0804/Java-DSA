/*
POLYMORPHISM

Polymorphism -> poly - "many"
                morphism - "forms"

polymorphism allows objects of different classses to be treated as object of a common superclass.

-> Polymorphism can be achived through
1. Method Overloading (compile time polymorphism) (static)
2. Method Overriding (runtime polymorphism) (dynamic)

-> Polymorphism is a feature of OOPs language that means, the same entity(function or object) behaves differently in different scenarios.

*/

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

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sanmit";
        s1.age = 22;
        s1.printInfo(s1.name, s1.age);
    }
}
