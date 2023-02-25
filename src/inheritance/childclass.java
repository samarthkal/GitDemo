package inheritance;

public class childclass extends Parentsclass {

    String str ="child class String";
    String commn="child class commn string";

    public childclass(){

        System.out.println("child class constructor");
    }
    public void superprint(){

        System.out.println(super.str);
        System.out.println(super.commn);
    }
    public void parentsmethods (){

        System.out.println("child  class methods using super key");
    }
    public void commn (){

        parentsmethods();
        super.parentsmethods();
    }

}
