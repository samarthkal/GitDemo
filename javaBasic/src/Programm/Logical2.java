package Programm;

public class Logical2 {
    public static void main(String[] args) {

        whiteSpace();
        duplicateArray();
        countChar();
        upperLower();

    }
    public static void whiteSpace(){

        String s="SAM DAM DAND BHED KARMA KAHANI RAM ";
        int count=0;
        int lg = s.length();
        for (int i=1;i<=lg-1;i++){

            char ch = s.charAt(i);
            if (ch==' '){
                count++;
            }
        }
        System.out.println(count);


    }
    public static void duplicateArray(){

        int[] a = { 2,3,5,7,8,9,10,2,4,6,8,4,6};
        int lf = a.length-1;
        for (int i=0;i<=lf;i++){

            for (int j=i+1;j<=lf ;j++){

                if (a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }

        }
        public static void countChar(){

        String s="samarth kale from solapur maharashtra ";
       int  count=0;
       for (int i=0;i<=s.length()-1;i++){

           char ch = s.charAt(i);
           if(ch=='a'){
               count++;
           }
       }
            System.out.println(count);
        }
        public static void upperLower(){

        String s="automation testing with  driver and JAVA ";
        int upper=0;
        int lower =0;
        for (int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if (ch>65 && ch<95){
                upper++;
            }else{
                lower++;
            }
        }
            System.out.println("total characters in upper letter :"+upper);
            System.out.println("total characters in lower letter "+lower);
        }


    }

