import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static boolean isOdd(int n){
    int cd = 0;
    while(n>0){
      cd++;
      n=n/10;
    }
    if (cd%2 ==0){
      return true;
    }
    return false;    
  }
	public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i;
    int counts = 0;
    for(i = 0; i<n; i++){
      arr[i] = sc.nextInt();
      if(isOdd(arr[i])!=true){
        counts++;
      }
    }

    System.out.println(counts);
	}
    
}
