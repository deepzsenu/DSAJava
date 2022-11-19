import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = 1;
    long b = 1;
    long c;   
    for (long i = 2; i<n%300; i++){      
      	c = (a+b)  ;
      	a = b  ;
      	b = c  ;
    }
    long val = (b%100);
    if(val%100<10){
      System.out.println("0" + val);
    }
    else{
      System.out.println(val);
    }
	}
}