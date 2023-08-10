package OCP.P7;

import java.nio.file.Path;
import java.nio.file.Paths;

class Question20 {
 public static void main(String[] args) {
     Path p1 = Paths.get("/Pics/MyPic.jpeg");
     System.out.println (p1.getNameCount() +
             ":" + p1.getName(1) +
             ":" + p1.getFileName());
    }
}
//output 2:MyPic.jpeg:MyPic.jpeg
/*p1.getNameCount() là 2 vì có hai thành phần trong đường dẫn.
        p1.getName(1) trả về "MyPic.jpeg" vì nó là thành phần tại chỉ mục 1.
        p1.getFileName() trả về "MyPic.jpeg" vì nó là tên của tệp cuối cùng trong đường dẫn.*/

/*

    Đoạn này tạo một đối tượng Path với đường dẫn "/Pics/MyPic.jpeg". Đây là đường dẫn tuyệt đối với tệp "MyPic.jpeg"
        trong thư mục "/Pics" trên hệ thống tệp.
        p1.getNameCount()
        Phương thức getNameCount() trả về số lượng thành phần (components) trong đường dẫn p1. Ở đây, có hai thành phần:
        "/Pics" và "MyPic.jpeg". Vì vậy, p1.getNameCount() trả về giá trị 2.
        p1.getName(1)
        Phương thức getName(int index) trả về thành phần tại chỉ mục (index) được chỉ định trong đường dẫn.
        Trong trường hợp này, bạn yêu cầu thành phần tại chỉ mục 1 (thứ hai thành phần sau dấu "/"). Vì vậy, p1.getName(1) sẽ trả về "MyPic.jpeg".
        p1.getFileName()
        Phương thức getFileName() trả về tên tệp hoặc thư mục cuối cùng trong đường dẫn. Trong trường hợp này, tên tệp cuối cùng là "MyPic.jpeg".
        Vì vậy, p1.getFileName() sẽ trả về "MyPic.jpeg".*/

