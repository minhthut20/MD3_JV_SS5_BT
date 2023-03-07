package AccessModifier;

public class TestCircle {
    private static double radius = 1.0;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    public  double getRadius() {
        return radius;
    }

     protected double getArea() {
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }
}
