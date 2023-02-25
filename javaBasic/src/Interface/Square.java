package Interface;

public class Square implements Shape{
     String color;
     double radius;
     public Square(String color,double radius){
       this.color=color;
       this.radius=radius;


     }
    @Override
    public String color() {
        return color;
    }

    @Override
    public String info() {
        return "im a Square and my color is "+color()+"and my area is:"+area();
    }

    @Override
    public double area() {
        return radius*radius;
    }
}
