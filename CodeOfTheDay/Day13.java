import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static void allLeterPresent(String str){
    str= str.toLowerCase();
    boolean allLeter = true;
    for(char ch = 'a'; ch<='z'; ch++){
      if(!str.contains(String.valueOf(ch))){
        allLeter = false;
        break;
      }
    }
    if(allLeter){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
    allLeterPresent(s);
    
	}
}