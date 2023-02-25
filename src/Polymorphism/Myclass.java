package Polymorphism;

public class Myclass {
    public static void main(String[] args) {

        Employee e=new Fulltime();
         e.myworld();
        System.out.println("fulltime employee salary is"+  e.salary());
        e=new Contractor();
        System.out.println("contracotr employee salary is"+  e.salary());
        System.out.println("employee increments salary is:"+ e.increments());
        System.out.println("increments methods of employee:"+e.incremrnts(2000));
        System.out.println("fulltime employee desigation:"+e.deg);
      e=new Employee();
       e.samarth();
       e.myworld();





    }
}
