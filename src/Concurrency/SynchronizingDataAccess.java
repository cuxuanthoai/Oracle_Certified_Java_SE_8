package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizingDataAccess {

     private int sheepCount = 0;
     private int sheepCount_Atomic = 0;
    private  void incrementAndReport(){
        System.out.print(++sheepCount +" ");
        //System.out.println("name Thread" +Thread.currentThread().getName());
    }
    private  void incrementAndReportAtomic() {
        synchronized (this) {
            System.out.print(++sheepCount_Atomic + " ");
            //System.out.println("name Thread" +Thread.currentThread().getName());
        }
    }
//
//    public static synchronized int getValue() {
//        return count;
//    }

//    When a method is declared as static synchronized, it means that the method is synchronized at the class
//    level rather than at the instance level.
//
//    In Java, every class has an associated Class object, which is shared among all instances of that class.
//    When a static synchronized method is invoked,
//    it acquires a lock on the class object associated with that class.

//    When a method is declared as static synchronized, it uses the class object as the lock for synchronization.
//    In this case, the lock is acquired on the Counter.class object, which is shared among all instances of the class.
    public static void main(String[] args) {
        ExecutorService executors = null;
        try {
            executors = Executors.newFixedThreadPool(20);

            SynchronizingDataAccess synchronizingDataAccess  = new SynchronizingDataAccess();

//            for (int i = 0 ; i < 10 ; i ++){
//                executors.submit(() -> synchronizingDataAccess.incrementAndReport());
//            }

            //Atomic ensures that data is conistent between worker and that no values are lost due to concurrent modifications
            for (int i = 0 ; i < 10 ; i ++){
                synchronized (synchronizingDataAccess){
                executors.submit(synchronizingDataAccess::incrementAndReportAtomic);}
            }
            //Improve wiht syncronized block
            //When multiple threads call these synchronized methods on the same counter object,
            //they will acquire the intrinsic lock of the object before executing the method.

        }
        finally {
            executors.shutdown();
        }
    }

}
