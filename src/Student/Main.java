package Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Thu");
        student.setClasses("Java 10");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
