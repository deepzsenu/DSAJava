import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(Solution.numberOfDays(m));
    }
}
class Solution {
    static int numberOfDays(int n) {
        // Write your code here
    
      if (n == 1 || n == 3|| n == 5 || n == 7 || n == 8 || n==10 || n ==12)
      {
        return (31);
      }
      else if ( n == 4 || n== 6 || n == 9 || n == 11){
        return (30);
      }
      else{
        return (28);
      }
    }
}