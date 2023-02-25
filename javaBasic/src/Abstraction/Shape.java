package Abstraction;

abstract class Shape {

    String colour;
    public Shape(String colour){
        this.colour=colour;
    }


    abstract String info();
    abstract double area ();



    }


