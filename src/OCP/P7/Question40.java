package OCP.P7;

class Question40 {  
 public static void main(String[] args) {

    }
}
interface Drawable {
    public abstract void draw ();
}
class Canvas implements Drawable {
    public void draw () { } //must be implement method interface
}
abstract class Board extends Canvas { }// no need implement cuz it abstract class

 class Paper extends Canvas {
    protected void draw (int color) { } //overload
}
class Frame extends Canvas implements Drawable {
    public void resize () { } //add more method
}