import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long sum = 0;
    for(long t =1 ; t<=N; t++){
      long f = (t+1)*(t+1);
      long s = (3*t + 1);
      sum = (f - s + t)+sum;
    }
    System.out.println(sum);
	}
}