package IO;

import java.io.File;

public class irectoryCreationExample2 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\ad\\Downloads\\New folder\\test");
        System.out.println("Pathname: " + dir.getAbsolutePath());
        System.out.println("Path exists:  " + dir.exists()); // true
        System.out.println("Parent Path exists: " + dir.getParentFile().exists());

        // Với mkdir(), thư mục chỉ được tạo ra nếu thư mục cha tồn tại.
        boolean created = dir.mkdir();
        System.out.println("Directory created: " + created); // false

        //
        File dir2 = new File("C:/WorkSpace/gpcoder/data/created2/child2");
        System.out.println("Pathname: " + dir2.getAbsolutePath());
        System.out.println("File exists: " + dir2.exists()); // false

        // Với mkdirs(), thư mục được tạo ra bao gồm cả các thư mục cha nếu nó không tồn tại.
        created = dir2.mkdirs();
        System.out.println("Directory created: " + created); // true
        dir2.delete();
    }
}
