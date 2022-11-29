import java.util.Scanner;

// package Basic of Programming.Programming Syntax;
/*Number dilemma
Problem Statement
Nobita likes a number if it is stored in an integer while Doraemon likes it when it is stored in a String. Your task is to write a code so that they can easily convert an integer to a string or a string to an integer whenever they want.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the following functions:-
StringToInt() that takes String S as parameter.
IntToString() that takes the integer N as parameter.

Constraints:-
1 <= (Given Number) <= 100
Output
Return an integer in StringToInt() while return a integer integer in IntToString(). The driver code will print "Nice Job" if your code is correct otherwise "Wrong answer".
Example
Sample Input:-
5

Sample Output:-
Nice Job

Sample Input:-
12

Sample Output:-
Nice Job
 */

public class NumberDellima {
    static int StringToInt(String S){
        //Enter your code here
            return Integer.parseInt(S);
        }
        static String IntToString(int N){
        //Enter your code here
            return Integer.toString(N);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(Integer.toString(n) == IntToString(n) && n == StringToInt(IntToString(n))){
            System.out.println("Nice Job");
        }
        else{
            System.out.println("Wrong Ans");
        }
    }
}
