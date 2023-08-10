package OCP.P7;


/*What is the result of running the code with the ""ea option?
        A. -10
        B. 0
        C. An AssertionError is thrown.
        D. A compilation error occurs.*/
//anser is -10
class Question6 {  
 public static void main(String[] args) {
     int a = 10 ;
     int b = -1;
     assert (b > 10) : "invalid denominator";
     int c = a/b;
     System.out.println(c);
    }
}