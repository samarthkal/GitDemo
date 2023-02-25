package Interface;

public class Circle implements Shape{
    String color;
    double radius;

    public Circle(String color,double radius ){
        this.color=color;
        this.radius=radius;

    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public String info() {
        return "im circle and my color is "+color;
    }

    @Override
    public double area() {
        return  +radius*radius;
    }
}
