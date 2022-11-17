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
    if (n<=100){
      System.out.println(n*15);
    }
    else if(n >=101 && n<=200){
      System.out.println((100*15)+(n-100)*14);
    }
    else if (n>=201){
      System.out.println(((100*15)+(100)*14)+(n-200)*12);
    }
	}
}