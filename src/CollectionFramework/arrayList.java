package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.println;

public class arrayList  {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();     //  homogenious data type
        ArrayList al=new ArrayList();                    // hetrogenious data type
        List l=new ArrayList();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list);
        // add elements

        list.add(0,0);
        System.out.println(list);
        list.add(2,2);
        System.out.println(list);
        // get element
      int g=list.get(3);
        System.out.println(g);
        // size
      int lg=  list.size();
        System.out.println(lg);
        // set element
        list.set(3,3);
        System.out.println(list);
        list.set(4,4);
        System.out.println(list);

        //  sorting the list
        Collections.sort(list);   //  collections is wrapper class is constist statics methods onliy
        System.out.println(list);

   ArrayList< String> sg=new ArrayList<>();

      sg.add("hi");
      sg.add("hello");
      sg.add("how r u");
        System.out.println(sg);
        ArrayList<Boolean>bb=new ArrayList<Boolean>();
        bb.add(true);
        bb.set(0,false);
        bb.add(false);
        System .out.println(bb);
        ArrayList<Character> ch=new ArrayList<>();
        ch.add('A');
        ch.add('b');
        System.out.println(ch);
        Object cl = ch.clone();
        System.out.println(cl);

Arraylistdata();
    }
    public static void Arraylistdata(){
        ArrayList al=new ArrayList();
        al.add(12);
        al.add("sam kale");
        al.add(45.4);
        al.add(true);
        System.out.println(al);
        al.add(0,1);
        al.add(2,"from solapur ");
        System.out.println(al);
        double gg = (double) al.get(4);
       System.out.println(gg);
        boolean em = al.isEmpty();
        System.out.println(em);
          //   Collections.sort(al);

        System.out.println( al.size());
        al.remove(5);
        System.out.println(al);   // [1, 12, from solapur , sam kale, 45.4]

        String str= String.valueOf(al.get(3));
        System.out.println(str);
//   searching the element in arraylist object  by using contains methods
        boolean cs = al.contains("sam kale");
        System.out.println(cs);

        // read data from array list
        for (int i=0;i<al.size();i++){

         //   System.out.println(al.get(i));
        }

        Iterator it= al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
