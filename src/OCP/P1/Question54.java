package OCP.P1;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

class Question54 {
 public static void main(String[] args) {
     List<Integer> codes = Arrays.asList (10, 20);
     UnaryOperator<Integer> uo = s -> s +10;// UnaryOperator<Double> uo = s -> s +10.0; cause compiler error
     codes.replaceAll(uo);
     codes.forEach(c -> System.out.println(c));
    }
}