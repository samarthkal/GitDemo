package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Numbers {
    public static void main(String[] args) {

  // print the sum of number of arrays

        List<Integer> list= Arrays.asList(2,4,7,8,5,11,15);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("sum of number is :"+sum.get());

  //  print the avg of number

        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("avg of number is: "+avg);

  //     print the avg of number of square
        // 4,16,49,64,25, 121,225
        // 121+225=346 ,  346/3= 115.333
        double avgOfSquarenum = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println("avg of square number is ;"+avgOfSquarenum);
    }

}
