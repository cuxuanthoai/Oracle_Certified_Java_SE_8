package OCP.P1;

class Question51 {  
 public static void main(String[] args) {

    }
}
/*
AE
final class Folder { //line n1
    //line n2
    public void open () {
        System.out.print("Open");
    }
}
public class Test {
    public static void main (String [] args) throws Exception { try (Folder f = new Folder()) { f.open();
    }
    }
}
    Which two modifications enable the code to print Open Close? (Choose two.)
        A. Replace line n1 with: class Folder implements AutoCloseable {
    B. Replace line n1 with: class Folder extends Closeable {
        C. Replace line n1 with: class Folder extends Exception {
            D. At line n2, insert: final void close () { System.out.print("Close"); }
            E. At line n2, insert: public void close () throws IOException { System.out.print("Close"); }*/
