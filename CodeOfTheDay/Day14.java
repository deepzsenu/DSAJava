import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i = 0; i<n; i++){
      for (int j= 0; j<m; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    for (int e =0; e<k; e++){
      for (int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
          if((i==0 && j==0)){
            arr[i][j] = (arr[i+1][j]+arr[i][j+1])/2;
          }
          else if (i == 0 && j == m-1){
            arr[i][j] = (arr[i+1][j]+arr[i][j-1])/2;
          }
          else if (i == n-1 && j == 0){
            arr[i][j] = (arr[i-1][j]+arr[i][j+1])/2;
          }
          else if (i == n-1 && j== m-1){
            arr[i][j] = (arr[i-1][j]+arr[i][j-1])/2;
          }
          else if (j ==0){
            arr[i][j] = (arr[i][j-1]+arr[i][j+1]+arr[i+1][j])/3;
          }
          else if (i ==0){
            arr[i][j] = (arr[i-1][j]+arr[i+1][j]+arr[i][j+1])/3;
          }
          else if ( j ==m-1){
            arr[i][j] = (arr[i-1][j]+arr[i+1][j]+arr[i][j-1])/3;
          }
          else if (i == n-1){
            arr[i][j] = (arr[i][j-1]+arr[i][j+1]+arr[i-1][j])/3;
          }
          else{
            arr[i][j] = (arr[i-1][j]+arr[i+1][j]+arr[i][j-1]+arr[i][j+1])/4;
          }         
          
        }
      }      
    }
    for(int i =0; i<n; i++){
        for (int j = 0; j<m; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
	}
}
