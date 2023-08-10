package OCP.P7;

import java.io.File;
import java.io.IOException;

class Question13 {
 public static void main(String[] args) {

    }
    public void reDelete (String dirName) throws IOException{

     File[] listOfFiles = new File(dirName).listFiles();
     if(listOfFiles != null && listOfFiles.length >0){
         for (File aFile:listOfFiles) {
             if(aFile.isDirectory()){
                 reDelete(aFile.getAbsolutePath());
             }
             else {
                 if(aFile.getName().endsWith(".class"));
                 aFile.delete();
             }
         }
     }

    }
}
/* Answer is A
    Assume that Projects contains subdirectories that contain .class files and is passed as an argument to the recDelete () method when it is invoked.
        What is the result?
        A. The method deletes all the .class files in the Projects directory and its subdirectories.
        B. The method deletes the .class files of the Projects directory only.
        C. The method executes and does not make any changes to the Projects directory.
        D. The method throws an IOException.*/
