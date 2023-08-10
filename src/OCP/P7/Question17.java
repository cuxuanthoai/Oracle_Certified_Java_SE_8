package OCP.P7;

class Question17 {  
 public static void main(String[] args) {
     Book1 b1 = new Book1 (101, "Java Programing");
     Book1 b2 = new Book1 (102, "Java Programing");
     System.out.println (b1.equals(b2)); //line n2 TRUE

 /*    Which statement is true?
             A. The program prints true.
             B. The program prints false.
             C. A compilation error occurs. To ensure successful compilation, replace line n1 with: boolean equals (Book obj) {
         D. A compilation error occurs. To ensure successful compilation, replace line n2 with: System.out.println (b1.equals((Object) b2));*/

    }
}
 class Book1 {
    int id;
    String name;
    public Book1 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) { //line n1
        boolean output = false;
        Book b = (Book) obj;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }
}

