package Polymorphism;

public class Contractor extends Employee{

  String deg="automation tester";

    @Override
    int salary() {
        return base +5000;
    }
    public String printsalary(){

       return deg;
    }
    @Override
     public void samarth (){

        System.out.println("contrcator class employee desigation is:"+ deg);
    }

}
