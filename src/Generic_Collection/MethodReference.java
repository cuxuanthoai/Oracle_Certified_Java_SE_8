package Generic_Collection;

import java.util.*;
import java.util.function.*;

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

        //Update All Element
       // void replaceALl (UnaryOperator<E> o);

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        list1.replaceAll(x -> x*2);
        System.out.println(list1);//[2, 4, 6, 8]

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(0);
        list2.add(2);
        list2.replaceAll(x -> x*4);
        System.out.println(list2);//[8, 0, 8]


        //Using new java 8 Map APis
        Map<String,String> favorites = new HashMap<>();
        favorites.put("jenny","bus tour");
        favorites.put("jenny","tram");
        System.out.println(favorites);
        favorites.putIfAbsent("jenny","thoaikx");
        favorites.putIfAbsent("Tom","Tram");
        System.out.println(favorites);

        //meger
        BiFunction<String,String,String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1:v2;

        String jenny = favorites.merge("jenny","skyride",mapper);
        String tom = favorites.merge("Tom","skyride",mapper);

        System.out.println(favorites);
        System.out.println(jenny);
        System.out.println(tom);

//        The merge() method also has logic for what happens if null s
//        or missing keys are involved. In this case, it doesn’t call the
//        BiFunction at all, and it simply uses the new value:

//        The final thing to know about merge() is what happens when
//        the mapping function is called and returns null . The key is
//        removed from the map when this happens:


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
