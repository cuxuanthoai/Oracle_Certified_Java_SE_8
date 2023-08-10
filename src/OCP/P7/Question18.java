package OCP.P7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//C:\Users\ad\Downloads\OCP_Oracle_Certified_Professional_Java_SE_8\src\OCP.P8.P7\Resource\Message.properties
class Question18 {  
 public static void main(String[] args) throws IOException {
    String path = "C:\\Users\\ad\\Downloads\\OCP_Oracle_Certified_Professional_Java_SE_8\\src\\OCP.P8.P7\\Resource\\Message.properties";
     Properties properties = new Properties();
     FileInputStream fis = new FileInputStream(path);
     properties.load(fis);
/*     Bạn đã sử dụng phương thức load của đối tượng Properties để nạp nội dung của tệp thuộc tính từ luồng đầu vào
             (FileInputStream) vào đối tượng Properties. Sau bước này, properties sẽ chứa các cặp key-value từ tệp thuộc tính.*/
     System.out.println(properties.getProperty("welcome1"));
     System.out.println(properties.getProperty("welcome1","test"));//gia tri default neu ko tim thay
     System.out.println(properties.getProperty("welcome3")); // null neuko tim thay
     //output
   /*  "Good day!"
     "Good day!"
     null*/
    }
}