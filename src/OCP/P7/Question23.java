package OCP.P7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Question23 {
 public static void main(String[] args) throws IOException {
     Path source = Paths.get("/data/december/log.txx");
     Path des = Paths.get("/data");
     Files.copy(source,des) ;
    }
    //output  A NoSuchFileException is thrown at run time.

  /*  What is the result?
    A. A file with the name log.txt is created in the /data directory and the content of the /data/december/log.txt file is copied to it.
    B. The program executes successfully and does NOT change the file system.
    C. A FileNotFoundException is thrown at run time.
    D. A NoSuchFileException is thrown at run time.*/

 /*   FileNotFoundException: This is an exception class in Java that indicates that a file with the specified path could not be found or accessed.
    It is part of the java.io package and is commonly thrown when you try to open, read, or manipulate a file that doesn't exist.
    NoSuchFileException: This is an exception class in Java that is part of the java.nio.file package. It is thrown when you are
    working with the new I/O (NIO) framework and an operation, such as opening or manipulating a file, cannot be completed because the
    specified file does not exist.*/
}