package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {
    public static void main(String[] args) {

// even number
        List<Integer>list= Arrays.asList(2,5,6,8,7,9,2,11,10);
        List<Integer> evenNumber = list.stream()
                                          .filter(e -> e % 2 == 0)
                                             .collect(Collectors.toList());

        System.out.println("Even number are :"+evenNumber);

 //  odd number
        List<Integer> oddNumber = list.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd number are :"+oddNumber);
        startWith();

    }
public  static void startWith(){

        List<Integer>number=Arrays.asList(2,233,45,27,29,266,222,11);
    List<Integer> str = number.stream()
            .map(e -> String.valueOf(e))
                  .filter(e -> e.startsWith("2"))
                       .map(Integer::valueOf)
                           .collect(Collectors.toList());
    System.out.println("Start with 2 integer are: "+str);

    }
}
