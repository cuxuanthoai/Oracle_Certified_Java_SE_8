package OCP.P1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Question41 {
 public static void main(String[] args) {
     List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen" ) ;
     Predicate<String> test = s -> {
         int i = 0;
         boolean result = s.contains ("pen");
         System.out.println((i++) + ":");
         return result;
     };
     str.stream().filter(test)
             .findFirst()
             .ifPresent(s -> System.out.println(s));
     //mỗi element in predicate sẽ tạo 1 biến i riêng
     // my -> vẫn print i =0
     //pen -> van print i = 0 và kết quả = true -> find first return và print pen
     //output  0:0: pen
    }
}