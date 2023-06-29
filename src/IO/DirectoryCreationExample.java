package IO;

import java.io.File;

public class DirectoryCreationExample {


    private static boolean createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.mkdir();
    }

    private static boolean createDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.mkdirs();
    }
    public static void main(String[] args) {

        String directoryPath = "directory";
        new File("/tmp/one/two/three").mkdirs();
        String directoryPath2 = "thoaikx/test4/abcaa1";
        //Create directoryCreated
        boolean directoryCreated = createDirectory(directoryPath);
        if(directoryCreated){
            System.out.println("Directory created auccessfully");
        }
        else {
            System.out.println("Failed to create directory");
        }

             //Create directories recursively using mkdirs()
        boolean directoriesCreated = createDirectories(directoryPath2);
        if (directoriesCreated) {
            System.out.println("Directories created successfully.");
        } else {
            System.out.println("Failed to create directories.");
        }




    }
}
