package OCP.P7;

import java.util.Arrays;
import java.util.List;

class Question38 {
 public static void main(String[] args) {
     List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
     System.out.println ( listVal.stream().filter(x -> x.length()>3).count());
     System.out.println ( listVal.stream().map(x -> x.length()>3).count());
     //System.out.println ( listVal.stream().peek(x -> x.length()>3).count().get());
    // Bad return type in lambda expression: boolean cannot be converted to void at x -> x.length()>3
    // System.out.println ( listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count());//compiler at MapToInt(x -> x)
     //Bad return type in lambda expression: String cannot be converted to int
    /* -> fix
     System.out.println ( listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x.length()).count());*/


    }
}