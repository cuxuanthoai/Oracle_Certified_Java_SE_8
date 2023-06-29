package Concurrency;

import java.util.concurrent.*;

public class cyclicBarrier {
    public static void main(String[] args) {

        ExecutorService executorService =  null;
        try {
            executorService = Executors.newFixedThreadPool(5);
            LionPenManager lionPenManager = new LionPenManager();

            CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
            CyclicBarrier cyclicBarrier1 = new CyclicBarrier(4, () -> System.out.println("Pen Cleaned"));

            for (int i = 0 ; i< 4; i ++){
                executorService.submit(() -> lionPenManager.performTask(cyclicBarrier,cyclicBarrier1));
            }
        }
        finally {
            executorService.shutdown();
        }

    }
}
class LionPenManager {
    private  void removedAnimals(){
        System.out.println("Removed 1 ");
    }
    private  void removedAnimals2(){
        System.out.println("Removed 2 ");
    }
    private  void removedAnimals3(){
        System.out.println("Removed 3" );
    }
    public void  performTask (CyclicBarrier c1, CyclicBarrier c2)  {
        try {
            removedAnimals();
            c1.await();
            removedAnimals2();
            c2.await();
            removedAnimals3();
        }
         catch (BrokenBarrierException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
