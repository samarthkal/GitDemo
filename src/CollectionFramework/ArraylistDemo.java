package CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistDemo {
    public static void main(String[] args) {


        ArrayList al=new ArrayList<>();
        al.add("x");
        al.add("y");
        al.add("z");
        al.add("a");
        al.add("b");

        ArrayList duplicate= new ArrayList<>();
        duplicate.addAll(al);    // add all elements
        System.out.println(duplicate);

        duplicate.removeAll(duplicate);   // remove all elements
        System.out.println(duplicate);

        // sorting array
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al);
        Collections.reverseOrder();

        // shuffling elements
        Collections.shuffle(al);
        System.out.println(al);
        arraytoArraylist();

    }
    public static void arraytoArraylist(){

        String str [] ={ "sam","dam","kam","ram"};

        //  convert array to arraylist object

        ArrayList al =new ArrayList(Arrays.asList(str));
        System.out.println(al);
    }
}
