package main;

import java.util.Arrays;
import java.util.List;

public class MultiArrays {
    public static void main(String[] args) {

        int [] [] value= {
                {2, 3, 4, 5, 6,},
                {4, 5, 6, 7},           // row 1 and col 1
                {89, 34, 55, 66}
        };
        //  System.out.println(value[1][1]);
     //     System.out.println(value[0][1]);

        for (int i=0;i<value.length;i++){

            for (int col=0;col<value[i].length;col++){
                System.out.println(value[i][col]+"\t");
            }
        }

        String [][] words={{"sam","dam"},
                {"kam","the java","jdk"}};
        System.out.println(words[0][0]);
        String [][] s=new String[2][2];
        s[0][0]="Arrays";
        s[0][1]="arraylist";
        System.out.println(s[1][0]);
        System.out.println(s[0][1]);
        System.out.println(s[0][0]);
        main();
    }
    static void main(){

        int [] ar={2,5,6,7,10,30,56};
        List<int[]> coll = Arrays.asList(ar);
        

        for (int a:ar){
            System.out.println(a);
        }
        long c = Arrays.stream(ar).count();
        System.out.println(c);
        Arrays.stream(ar).sorted();
        coll.stream().sorted();

    }
}
