package Polymorphism;

public class Employee {
    int base=10000;
    String deg="tester";
    String commn ="super class String (Employee) ";

    int salary(){

        return base;

    }
    int increments (){
        return base+base;

    }
    int incremrnts (int i ){

        return base+i;

    }
    public void samarth (){

        System.out.println("employee class  desigation is:"+deg);

    }public void myworld(){
        System.out.println(commn);
    }
}
