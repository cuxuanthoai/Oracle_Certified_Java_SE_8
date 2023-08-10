package OCP.P7;

class Question8 {  
 public static void main(String[] args) {

    }
}
abstract class Shape {
    Shape(){
        System.out.println("shape");
    }
    protected void area (){
        System.out.println("shape");
    }
}
class Square extends Shape{
    int side;
    Square (int side) {
        //line 1
        this.side = side;
    }
    public void area (){
        System.out.println("shape");
    }
}
class Retangle extends Square{
    int br , len ;

    Retangle(int x , int y) {
        super(y);
        len = x;
        br = y ;
    }
    public void area (){
        System.out.println("shape");
    }
}