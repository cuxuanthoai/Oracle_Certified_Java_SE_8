package Function_Programming;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

//         Source: Where the stream comes from.
//        Intermediate operations: Transforms the stream into another
//        one. There can be as few or as many intermediate operations
//        as you’d like. Since streams use lazy evaluation, the
//        intermediate operations do not run until the terminal
//        operation runs.
//        Terminal operation: Actually produces a result. Since streams
//        can be used only once, the stream is no longer valid after a
//        terminal operation completes
public class stream {
    public static void main(String[] args) {
        //create stream
        Stream<String> empty = Stream.empty();
        Stream<Integer> integerStream = Stream.of(1,2,3,5,4);

        List<String> list = Arrays.asList("a","J","a");
        Stream<String> stringStream = list.stream();

        Stream<Double> random = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1,n ->n+2);
      //when call such as foreach -> run continously produce random values when consumed

        //Common teminal operations

        Stream<String> s = Stream.of("mha","a");
        System.out.println(s.count());

        Stream<String> s1 = Stream.of("ahah","ahhah");
        Optional<String> min = s1.min((s2,s3)-> s2.length() -s3.length());
        //Optional<String> min = s1.min(Comparator.comparingInt(String::length));
        //varible s2, s3 i all class ( mean if named s1 -> error)
        min.ifPresent(System.out::println);
        //allMatch , anyMatch , noneMatch include Predicate as parameter
        List<String> list2 = Arrays.asList("Mpk","ahah","aka");
        Stream<String> stringStream1 = Stream.generate(()->"thoaikx");
        Predicate<String> stringPredicate = x -> Character.isLetter(x.charAt(0));
        System.out.println(list2.stream().anyMatch(stringPredicate));

        //example using peek to debug
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .peek(num -> System.out.println("Processing element: " + num))
                .map(num -> num * 2)
                .peek(result -> System.out.println("Transformed element: " + result))
                .forEach(System.out::println);
//result
//        Processing element: 1
//        Transformed element: 2
//        2
// ...

//        Processing element: 5
//        Transformed element: 10
//        10
    }
}
