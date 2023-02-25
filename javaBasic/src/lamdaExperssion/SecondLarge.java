package lamdaExperssion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLarge {
    public static void main(String[] args) {

        int [] al={23,4,5,8,9,10,15,20};
        List<int[]> li = Arrays.asList(al);
        System.out.println();
        List<Integer>list= Arrays.asList(24,56,78,23,15,25,80,90,100,120);

        Integer secondhigh = list.stream()
                                  .sorted(Collections.reverseOrder())
                                    .distinct().skip(1).
                                       findFirst().get();
        System.out.println("second highest value is: "+secondhigh);
    }
}
