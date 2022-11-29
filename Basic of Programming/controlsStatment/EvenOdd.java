import java.util.Scanner;

// package Basic of Programming.controlsStatment;
/*Conditional statement- Even or Odd
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer, your task is to check whether the given integer is even or odd.
If the integer is even print 0 else if it is odd print 1.
Input
The input contains a single integer N.

Constraint:
1<=N<=10000
Output
If the integer is even print 0 else if it is odd print 1.
Example
Sample Input:-
15

Sample Output:-
1

Sample Input:-
16

Sample Output:-
0
 */

public class EvenOdd {
    static int EvenOrOdd(int N){
        //enter your code here
        if (N%2 == 0)
        {
            return 0;
        }
        else
        return 1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(EvenOrOdd(n));
    }
}
