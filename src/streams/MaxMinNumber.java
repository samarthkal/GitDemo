package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinNumber {

    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,4,5,6,7,8,9,34,0);

        Integer max = number.stream()
                               .max(Comparator.comparing(Integer::valueOf))
                               .get();
        System.out.println("maximum number is: "+max);

        Integer min = number.stream()
                                  .min(Comparator.comparing(Integer::valueOf))
                                  .get();

        System.out.println("minimum number is: "+min);


sortedArray();
    }
    public static void sortedArray(){

        List<Integer>list=Arrays.asList(2,3,6,7,3,9,4,1,0,66,44,55,77);
        List<Integer> sortedlist = list.stream().
                                      sorted()
                                        .collect(Collectors.toList());
        System.out.println("arrays sorted in ascending order : "+sortedlist);

        List<Integer> descedList = list.stream()
                                    .sorted(Collections.reverseOrder())
                                     .collect(Collectors.toList());
        System.out.println("arrays sorted in descending order : "+descedList);
    }
}
