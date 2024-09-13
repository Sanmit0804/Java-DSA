class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student.school = "Utkarsh";
        Student s1 = new Student();
        s1.name = "Sanmit";
        // System.out.println(s1.school);
    }
}
