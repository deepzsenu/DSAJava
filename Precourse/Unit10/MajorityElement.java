import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    Map<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i<n; i++){
      int m =  sc.nextInt();
      if (mp.containsKey(m)){
        mp.put(m, mp.get(m)+1);
      }
      else{
        mp.put(m,1);
      }
    }
    int counts =0;
    if(n%2==0){
      counts = n/2;
    }
    else{
      counts = (n/2)+1;
    }
  	int element =0;
    for(Integer ele:mp.keySet()){
      if(mp.get(ele)>=counts){
        element = ele;
      }
    } 
    System.out.println(element);     
     
	}
}