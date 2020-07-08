package BT_acessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius of circle is " + circle.getRadius());
        System.out.println("Area of circle is " + circle.getArea());

        Circle circle1 = new Circle(5, "blue");
        System.out.println("Radius of circle is " + circle1.getRadius());
        System.out.println("Area of circle is " + circle1.getArea());
    }
}
