package classObjectBasics;
// Basics of Class & Objects & Constructors


class Pen {
    String color;
    String type;

    void write() {
        System.out.println("Writing..!!");
        System.out.println("Colour of pen is : " + this.color);
        System.out.println("Type of pen is : " + this.type);
    }
}

class Student {
    String name;
    int age;
    String rollNo;

    void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-parametarized constructor (Default Constructor)
    Student(){
        System.out.println("Student Constructor called..!");
    }
    
    // Parametarized constructor
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class one {
    public static void main(String[] args) {
        System.out.println("Welcome...!");

        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "ballpen";

        // pen1.write();
        // pen2.write();

        // Student s1 = new Student();
        // s1.name = "Sanmit";
        // s1.age = 22;
        // s1.printInfo();

        Student s2 = new Student("Rock", 20);
        // s2.printInfo();

        Student s3 = new Student(s2);
        s3.printInfo();
    }
}