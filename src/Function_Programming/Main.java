package Function_Programming;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {

    public static <T> T writeAll(Collection<? extends T> coll, Sink<T> snk) {
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }

    public static void main(String[] args) {
        //supplier
        Supplier<LocalDate> s1 = LocalDate::now;

        LocalDate localDate = s1.get();
        System.out.println(localDate);

        //comsume
        Consumer<String> consumer = System.out::println;
        consumer.accept("Thoaikx");

        //BiConsume
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String,Integer> b1 = map::put;
        b1.accept("check",1);

        //Predicate
        Predicate<String> p1 = String::isEmpty;
        System.out.println(p1.test("Thoaikx"));
        //Bi-Predicate
        BiPredicate<String,String> biPredicate = String::startsWith;
        biPredicate.test("thoai","t");


    }

}

interface  Gorilla {
    String move();
}
interface Sink<T> {
    void  flush(T t);
}





