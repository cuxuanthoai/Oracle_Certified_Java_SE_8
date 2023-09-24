package OCP.P1;

class Question55 {  
 public static void main(String[] args) {

    }
}
class Customer {
    private String fName;
    private String lName;
    private static int count;
    public Customer (String first, String last) {
        fName = first;
        lName = last;
        ++count;}
    static { count = 0; }
    public static int getCount() {return count; }
}