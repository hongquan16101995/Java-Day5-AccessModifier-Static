package BT_acessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    protected double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
