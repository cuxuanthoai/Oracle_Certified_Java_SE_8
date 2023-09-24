package OCP.P1;

import java.util.Arrays;
import java.util.List;

class Question59 {
 public static void main(String[] args) {
     List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
     codes.forEach (c -> System.out.print(c + " "));

     String fmt = codes.stream()
             .filter(s -> s.contains("PEG"))
             .reduce((s,t) -> s+t).get();//return string
     System.out.println(fmt);

    /* What is the result?
     A. DOC MPEG JPEG MPEGJPEG this answer
     B. DOC MPEG MPEGJPEG MPEGMPEGJPEG
     C. MPEGJPEG MPEGJPEG
     D. java.util.NoSuchElementException is thrown.*/
    }
}