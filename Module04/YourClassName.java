// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

// public class MySolution {
//     public static List<Integer> getEvens(List<Integer> numbers) {
//         List<Integer> evens = new ArrayList<>();
//         for (int i = 0; i < numbers.size(); i++) {
//             if (numbers.get(i) % 2 == 0) {
//                 evens.add(numbers.get(i));
//             }
//         }
//         return evens;
//     }

//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // this function is a quick way to build a
//                                                                               // list
//         List<Integer> evens = getEvens(numbers);
//         System.out.println(evens);
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class YourClassName {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // this function is a quick way to build a
                                                                              // list
        List<Integer> evens2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evens2);
    }
}