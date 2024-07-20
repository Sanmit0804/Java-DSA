public class myClass {
    public static void main(String[] args) {
        // rollno of 5 students
        // int[] rno = new int[5];

        // names of 5 students
        // String[] names = new String[5];

        Student s1 = new Student();     // Creating object 
        s1.rno[0] = 44;
        s1.name[0] = "Sanmit";
        s1.marks[0] = 87.4f;

        System.out.println(s1.marks[0]);
    }
}

// Student class
class Student {
    // (Rollno, name & marsk) of the 5 students
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
}