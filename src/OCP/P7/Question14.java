package OCP.P7;

class Question14 {  
 public static void main(String[] args) throws Exception {
      /*  try {
            doStuff();
        }
        compiler error
        Types in multi-catch must be disjoint: 'java.lang.NumberFormatException' is a subclass of 'java.lang.Exception'
        catch (ArithmeticException| NumberFormatException|Exception e ){

        }*/
    }
    public  static void doStuff() throws  ArithmeticException, NumberFormatException,Exception{
     if(Math.random() > -1){
         throw  new Exception("Try Again");
     }

    }
}