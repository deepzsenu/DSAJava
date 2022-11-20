public import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int findElement(int[] arr, int n)
       {
          
              int[] leftMax = new int[n];
              leftMax[0] = Integer.MIN_VALUE;
 
              for (int i = 1; i < n; i++)
                   leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
                    
              int rightMin = Integer.MAX_VALUE;
 
              for (int i = n - 1; i >= 0; i--)
              {
                   if (leftMax[i] < arr[i] && rightMin > arr[i])
                       return i;
                   rightMin = Math.min(rightMin, arr[i]);
              }
              return -1;
               
       }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int arr[] = new int[n];
    for (int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
//     int j = 
    if (findElement(arr,n) == -1){
      System.out.println(0);
    }
    else{
      System.out.println(1);
    }
    
	}
} 
