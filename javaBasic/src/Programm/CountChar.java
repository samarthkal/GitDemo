package Programm;

import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {

        String s="ABSSBSSKKKSS";
        int cout= 0;
        for (int i=0;i<s.length();i++){

            if (s.charAt(i)=='S'){

                cout++;
            }
        }
        System.out.println(cout);
        alternateCount();
    }
    public static void alternateCount(){

        String s="samarth kale from solapur";
        int lg = s.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i=0;i<lg;i++){
            char ch = s.charAt(i);
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else {
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

    }
}
