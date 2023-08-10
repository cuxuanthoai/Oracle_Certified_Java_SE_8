package OCP.P7;

import java.util.function.Supplier;

class Question7 {
 public static void main(String[] args) {

    }
}

class Bird {
    public void fly() {
        System.out.println("can fly");
    }
    public int fly( int a){
        return  1;
    }

    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);

        flyInt(Penguin::new);
    }

    static void fly (Supplier<Bird> bird ){
        bird.get().fly();
    }
    static int flyInt (Supplier<Bird> bird ){
         return  bird.get().fly(3);
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.println("can not fly");
    }
}