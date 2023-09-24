package OCP.P1;

public class Test2 {
    public static void main(String[] args) {
        try(MyResource resource = new MyResource();
            MyResource2 resource2 = new MyResource2() )
        {
            resource.execute();
            resource2.execute();

            resource2.execute();

        }
        catch (Exception e){
            System.out.println("catch");
        }
    }
}
class MyResource implements AutoCloseable {
    public void execute() {
        System.out.println("Executing1");

    }
    @Override

    public void close() {
        System.out.println("Closing1");
    }

}
class MyResource2 implements AutoCloseable {

    public void execute() {

        System.out.println("Executing2");

    }

    @Override

    public void close() {

        System.out.println("Closing2");

    }

}


