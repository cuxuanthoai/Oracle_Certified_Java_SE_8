package OCP.P1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Question60 {
 public static void main(String[] args) {
     List<String> nL = Arrays.asList("Jim", "John", "Jeff");
     Function<String, String> funVal = s -> "Hello : ".concat("hello");
     nL.stream()
             .map(funVal)
             .peek(System.out::print);

    }
}
/*
Correct answer is C, since peek is an intermediate lazy operation which will
not be evaluated unless the pipeline is ended with a terminating operation.
    What is the result?
        A. Hello : Jim Hello : John Hello : Jeff
        B. Jim John Jeff
        C. The program prints nothing. (this answer)
        D. A compilation error occurs.*/
