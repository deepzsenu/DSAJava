import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n;  j++){
        	arr[i][j] = sc.nextInt();
      }
    }
    
    //tenspose
    for(int i = 0; i<n; i++){
      for(int j = i; j<n; j++){
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
      }
    }
    for(int i = 0; i<n; i++){
      for (int j = 0; j<n; j++){
        System.out.print(arr[i][j]+ " ");
      }
      System.out.println();
    }
	}
}