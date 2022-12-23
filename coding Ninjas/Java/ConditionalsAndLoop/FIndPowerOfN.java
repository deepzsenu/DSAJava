import java.util.*;
public class FIndPowerOfN {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long prod = 1;
        for(int i = 1; i<=b; i++){
            prod*=a;
        }
        System.out.println(prod);
        
    }
}