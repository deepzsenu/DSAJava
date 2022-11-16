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
    long ans  = 0;
    for (int i = 1; i<=n; i++){
      if (i >=1&& i<=50){
        ans+=(5);
      }
      else if (i >=51 && i<=150){
        ans+=(7);
      }
      else if (i >=151 && i<=200){
        ans+=(9);
      }
      else if (i >=251){
        ans+=(12);
      }
    }
    System.out.println(ans);
	}
}