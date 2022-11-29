import java.util.Scanner;

/*Logical operators
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
Input
The first line of the input contains 2 integers a and b.

Constraints:
1 <= a, b <= 100
Output
Print the string "true" if the condition holds in each function else "false" .
Example
Sample Input:-
3 12
Sample Output:-
true true true
Explanation
So a = 3 and b = 12, so a<=10 and b>=10 hence first condition true, a is not even but b is even so atleast one of them is even hence true, third a != b which is also true hence the final output comes true true true.

Sample Input:-
10 10
Sample Output:-
true true false */
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String a1 = (a<=10  && b>=10)?"true":"false";
        System.out.print(a1+" ");
        String a2 = (a%2==0 || b%2 ==0 )?("true"):("false");
        System.out.print(a2+ " ");
        String a3 = (a!=b)?"true":"false";
        System.out.print(a3);
    }
}
