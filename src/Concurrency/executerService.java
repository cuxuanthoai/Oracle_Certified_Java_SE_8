package Concurrency;

import java.util.concurrent.*;

public class executerService {
    private  static  int counter = 0;
    public static void main(String[] args) {
        ExecutorService service = null;

        System.out.println(Runtime.getRuntime().availableProcessors());

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {for (int i = 0 ; i <3 ; i ++)
                System.out.println("Print reocrd :" + i);
            });
        } finally {
            if (service != null){
                service.shutdown();
            }
        }
        //submit task
        ExecutorService service1 = null;
        try {
            service1 = Executors.newSingleThreadExecutor();
            Future<?> future = service1.submit( () -> {
                for( int i = 0 ; i < 20; i++) executerService.counter++;
            });

           //future.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        }
//        catch (TimeoutException e) {
//            System.out.println("Not reached");
//        } catch (ExecutionException | InterruptedException e) {
//            throw new RuntimeException(e);
        //}
        finally {
            executerService.counter++;
        }

        //
        ExecutorService service2 = null;
        try {
            service2 = Executors.newSingleThreadExecutor();
            Future<Integer>  future = service2.submit(() -> 30+12);
            System.out.println(future.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service2.shutdown();
        }


    }
}
