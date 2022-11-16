import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int lar = 0;
    if(a>=b && a>=c){
      lar = a;
    }
    else if(b>=a && b>= c){
      lar = b;
    }
    else{
      lar = c;
    }
    System.out.println(lar);
	}
}