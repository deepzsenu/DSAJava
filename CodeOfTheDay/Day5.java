import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i<s.length(); i++){
            int asc = (int)s.charAt(i) -65;
            ans+=Integer.toString(asc);
            
            
        }
        System.out.print(ans);
    
	}
}