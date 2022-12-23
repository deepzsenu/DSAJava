import java.util.*;
public class TriangularStarPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i<n; i++){
			for (int j = 0; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
