package streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,6,7,4,2,5,3,7,3,4);
        Set<Integer> dup = list.stream().
                filter(e -> Collections
                        .frequency(list, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(dup);


        Set<Integer> number= new HashSet<Integer>();
        Set<Integer> dupnum = list.stream().
                filter(e -> !number.add(e))
                .collect(Collectors.toSet());
        System.out.println("Duplicate number in Arrays are: "+dupnum);
        duplicate();
    }

    public static void duplicate(){
         int []ar={2,3,4,6,7,8,9,10,2,3,7,6,4};

         for (int i=0;i<=ar.length;i++){

             for (int j=i+1;j<ar.length;j++){

                 if (ar[i]==ar[j]){

                     System.out.println(ar[j]);
                 }
             }
         }
    }


}
