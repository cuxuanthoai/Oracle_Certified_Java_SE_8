package OCP.P7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Question9  extends RecursiveAction {
    static final int THRESHOLD_SIZE = 3;
    int stIndex , lstIndex ;
    int data [];

    public Question9(int [] data, int stIndex, int lstIndex) {
        this.data = data;
        this.stIndex = stIndex;
        this.lstIndex = lstIndex;
    }

    public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool ( );
        int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fjPool.invoke (new Question9 (data, 0, data.length));
    }

    @Override
    protected void compute() {
        int sum = 0;
        if (lstIndex -stIndex <= THRESHOLD_SIZE){
            for ( int i = stIndex ; i < lstIndex ; i++){
                sum += data[i];
            }
            System.out.println(sum);
        }
        else {
            new Question9(data,stIndex+THRESHOLD_SIZE,lstIndex).fork();
            new Question9(data,stIndex,Math.min(lstIndex,stIndex+THRESHOLD_SIZE)).compute();
        }
    }
}