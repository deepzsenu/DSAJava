import java.util.Scanner;

/*Simple Input - Integer
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, your task is to take input of the given integer and print it.
Input
You don't have to worry about the input, you just have to complete the function printIntger()

Constraints:-
1 <= N <= 100
Output
Print the integer N.
Example
Sample Input:-
3

Sample Output:
3

Sample Input:
56

Sample Output:
56 */

public class SimpleInputInteger{
    static void printInteger(int intVariable){
	    /* Write Your Code Here*/
		System.out.println(intVariable);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInteger(n);
    }
}