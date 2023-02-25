package Programm;

public class RevrseString {
    public static void main(String[] args) {

        String s="samarth nandkumar kale";
        int r = s.length();
       for (int i=1;i<=r;i++){


           char ch = s.charAt(r-i);
           System.out.println(ch);
       }

       String k="welcome to india and maharashtra";
        String[] sp = k.split(" ");
        int size = sp.length-1;
        for (int j=size;j>=0;j--){


          System.out.println(sp[j]);
        }
        rev();
    }

    public static void rev(){
        String s="this is the string ";

        String[] sp = s.split(" ");

        int siz = sp.length-1;
        for (int i=siz;i>=0;i--) {


            System.out.print(sp[i]+" ");
        }

    }


}
