package OCP.P1;

import java.util.Arrays;
import java.util.List;

class Question42 {
 public static void main(String[] args) {
     List<String> empDetails = Arrays.asList("100, Robin, HR",
             "200, Mary, AdminServices",
             "101, Peter, HR");

     empDetails.stream()
             .filter(s-> s.contains("1"))// chỉ có 100, Robin, HR và 101, Peter, HR contain 1
             .sorted()//natural if ko pass gì vào input method
             .forEach(System.out::println);
   /*  100, Robin, HR
     101, Peter, HR*/
    }
}