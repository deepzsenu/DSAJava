// package Basic of Programming.controlsStatment;
/*Conditional statement - Numbers
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer n , your task is to print the lowercase English word corresponding to the number if it is <=5 else print "Greater than 5".

Numbers <=5 and their corresponding words :
1 = one
2 = two
3 = three
4 = four
5 = five
Input
The input contains a single integer N.

Constraint:
1 <= n <= 100
Output
Print a string consisting of the lowercase English word corresponding to the number if it is <=5 else print the string "Greater than 5"
Example
Sample Input:
4

Sample Output
four

Sample Input:
6

Sample Output:
Greater than 5 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Number {
    static String conditional(int n){
    if (n==1 )
    return "one";
    if (n==2)
    return "two";
    if (n==3)
    return "three";
    if (n == 4)
    return "four";
    if (n==5)
    return "five";
    else
    return ("Greater than 5");

}
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(conditional(n));
    }
}
