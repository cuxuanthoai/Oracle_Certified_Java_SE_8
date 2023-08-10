package OCP.P7;

import java.util.concurrent.atomic.AtomicInteger;

class Question21 {
 public static void main(String[] args) {

     Thread thread = new Thread(new MyThread());
     Thread thread1 = new Thread(new MyThread());
     Thread thread2 = new Thread(new MyThread());
     Thread [] ta = {thread,thread1,thread2};

     for ( int i = 0 ; i < 3 ; i ++){
         ta[i].start();
     }
    }
}
/*
//Answer is A
    Which statement is true?
        A. The program prints 1 2 3 and the order is unpredictable.
        B. The program prints 1 2 3.
        C. The program prints 1 1 1.
        D. A compilation error occurs.*/
class MyThread implements Runnable{

    private  static AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        int x = count.incrementAndGet();
        System.out.println(x);
    }
}