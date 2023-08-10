package OCP.P7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;

class Question12 {
 public static void main(String[] args) throws IOException {
     Path file = Paths.get ("courses.txt");
     List<String> fc = readAllLines(file);
     fc.stream().forEach (s -> System.out.println(s));

     Stream<String> fc2 = Files.lines (file);
     fc.forEach (s -> System.out.println(s));
    }
 /*   A. List<String> fc = Files.list(file); fc.stream().forEach (s - > System.out.println(s));
    B. Stream<String> fc = Files.readAllLines (file); fc.forEach (s - > System.out.println(s));
    C. List<String> fc = readAllLines(file); fc.stream().forEach (s - > System.out.println(s));
    D. Stream<String> fc = Files.lines (file); fc.forEach (s - > System.out.println(s));*/

    //Explain
  /*  The correct answer is D. Stream<String> fc = Files.lines(file); fc.forEach(s -> System.out.println(s));

    Explanation:

    In the given code fragment, the Path object named "file" is created using the Paths.get() method
    which takes a string representing the path of the file. The file object is a reference to the "courses.txt" file.To print the contents of
    the file, we need to read the lines from the file and print them.
    There are several methods available in the Files class that can be used to read the lines from the file,such asFiles.readAllLines(Path path):
    This method reads all lines from the file as a List<String>.Files.lines(Path path): This method returns a Stream<String> of lines from the file.
        Files.newBufferedReader(Path path): This method returns a BufferedReader object that can be used to
    read the lines from the file.
    Option A (List<String> fc = Files.list(file); fc.stream().forEach(s -> System.out.println(s));) isincorrect because the Files.list()
    method returns a Stream<Path> of the files and directories in the directorypointed to by the given path, not the lines of the file.
    Option B (Stream<String> fc = Files.readAllLines(file); fc.forEach(s -> System.out.println(s));)
    is incorrect because the readAllLines() method returns a List<String> of all the lines in the file, not a Stream<String>.
            Option C (List<String> fc = readAllLines(file); fc.stream().forEach(s -> System.out.println(s));)
    is incorrect because the readAllLines() method is not defined in the code, and it is not a static method of any class.
    Option D (Stream<String> fc = Files.lines(file); fc.forEach(s -> System.out.println(s));) is correct because the lines()
    method returns a Stream<String> of lines from the file. We can then use the forEach() method to print each line in the stream.*/
}