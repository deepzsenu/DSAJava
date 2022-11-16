import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static boolean duplicate(){
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> mp = new HashMap<>();
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
      int m = sc.nextInt();
      if (mp.containsKey(m)){
        return true;
      }
      else{
        mp.put(m,1);
      }
    }
    return false;
    
  }
	public static void main (String[] args) throws java.lang.Exception
	{
    System.out.println(duplicate());
	}
}