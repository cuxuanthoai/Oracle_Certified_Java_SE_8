package OCP.P1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Question50 {
 public static void main(String[] args) {
     Stream<Path> paths = Stream.of (Paths. get("data.doc"),
             Paths. get("data.txt"),
             Paths. get("data.xml"));

     //Returns a stream consisting of the results of applying the given function to the elements of this stream.
     paths.filter(s-> s.toString().contains("data")).forEach(
             s -> {
                 try {
                     Files.readAllLines(s) //return List<String> -> can convert to stream
                             .stream()
                             .forEach(System.out::println); //line n1
                 } catch (IOException e) {
                     System.out.println("Exception");
                 }
             }
     );
    }
}