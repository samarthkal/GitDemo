package Abstraction;


public class Circle extends Shape{
    double radius ;

    public Circle(String colour,double radius) {
        super(colour);
        this.radius=radius;

    }

    @Override
    String info() {
        return "i am "+ super.colour +"circle and my area is "+area();
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2.0);
    }
}
