import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    Map<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
      if(mp.containsKey(arr[i])){
        mp.put(arr[i], mp.get(arr[i])+1);
        
      }
      else{
        mp.put(arr[i], 1);
      }
    }
    long sum =0;
    for(Integer i:mp.keySet()){
      if(mp.get(i)==1){
        sum+=i;
      }      
    }
    System.out.println(sum);
	}
}