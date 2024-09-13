class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something!");
    }

    public void printInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void printStudentName() {
        System.out.println("Name of the student is : " + this.name);
    }

    // Non-parameterized constructor
    Student() {
        // System.out.println("Constructor called..!");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Sanmit Suthar" , 23);
        s1.printStudentName();

        Student s2 = new Student(s1);
        s2.printStudentName();
    }
}