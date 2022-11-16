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
    
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int large = Integer.MIN_VALUE;
    int ind = -1;
    for(int i = 0;i<n;i++){
      if (arr[i]>large){
        large = arr[i];
        ind = i;  
      }
    }
    
    int seclar = Integer.MIN_VALUE;
    
    for(int i = 0; i<n; i++){
      if (arr[i]>seclar && arr[i]<large){
        seclar = arr[i];
             
      }
    }
    if (seclar*2 <= large){
    	System.out.println(ind);
    }
    else{
      System.out.println(-1);
    }
	}
}