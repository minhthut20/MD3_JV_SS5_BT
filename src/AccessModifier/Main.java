package AccessModifier;

import Student.Student;

public class  Main  {
    public static void main(String[] args) {
        TestCircle circle = new TestCircle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println();
    }
}
