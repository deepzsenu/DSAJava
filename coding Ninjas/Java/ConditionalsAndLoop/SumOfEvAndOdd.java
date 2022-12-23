import java.util.*;
public class SumOfEvAndOdd {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long even = 0;
		long  od = 0 ;
		while(n>0){
			long rem = n%10;
			if (rem %2 == 0){
				even+=rem;
			}
			else{
				od+=rem;
			}
			n =n/10;
		}
		System.out.println(even +" "+ od);

	}
}
