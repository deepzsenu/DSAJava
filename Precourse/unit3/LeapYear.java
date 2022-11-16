import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year %4==0 && year%100!=0 || year%400 == 0){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }
	}
}