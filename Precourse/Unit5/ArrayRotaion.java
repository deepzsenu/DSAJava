import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static void reverse(int arr[], int s, int e){
    while(s<e){
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      s++;
      e--;
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int arr[] = new int[n];
    int queries[] = new int[q];
    for (int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i =0; i<q; i++){
      queries[i] = sc.nextInt();
    }
    if (k>=n){
      k = n%k;
    }
    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    for(int i=0; i<q;i++){
      System.out.print(arr[queries[i]]+" ");
    }
	}
}