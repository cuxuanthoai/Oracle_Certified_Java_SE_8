package OCP.P7;

import java.util.concurrent.*;

class Question39 {
 public static void main(String[] args) throws ExecutionException, InterruptedException {
     ExecutorService es = Executors.newFixedThreadPool(2);
     Future f1 = es.submit (new Caller ("Call"));
     Future f2 = es.submit (new Runner ("Run"));

     String str1 = (String) f1.get();
     String str2 = (String) f2.get(); //line n1
     System.out.println(str1+ ":" + str2);
     //output
     /*RunRunner
     CallCaller:null*/
    /* đầu tiên call Runner và print( get luôn return nulll) , caller có call nhưng cần đợi get
             -> f1.get -> call Call rồi F2.get return null */
    }
}
class Caller implements Callable<String> {
    String str;
    public Caller (String s) {this.str=s;}
    public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
    String str;
    public Runner (String s) {this.str=s;}
    public void run () { System.out.println (str.concat ("Runner"));}
}