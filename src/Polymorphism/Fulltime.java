package Polymorphism;

public class Fulltime extends Employee {

   String commn ="sub class String (fulltime) ";
    @Override
    int salary (){

        return base +20000;

    }
    public void myworld(){

        System.out.println(commn);
    }



}
