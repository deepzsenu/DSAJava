import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        //Write code here
      long sum = 0;
      long curr_sum  =0;
      for(int i =0; i<n; i++){
        curr_sum+=a[i];
        if (curr_sum>sum){
          sum = curr_sum;
        }
        else if(curr_sum <=0){
          curr_sum = 0;
        }
      }
      return sum;
    }
}