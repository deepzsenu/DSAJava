public import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static int magicSum(int a[][]){
    
  	int r1 = a[0][1]+a[0][0]+a[0][2];
    int r2 = a[1][1]+a[1][0]+a[1][2];
    int r3 = a[2][1]+a[2][0]+a[2][2];
    int d1 = a[0][0]+a[1][1]+a[2][2];
    int d2 = a[0][2]+a[1][1]+a[2][0];
    int c1 = a[0][0]+a[1][0]+a[2][0];
    int c2 = a[0][1]+a[1][1]+a[2][1];
    int c3 = a[0][2]+a[1][2]+a[2][2];
    int row_sum =0, column_sum =0, diag_sum= 0;
    if (r1 == r2 && r2 == r3){
      row_sum = r1;
    }
    if(c1 == c2 && c2 == c3){
      column_sum = c1;
    }
    if(d1 == d2){
      diag_sum = d1;
    }
    if(row_sum == column_sum && column_sum == diag_sum){
      return row_sum;
    }
    else{
      return 0;
    }
  
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = 3;
    int arr[][] = new int[3][3];
    for (int i = 0; i<3; i++){
      for (int j = 0; j<3; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println(magicSum(arr));
    
	}
} 