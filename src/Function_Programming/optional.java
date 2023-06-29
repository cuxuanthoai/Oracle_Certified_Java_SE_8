package Function_Programming;

import java.util.Map;
import java.util.Optional;

public class optional {
    public  static Optional<Double> average(int ...scores){
        int sum = 0;
        if (scores.length ==0 ) return Optional.empty();
            for ( int score: scores) {
                sum += score;
            }
        return Optional.of((double) sum /scores.length);

    }

    public static void main(String[] args) {
        System.out.println(average(10,23,33));//Optional[22.0]
        System.out.println(average());//Optional.empty

        Optional<Double> opt = average(23,34);
        if (opt.isPresent()) System.out.println(opt.get());//28.5

        Optional<Double> opt2 = average();
       // if (opt.isPresent()) System.out.println(opt2.get());//NoSuchElementException: No value present

       //When creating an Optional , it is common to want to use
        //empty when the value is null

       // Optional optional = Optional.ofNullable(value);

        Optional<Double> optional = average(100,222);
        optional.ifPresent(System.out::println);

        Optional<Double> optionalDouble = average();
        System.out.println(optionalDouble.orElse(Double.NaN));
        System.out.println(optionalDouble.orElseGet(() -> Math.random()));
        System.out.print(optionalDouble.orElseThrow(() -> new RuntimeException()));

    }
}
