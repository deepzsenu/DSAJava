import java.util.*;
public class Factors {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int  i =2 ; i<n; i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
        
    }
}