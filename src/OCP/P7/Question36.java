package OCP.P7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question36 {
 public static void main(String[] args) {
     //Arrays.asList return a Arrays type. It has fix-sized array so not support add operation. It return an UnSupportedOpertationException
     // List<Product> products = Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30));
     //-> change
     List<Product> products =  new ArrayList<>(Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30)));

     Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
         p1.price += p2.price;
         return new Product(p1.id, p1.price);
     });
     //p1 là product ( 4,0) mỗi vòng lặp p1.price += p2.price , p2 sẽ là tất cả các element của stream mỗi lần lặp p1.price sẽ tăng lên
     products.add(p);
     products.stream()
             .parallel()
             .reduce((p1,p2)-> p1.price > p2.price ? p1:p2)
             .ifPresent(System.out::println);
     }
    }
    //Fixing compilation errors and using new ArrayList() would result in 4:70

class Product {
    int id; int price;
    public Product (int id, int price) {
        this.id = id;
        this.price = price;
    }
    public String toString() { return id + ":" + price; }
}