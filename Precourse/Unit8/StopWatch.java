import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc =  new Scanner(System.in);
    int n  = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    if (n%2 !=0){
      System.out.println("still running");
    }
    else{
      int ans  =0;
      int i =0;
      while(i<n-1){
        ans = ans+(arr[i+1]-arr[i]);
        i+=2;
      }
      System.out.println(ans);
    }
	}
}