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
    int m = n/2;
    int arr[][] = new int[n][n];
    for(int i= 0; i<n; i++){
      for(int j = 0; j<n; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    long ver1 = 0;
    for(int i= 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(i ==  j){
          ver1+=arr[i][j];
        }
      }
    }
    long ver2 = 0;
    for(int i= 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(j ==(n-1)-i){
          ver2+=arr[i][j];
        }
      }
    }
    if (n%2 ==0){
      System.out.println(Math.abs(ver1-ver2));
    }
    else{
      System.out.println(Math.abs(ver1-(ver2)));
    }
	}
}