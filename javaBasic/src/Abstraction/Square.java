package Abstraction;

public class Square extends Shape{
    public Square(String colour) {
        super(colour);
    }

    @Override
    String info() {
        return "im square from shape class"+super.colour;
    }

    @Override
    double area() {
        return 5.0*5;
    }
}
