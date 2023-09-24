package OCP.P1;

class Question61 {  
 public static void main(String[] args) {

     Moveable<Integer> aimal = n -> System.out.println(n+n);
     aimal.run(12);
    }
}

 /*   Which statement is true?
 //this answer is A
        A. Moveable can be used as below: Moveable<Integer> animal = n - > System.out.println("Running" + n); animal.run(100); animal.walk(20);
        B. Moveable can be used as below: Moveable<Integer> animal = n - > n + 10; animal.run(100); animal.walk(20);
        C. Moveable can be used as below: Moveable animal = (Integer n1, Integer n2) -> n+ n2; animal.run(100); animal.walk(20);
        D. Movable cannot be used in a lambda expression.*/
 interface Moveable<Integer> {
     default void walk (Integer distance) {
        System.out.println("Walking");
    }
         void run(Integer distance);

    }
