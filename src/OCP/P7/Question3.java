package OCP.P7;

import java.util.Arrays;
import java.util.List;

class Question3 {
 public static void main(String[] args) {
     List<Integer> value = Arrays.asList(1,2,3);
     value.stream()
             .map(n->n*2)
             .peek(System.out::println)
             .count();
    }
}