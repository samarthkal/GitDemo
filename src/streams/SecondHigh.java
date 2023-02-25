package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigh {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,7,8,9,12,23,25,28);

 // print the second-highest value in arrays

        Integer secondHigh = list.stream()
                             .sorted(Collections.reverseOrder())
                               .distinct()
                                .skip(1).findFirst().get();
        System.out.println("second highest value is :"+secondHigh);

        // print the second-lowest value in arrays

        Integer selowest = list.stream()
                             .sorted().
                               distinct()
                                .skip(1).findFirst().get();
        System.out.println("second lowest value :"+selowest);
    }
}
