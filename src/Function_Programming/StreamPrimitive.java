package Function_Programming;


import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrimitive {

    public static void main(String[] args) {
        Stream<Integer>  integerStream = Stream.of(1,2,3);
        System.out.println(integerStream.mapToInt(x ->x).sum());

        IntStream intStream = IntStream.of(1,2,3,4,5);
        DoubleStream doubleStream = DoubleStream.of(1,2,3.f,3.4f,4.5d).map(x -> (Math.round(x * 1000))/1000);
       doubleStream.forEach(System.out::println);

       IntStream count = IntStream.iterate(1,n -> n +1).limit(5);
       count.forEach(System.out::println);

       IntStream range = IntStream.range(1,6);// include and exlcude 1-5
       range.forEach(System.out::println);

       IntStream intStream1 = IntStream.rangeClosed(1,5);
       intStream1.forEach(System.out::println);




    }
}
