import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    int sum = 0;
    for (int  i =0; i<n; i++){
      int m= sc.nextInt();
      if(m%2!=0){
        sum+=m;
      }
    }    
    System.out.println(sum);
  
	}
}