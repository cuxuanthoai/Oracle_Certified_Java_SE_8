package Generic_Collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();
        System.out.println(list.add("Thoaikx"));
        System.out.println(list.add("Thoaikx"));

        System.out.println(list.contains(new String("Thoaikx") )+" new String");

        Set<String> set = new HashSet<>();
        System.out.println(list.add("Thoaikx"));
        System.out.println(list.add("Thoaikx"));

        List<String> list2 = new ArrayList<>();
        list.add("X");
        list.add(new String("Y"));

        list.remove(new String("Y"));
        System.out.println(list);

        //Set
        Set<Integer> set1= new HashSet<>();
        boolean b1 = set1.add(77);
        boolean b2 = set1.add(9);
        boolean b3 = set1.add(Integer.valueOf(3));

        NavigableSet<Integer> navigableSet = new TreeSet<>();
            for( int i = 1; i <= 20 ; i++ ){
            navigableSet.add(i);
            }

        System.out.println(navigableSet.lower(10));
        System.out.println(navigableSet.floor(10));
        System.out.println(navigableSet.ceiling(10));
        System.out.println(navigableSet.higher(10));

        //Queue

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        }


    }


