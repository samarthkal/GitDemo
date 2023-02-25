package Programm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {

    public static void main(String[] args) {

        int ar []={2,3,4,5,67,8};
        String sr[]={"kam","ram","lam","sam","dam"};

       ArrayList list=new ArrayList(Arrays.asList(sr));     // converting array to arraylist by using Arrays class
                                                           //  and aslist method
       list.add("sam");
       list.add("dam");
        System.out.println(list);
        System.out.println(list);

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);
        Collections.sort(list);
        System.out.println(list);

    }
}
