package Programm;

public class Test {
    public static void main(String[] args) {
       Test2();
        int n=0;
        int n1=1;
        int count=15;
        int n2;
        System.out.print("fn series:"+n+" "+n1);

        for(int i=2;i<count;i++ ){

           n2=n+n1;
           n=n1;
           n1=n2;
            System.out.print(" "+n2);

        }
    }
    public static void Test2(){

        int arry1 []={11,22,44,77,88,55};
        int []arry2 ={22,44,77,55,88};
        System.out.println(arry1.equals(arry2));

        for (int i :arry2){
            System.out.println(i);
        }

    }
}
