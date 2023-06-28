package Generic_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//formal type parameter
//A raw type is the name of a generic class or
// interface without any type arguments. For example, given the generic Box class:
public class Generic_Collection {

    public static void main(String[] args) {

        //Search and Sorting
        int[] number = {1, 2, 3, 3, 66};
        Arrays.sort(number);
        System.out.println(Arrays.binarySearch(number, 4));// <0
        System.out.println(Arrays.binarySearch(number, 1));//>0

        List<Integer> list = Arrays.asList(9, 6, 4, 3);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 3));

        //Wrapper class
        List<Integer> number2 = new ArrayList<Integer>();
        number2.add(1);
        number2.add(new Integer(4));
        number2.remove(1);
        number2.remove(new Integer(4));
        System.out.println(number2 + " wrapper class");

        List<String> string = new ArrayList<>();
        string.add("Thoaikx");
        string.add(new String("Thoaikx"));
        string.remove("Thoaikx");
        string.remove("Thoaikx");

        System.out.println(string + " wrapper class string");

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        strings.remove(new String("Hello"));

        //working with generics
        List name = new ArrayList();
        name.add(new String("Thoaikx_String"));
        pirntNames(name);

//        List name2 = new ArrayList();
//        name.add(new StringBuilder("Thoaikx_String")); // throw class execption
//        pirntNames(name);

        //Generic class

        Elephant elephant = new Elephant();
        Crate<Elephant> elephantCrate = new Crate<Elephant>();
        elephantCrate.packCrate(elephant);
        Elephant elephant1 = elephantCrate.emptyCrate();

        Elephant elephant2 = new Elephant();
        Integer numPound = 10_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate(elephant2, numPound);


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer result = method2(integers);
        System.out.println(result+" method2");
    }

    static void pirntNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }
    //generic method
    public <T extends String> Crate<T> sink(T t) {
        System.out.println("preparing" + t);
        return new Crate<T>();
    }
     public  static  <T> T method2(List<? extends T> list) {
        return list.get(0);
    }


//    <B extends A> B method3 (List<B> list){
//       return  new B();
//    }
//    In the method declaration B method3(List<B> list), B is a type parameter that extends A.
//    It indicates that the method expects a list of elements of type B or its subtypes.
//    However, since B represents an unknown subtype of A, you cannot directly create a new instance of B
//    using the new keyword because the specific subtype is unknown.

//    When you use the new keyword to create a new instance of a class, you need to provide the exact class type.
//    For example, if you have a concrete class B and you want to create a new instance of it, you can use new B().
//    However, in the case of a type parameter like B, which represents an unknown subtype, you cannot create a new instance
//    directly because you don't know the specific subtype at compile-time.

//    To summarize, when a type parameter represents an unknown subtype, you cannot create a new instance of it directly using
//    the new keyword because the specific subtype is not known at compile-time.

//   <T> <? extends T> method3 (List <T> list){
//        return list.get(0);
//    }
// not compile because  does not return type is'nt actually a type
//    The issue lies with the return type declaration. <? extends T> is a wildcard type,
//    which represents an unknown subtype of T. It cannot be used as the return type of
//    a method directly because it does not represent a specific type.
}

//generic class

//  You can introduce generics into your own classes. The syntax
//  for introducing a generic is to declare a formal type
// parameter in angle brackets
class Crate <T>{
    private  T content;
    public T emptyCrate(){
        return  content;
    }
    public  void packCrate ( T content){
        this.content = content;
    }

}
class  Elephant {}
class SizeLimitedCrate <T, U> {

    private  T content;
    private  U sizeLimit ;

    public SizeLimitedCrate(T  content , U sizeLimit){
        this.content = content;
        this.sizeLimit = sizeLimit;
    }
}

  interface  Shippable<T>{
    void  ship (T t);
}
class  ShippableRobotCrate implements  Shippable<Elephant>{

    @Override
    public void ship(Elephant elephant) {
    }
}

class ShippableAbstractCrate<U> implements Shippable<U>{

    @Override
    public void ship(U u) {

    }
}


class A {}
class  B extends A{}
class  C extends B{};





