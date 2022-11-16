import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    	  Scanner sc = new Scanner(System.in);
    		long m = sc.nextLong();
        double si = (100000.0*5*m)/100.0;
        long i = Double.valueOf(si).longValue();
        long amn = i+100000;
        System.out.println(amn);
    
	}
}