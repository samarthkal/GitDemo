package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(3,4,5,7,8,9,2,3,67,99,33);

    // get me first 5 number ---> sum of 5 number
        List<Integer> l = list.stream()
                                 .limit(5)
                                   .collect(Collectors.toList());
        System.out.println(l);
        Integer sum = list.stream().
                        limit(5)
                        .reduce((p, q) -> p + q)
                         .get();
        System.out.println("sum of first 5 number is :"+sum);

    // skip first 5 number
        List<Integer> skp = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skp);

    }
}
