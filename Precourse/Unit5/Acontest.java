import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Long arr[] = new Long[n];
    for(int i= 0; i<n; i++){
      arr[i] = sc.nextLong();
    } 
    //Arrays.sort(arr);
    //Arrays.sort(arr, Collections.reverseOrder());
    Long kth = arr[k-1];
    
    
  	int count = 0;
    for(int i = 0; i<n; i++){
        if(arr[i]>=kth && arr[i]>0 ){
          count++;
        }      
    }
    System.out.println(count);
   
//     else{
//     System.out.println(0);
//     }
	}
}