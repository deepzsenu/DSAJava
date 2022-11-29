import java.util.Scanner;

// package Basic of Programming.VariablesAndOperator;
/*Steps Execution
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input
You don't have to worry about the input, you just have to complete the function stepsExecute

Constraints
1000 <= number <= 9999
Output
Print the final result
Example
Sample Input :
2345

Sample Output :
20 */

public class StepsExecution {
    static void stepsExecute(int N){
	    /*Write your code here*/
		int ans = N+8;
		ans  = ans/3;
		ans = ans%5;
		ans = ans*5;
		System.out.println(ans);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stepsExecute(n);

    }
}
