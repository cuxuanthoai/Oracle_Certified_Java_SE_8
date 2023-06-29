package Concurrency;

public class Concurrency {
    public static void main(String[] args) {

        new Thread(() ->
        {
            for (int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        for (int i = 0; i < 100; i++){
            new Thread( ()-> System.out.println(Thread.currentThread().getName())).start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}