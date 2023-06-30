package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class BufferedExample {

    public static void coppy(File source, File destination) throws IOException{
         try (
                InputStream in = new BufferedInputStream(new FileInputStream(source));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(destination)))

             {
            byte [] buffer = new byte[1024];
            int lenghRead ;
            while ((lenghRead = in.read(buffer)) >0){
                out.write(buffer,0,lenghRead);
                out.flush();
            }
        }

    }

    public  static List<String> readFile (File source) throws  IOException{
        List<String> data = new ArrayList<>();


        try ( BufferedReader reader = new BufferedReader(new FileReader(source,StandardCharsets.UTF_8)))
        {
            String s ;
            while ((s = reader.readLine()) != null){
                data.add(s);

            }
        }

        return  data;
    }

    public  static  void wiriteFile (List<String> data, File destination) throws  IOException{
        PrintWriter printWriter = new PrintWriter(System.out);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination,StandardCharsets.UTF_8)))
        {
            for(String s : data){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        }
    }


    public static void main(String[] args) throws IOException {

     File source = new File("C:\\Users\\ad\\Downloads\\OCP_Oracle_Certified_Professional_Java_SE_8\\path\\thoaikx\\Test-Contest.txt");

     File destination = new File("C:\\Users\\ad\\Downloads\\OCP_Oracle_Certified_Professional_Java_SE_8\\path\\to\\ouput.txt");;

     List<String> data = readFile(source);
     //must add this to print to console vietnamese
     PrintWriter printWriter = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
     for (String record : data)
     {printWriter.println(record);
     }

     wiriteFile(data,destination);


    }
}
