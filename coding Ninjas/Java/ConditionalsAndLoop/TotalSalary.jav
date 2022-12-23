import java.util.*;
public class TotalSalary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		char ch = sc.next().charAt(0);
		double hra = (.2*basic);
		double da = (.5*basic);
		double pf = (.11*basic);
		double tot = 0;
		if (ch == 'A'){
			tot = basic +hra+da+1700 - pf; 
		}
		else if (ch == 'B') {
			tot = basic + hra + da  + 1500 - pf;
		}
		else{
			tot = basic + hra + da  + 1300 - pf;
		}
		System.out.format("%.0f",tot);
		// System.out.println(" "+ch);


	}
}
