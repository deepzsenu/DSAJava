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
  	long m = n;
    long sum = 0;
    while (m>0){
      long rem = m%10;
      sum += (rem*rem*rem);
      m = m/10;
    }
    if (sum == n){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }
	}
}