package Interface;

public class Myclass {
    public static void main(String[] args) {

        Circle c=new Circle("red",5);
        System.out.println(c.color());
        System.out.println(c.area());
        System.out.println(c.info());
        Square s=new Square("black",10);
        System.out.println(s.info());
        System.out.println(s.area());
    }
}
