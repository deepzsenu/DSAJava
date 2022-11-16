import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[3];
    for (int i = 0; i<3; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    if (arr[2]*arr[2]*2<(arr[2]*arr[2])+(arr[1]*arr[1])+(arr[0]*arr[0])){
      System.out.println(1);
    }
    else if (arr[2]*arr[2]*2 == (arr[2]*arr[2])+(arr[1]*arr[1])+(arr[0]*arr[0])){
      System.out.println(2);
    }
    else if (arr[2]*arr[2]*2> (arr[2]*arr[2])+(arr[1]*arr[1])+(arr[0]*arr[0])){
      System.out.println(3);
    }
	}
}