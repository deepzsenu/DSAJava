import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n/2; i++){
			for(int j = 0; j<n/2; j++){
                if (j<n/2-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
				
			}
			for(int j = n/2; j<n; j++){
				if (j<=(n/2)+i){
                    System.out.print("*");
                }
			}
			System.out.println();
		}
        for(int i =n/2; i<n; i++){
			for(int j = 0; j<n/2; j++){
                if (j>=i-n/2){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }				
			}
            for(int j = n/2; j<n; j++){
				if (j>=i){
                    System.out.print("*");
                }
			}
			System.out.println();
		}
		
	}

}
