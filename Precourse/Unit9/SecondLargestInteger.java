import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int arr[] = new int[5];
    int lar = Integer.MIN_VALUE;
    for (int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
      if(arr[i]>lar){
        lar = arr[i];
      }
    }
  	int sec_lar = Integer.MIN_VALUE;
    for(int i = 0; i<n; i++){
      if(arr[i]>sec_lar && arr[i]<lar){
        sec_lar = arr[i];
      }
    }
    System.out.println(sec_lar);
	}
}