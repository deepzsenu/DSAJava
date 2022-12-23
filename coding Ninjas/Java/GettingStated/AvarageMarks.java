// package coding Ninjas.Java.GettingStated;
import java.util.*;
public class AvarageMarks {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int arr[] = new int[3];
		for (int i = 0 ; i<3; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<3; i++){
			sum+=arr[i];
		}
		System.out.println(ch+"\n"+sum/3);
		
	}
}
