package Programm;

public class ArrayPractics {
    public static void main(String[] args) {

        int [] maks=new int[4];

        maks [0]=98;
        maks [1]=88;
        maks [2]=99;
        maks [3]=89;
        System.out.println(maks[2]);
        System.out.println(maks[1]);
        System.out.println(maks[0]);
        for (int i=0;i<3;i++){
      //      System.out.println(maks[i]);
  }
        int a []   ={45,46,38,39,35,50}  ;
        for (int b:a)  {
       //    System.out.println(b);
        }
        System.out.println(a[5]);
        System.out.println(a[4]);
        stringPrograms();
    }

    public static void stringPrograms(){

        String s="samarth kale";
        String rev=" ";
        int lg = s.length()-1;
        for (int i=lg;i>=0;i--){
           rev= rev+ s.charAt(i);
        }
        System.out.println(rev);
    }
}
