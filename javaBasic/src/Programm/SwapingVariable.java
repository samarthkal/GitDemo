package Programm;

public class SwapingVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(b);
        System.out.println(a);

        String s="abcd";

        String ss="ABCDE";
        s = s+ss;
        System.out.println(s);
     String s1 = s.concat(ss);
      System.out.println(s1);
    }
}
