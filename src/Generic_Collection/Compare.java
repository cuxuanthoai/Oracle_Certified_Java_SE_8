package Generic_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("aThoaikx"));
        ducks.add(new Duck("1Thoaikx2"));
        ducks.add(new Duck("Taho2aikx"));

        Collections.sort(ducks);
        System.out.println(ducks);

        Animal animal = new Animal();
        animal.id = 2;
        Animal animal1 = new Animal();
        animal1.id = 10;
        System.out.println(animal.compareTo(animal1));


        Comparator<Duck> comparator = (o1, o2) -> 0;

        List<Duck> ducks1 = new ArrayList<>();
        ducks1.add(new Duck("Thoai"));
        ducks1.add(new Duck("aaa"));
        Collections.sort(ducks,comparator);
        System.out.println(ducks1);

    }
}

    class Duck implements Comparable<Duck> {

        private String name;

        public Duck(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Duck o) {
            return 0;
        }

    }

    class Animal implements Comparable<Animal> {

        int id;

        @Override
        public int compareTo(Animal o) {
            return id - o.id;
        }

    }

