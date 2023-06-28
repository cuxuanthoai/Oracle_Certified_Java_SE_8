package Generic_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {

        //static method reference
        Comparator<Duck> comparator = (d1 ,d2) -> DuckHelp.compareByName(d1,d2);
        Comparator<Duck> duckComparator = DuckHelp::compareByName;

        //Instance method on particular instance;
        Consumer<List<Integer>> methodref1 = Collections::sort;
        Consumer<List<Integer>> lambda =  l-> Collections.sort(l);
        //Instance method on an instance to be determined at runtime;
        String abc ="thpa";
        Predicate<String> methodref2 = abc::startsWith;
        methodref2.test("T");

        //Constructor
        Supplier<ArrayList> methodref4 = ArrayList::new;
        methodref4.get();

        //remove if
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");list.add("a");
        System.out.println(list);
        list.removeIf(s -> s.startsWith("a"));

        //Predicate without lambda
        Predicate<String> startsWithAPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("a");
            }
        };
        list.removeIf(startsWithAPredicate);

        System.out.println(list);
        list.add("j");
        list.add("");
        list.removeIf(String::isEmpty);
        System.out.println(list);



    }
}

class  DuckHelp {
    public  static  int compareByWeight(Duck d1 , Duck d2){
        return 7;
    }
    public  static  int compareByName(Duck d1 , Duck d2){
        return 10;
    }
}
