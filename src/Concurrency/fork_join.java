package Concurrency;

import java.io.File;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class fork_join {
//    Basic Use
//    The first step for using the fork/join framework is to write code that performs a segment of the work.
//    Your code should look similar to the following pseudocode:
//
//       if (my portion of the work is small enough)
//        do the work directly
//    else
//    split my work into two pieces
//    invoke the two pieces and wait for the results

    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();
        FileProcessor fileProcessor = new FileProcessor(new File("C:\\Users\\ad\\Downloads\\Oracle"));
        pool.invoke(fileProcessor);//start the task

        //waiting for the task to complete
        pool.shutdown();
        while (!pool.isTerminated()){
            //wait for the pool to finish
        }
        System.out.println("File processing complete");

    }
}
class ForkBlur extends RecursiveAction {
    private int[] mSource;
    private int mStart;
    private int mLength;
    private int[] mDestination;

    // Processing window size; should be odd.
    private int mBlurWidth = 15;

    protected static int sThreshold = 100000;

    public ForkBlur(int[] src, int start, int length, int[] dst) {
        mSource = src;
        mStart = start;
        mLength = length;
        mDestination = dst;
    }

    protected void computeDirectly() {
        int sidePixels = (mBlurWidth - 1) / 2;
        for (int index = mStart; index < mStart + mLength; index++) {
            // Calculate average.
            float rt = 0, gt = 0, bt = 0;
            for (int mi = -sidePixels; mi <= sidePixels; mi++) {
                int mindex = Math.min(Math.max(mi + index, 0),
                        mSource.length - 1);
                int pixel = mSource[mindex];
                rt += (float) ((pixel & 0x00ff0000) >> 16)
                        / mBlurWidth;
                gt += (float) ((pixel & 0x0000ff00) >> 8)
                        / mBlurWidth;
                bt += (float) ((pixel & 0x000000ff) >> 0)
                        / mBlurWidth;
            }

            // Reassemble destination pixel.
            int dpixel = (0xff000000) |
                    (((int) rt) << 16) |
                    (((int) gt) << 8) |
                    (((int) bt) << 0);
            mDestination[index] = dpixel;
        }
    }

    @Override
    protected void compute() {
        if (mLength < sThreshold) {
            computeDirectly();
            return;
        }

        int split = mLength / 2;

        invokeAll(new ForkBlur(mSource, mStart, split, mDestination),
                new ForkBlur(mSource, mStart + split, mLength - split,
                        mDestination));
    }
}

class FileProcessor extends RecursiveAction{
    private File directory;

    public FileProcessor(File directory) {
        this.directory = directory;
    }

    @Override
    protected void compute() {
        if (directory != null){
            File [] files = directory.listFiles();

            if(files != null){
                for(File file :files){
                    if (file.isDirectory()){
                        FileProcessor subTask = new FileProcessor(file);
                    }
                    else {
                        //process file
                        System.out.println("processing file : " + file.getName());
                    }
                }
            }

        }
    }
}
