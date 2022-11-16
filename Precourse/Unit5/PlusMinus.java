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
    long arr[] = new long[n];
    for (int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    double pos = 0;
    double neg = 0;
    double zer = 0;
    for (int i = 0; i<n; i++){
      if (arr[i]<0){
        neg+=1;
      }
      else if (arr[i]>0){
        pos+=1;
      }
      else{
        zer+=1;
      }
    }
    double r1 = pos/n;
    double r2 = neg/n;
    double r3 = zer/n;
//     System.out.println("Hello");
    System.out.println(String.format("%.6f", r1));
    System.out.println(String.format("%.6f", r2));
    System.out.println(String.format("%.6f", r3));
	}
}