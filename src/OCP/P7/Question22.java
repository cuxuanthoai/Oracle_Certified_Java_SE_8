package OCP.P7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Question22 {
 public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter");
     int gpd = Integer.parseInt(br.readLine());
     System.out.println(gpd);
    }
}
/*
    InputStreamReader is used to read bytes and convert them into characters.
        In this case, it's wrapped around System.in, which is an input stream representing the standard input (keyboard).*/
