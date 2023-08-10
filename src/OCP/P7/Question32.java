package OCP.P7;

import java.util.Set;
import java.util.TreeSet;

class Question32 {
 public static void main(String[] args) {
     Set<Vehicle> vehicles = new TreeSet<>();
     vehicles.add(new Vehicle (10123, "Ford"));
     vehicles.add(new Vehicle (10124, "BMW"));
     System.out.println(vehicles);
    }
    //Tree set must be implement comparable interface
    //If want compare then can change
    //Set<Vehicle> vehicles = new TreeSet<>(Comparator.comparingInt(Vehicle::getVno));
   /* What is the result?
    A. 10123 Ford 10124 BMW
    B. 10124 BMW 10123 Ford
    C. A compilation error occurs.
    D. A ClassCastException is thrown at run time.*/
}
class Vehicle {
    int vno;
    String name;
    public Vehicle (int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
    public String toString () {
        return vno + ":" + name;
    }

    public int getVno() {
        return vno;
    }

    public void setVno(int vno) {
        this.vno = vno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}