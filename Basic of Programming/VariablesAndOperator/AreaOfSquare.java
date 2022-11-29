import java.util.Scanner;

/*Area of Square
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a side of a square, your task is to calculate its area.
Input
The first line of the input contains the side of the square.

Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3

Sample Output:-
9

Sample Input:-
6

Sample Output:-
36
 */
public class AreaOfSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}