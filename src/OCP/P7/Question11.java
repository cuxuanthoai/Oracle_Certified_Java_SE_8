package OCP.P7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Question11 {
 public static void main(String[] args) {
     Stream<List<String>> iStr= Stream.of (
             Arrays.asList ("1", "Jone"),
             Arrays.asList ("2", null));

   //  Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream ());
   /*  Compilation error: incompatible types: bad return type in lambda expression
     Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream());
     iStr.flatMapToInt((x)  return Intstream
     Stream<String> cannot be converted to IntStream*/
     //nInSt.forEach (System.out :: print);
    }
}