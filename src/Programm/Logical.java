package Programm;

public class Logical {

    public static void main(String[] args) {

        naturalNo();
        FactorialNo();
        Fibonacci();
        primeNo();
        specialFor();
    }

    public static void naturalNo(){

        for (int i=1;i<=100;i++){

            System.out.print(i+" ");
        }
    }
    public static void FactorialNo(){
        int number=6;
        int factorial=1;
        System.out.println("given number is :"+number);
        for (int i=number;i>0;i--){

           factorial= factorial*i;

        }
        System.out.println(" factorial of "+number+ " is ="+factorial);
    }
    public static  void Fibonacci(){
        int n1=1;
        int n2=1;
        int count=10;
        int num=0;
        System.out.println("fibonaccis series is:"+n1+ " "+n2 );
        for (int i=2;i<=count;i++){

            num= n1+n2;
            n1=n2;
            n2=num;
            System.out.print( num+" ");
        }

    }
    public static void primeNo(){
        int num=17;
        int count=0;

        for (int i=2;i<num;i++){

            if (num%i==0){
               count= count+1;
            }

        }
        if(count==0){
            System.out.println("Given number is prime");
        }
        else {
            System.out.println("Given number is not prime");
        }
    }
    public static void specialFor(){

        int a,b,c,d,e,f,g,h,i,j;
        for (a=1,b=20,c=21,d=40,e=41,f=60,g=61,h=80,i=81,j=100;a<=10;a++,b--,c++,d--,e++,f--,g++,h--,i++,j--){

            System.out.println(a+" "+b+ " "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);
         //   System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
        }

        for (a=1, b=20,c=21,d=40,e=41,f=60;a<=10;a++,b--,c++,d--,e++,f--)
        {
      //      System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
        }
    }

}
