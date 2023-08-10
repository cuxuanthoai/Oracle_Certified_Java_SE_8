package OCP.P7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

class Question31 {
 public static void main(String[] args) throws IOException {

     Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
     files.parallel().forEach(fname -> {
                 try {
                     Path aPath = fname.toAbsolutePath();
                     System.out.println(fname + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
     );
   /*  What is the result?
     A. All files and directories under the home directory are listed along with their attributes.(This answer)
     B. A compilation error occurs at line n1.
      C. The files in the home directory are listed along with their attributes.
     D. A compilation error occurs at line n2.*/

 }
}