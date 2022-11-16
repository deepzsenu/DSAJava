import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for (int i = 1; i<=x; i++){
      for (int j = 1; j<=x; j++){
        if (j<=x-i){
          System.out.print(" ");
        }
        else{
          System.out.print("#");
        }
      }
      System.out.println();
    }
	}
}