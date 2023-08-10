package OCP.P7;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

class Question2 {
 public static void main(String[] args) {
     IntStream stream = IntStream.of(1,2,3);
     IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;

     //IntFunction<Integer> inFu = x ->y -> x*y; //line 1 compiler error
  /*   This line defines a functional interface IntFunction, which takes an int as input (x) and
     returns an IntUnaryOperator. IntUnaryOperator is another functional interface that takes an
     int as input (y) and returns an int.*/
     IntStream newStream = stream.map(inFu.apply(10));
    }
}