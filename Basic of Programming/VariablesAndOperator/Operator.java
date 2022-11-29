import java.util.Scanner;

// package Basic of Programming.VariablesAndOperator;
/*Operators
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to calculate and print the following four values:-
a+b
a-b
a*b
a/b

Note:- See example for more clarity.
Input
The input contains two integers a and b separated by spaces.

Constraints:
1 <= b <= a <= 1000

Note: It is guaranteed that a will be divisible by b.
Output
Print the mentioned operations each in a new line.
Example
Sample Input:
15 3
Sample Output:
18
12
45
5
Explanation
First operation is a+b so 15+3 = 18
Second Operation is a-b so 15-3 = 12
Third Operation is a*b so 15*3 = 45
Fourth Operation is a/b so 15/3 = 5 */

public class Operator {
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n+m); 
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println(n/m);

    }
}
