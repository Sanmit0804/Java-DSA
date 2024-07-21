public class myClass {
    public static void main(String[] args) {
        // rollno of 5 students
        // int[] rno = new int[5];

        // names of 5 students
        // String[] names = new String[5];

        Student s1 = new Student(); // Creating object
        s1.no = 1;
        s1.name = "Sanmit";
        s1.marks = 99.99f;

        System.out.println(s1.marks);
    }
}

// Student class
class Student {
    // (Rollno, name & marks) of the 5 students
    int no;
    String name;
    float marks;
}