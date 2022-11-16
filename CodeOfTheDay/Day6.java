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
    Map<Integer, Integer> mp  = new HashMap<>();
    SortedSet<Integer> st = new TreeSet<>();
    for(int i =0; i<n; i++){
      int m = sc.nextInt();
      st.add(m);
      if(mp.containsKey(m)){
        mp.put(m, mp.get(m)+1);
      }
      else{
        mp.put(m,1);
      }       
    }
    
    for(Integer i:st){      
      System.out.print(mp.get(i)+" ");      
    }
    
	}
}