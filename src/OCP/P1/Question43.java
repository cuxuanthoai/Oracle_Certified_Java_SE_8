package OCP.P1;

class Question43 {  
 public static void main(String[] args) {

     Rideable rider = Car::new;
     Car vehical = rider.getCar("MyCar");

     //Rideable rider = Car::new; có thể được viết lại như sau
     Rideable rider1 = new Rideable() {
         @Override
         public Car getCar(String name) {
             return null;
         }
     };

     Car vehicle2 = rider.getCar("Test") ;

    }
}
/*    Which code fragment creates an instance of Car?
        A. Car auto = Car ("MyCar"): : new;
        B. Car auto = Car : : new; Car vehicle = auto : : getCar("MyCar");
        C. Rideable rider = Car : : new; Car vehicle = rider.getCar("MyCar");
        D. Car vehicle = Rideable : : new : : getCar("MyCar");*/
interface Rideable {
    Car getCar (String name);
}
class Car {
    private String name;
    public Car (String name) {
        this.name = name;
    }
}