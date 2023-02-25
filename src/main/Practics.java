package main;

public class Practics {

    public static void main(String[] args) {
     //  reverse string
        String s="i like java";
        String rev="";
        System.out.println(s);
        for (int i=s.length()-1;i>=0;i--){

           rev +=s.charAt(i);
        }
        System.out.println(rev);

        // reverse string by using replace method

        String[] spil = s.split(" ");
        for (int j=spil.length-1;j>=0;j--){
            System.out.print(spil[j]+" ");
        }


    }
}
