import java.util.*;
public class FahrenheitToCelsiusTable {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int e = sc.nextInt();
		int p = sc.nextInt();
		for (int i = a; i<=e; i=i+p){
			int c=  ((i - 32) * 5)/9;
			System.out.println(i+" "+ c);  //String.format("%.0f",Math.round(c)));

		}

		
	}

}
