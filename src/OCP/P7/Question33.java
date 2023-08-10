package OCP.P7;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class Question33 {
 public static void main(String[] args) {
     int i;
     char c;
     String path = "C:\\Users\\ad\\Downloads\\OCP_Oracle_Certified_Professional_Java_SE_8\\src\\OCP.P8.P7\\Resource\\course.txt";
     try (FileInputStream fis = new FileInputStream (path);
          InputStreamReader isr = new InputStreamReader(fis);) {
         while (isr.ready()) { //line n1
             isr.skip(2);
             i = isr.read ();
             c = (char) i;
             System.out.print(c);
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
    }
}
/*    What is the result?
        A. ur :: va
        B. ueJa (This is answer)
        C. The program prints nothing.
        D. A compilation error occurs at line n1.*/
