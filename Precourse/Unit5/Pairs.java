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
    Set<Integer> mp = new HashSet<>();
    int arr[] = new int[n];
    for (int i =0; i<n; i++){
      arr[i] = sc.nextInt();
      mp.add(arr[i]);
    }
    int count = 0;
    for (int i = 0; i<n; i++){
      if (mp.contains(arr[i]+k)){
        count++;        
      }
    }
    System.out.println(count);   
	}
}