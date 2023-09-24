package OCP.P1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class Question46 {
 public static void main(String[] args) {
     List<Integer> nums = Arrays.asList (10, 20, 8);
     System.out.println(nums.stream().max(Comparator.comparing(Function.identity())).get());

   /*  Which code fragment must be inserted at line n1 to enable the code to print the maximum number in the nums list?
     A. nums.stream().max(Comparator.comparing(a -> a)).get() this answer
     B. nums.stream().max(Integer : : max).get()
     C. nums.stream().max()
     D. nums.stream().map(a -> a).max()*/
 }
}