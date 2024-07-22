import java.util.*;

public class myClass {
    public static void main(String[] args) {
        // rollno of 5 students
        // int[] rno = new int[5];

        // names of 5 students
        // String[] names = new String[5];

        Student s1 = new Student(); // Creating object
        Student[] students = new Student[5];
        s1.no = 1;
        s1.name = "Sanmit";
        s1.marks = 99.99f;

        System.out.println(s1.marks);
        System.out.println(Arrays.toString(students));
    }
}

// Student class
// for every single student
class Student {
    int no;
    String name;
    float marks;
}