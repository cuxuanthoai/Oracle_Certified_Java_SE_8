package Serializable;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Tran Anh Vu";
        e.address = "138 Le Duan - P.Nguyen Du - Q.Hai Ba Trung - Ha Noi";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\ad\\Downloads\\New folder\\employee.data");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in C:\\Users\\ad\\Downloads\\New folder\\employee.data" );
        } catch (IOException i) {
            i.printStackTrace();
        }

        //Deserialized
        //When deserialize contructor not caled, and static variable, default initializations
        Employee e2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\ad\\Downloads\\New folder\\employee.data");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e =   (Employee) in.readObject();
            Employee employee = e;

            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

    }
}

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

    public Employee() {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
        mailCheck();
    }
}