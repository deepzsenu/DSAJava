import java.util.Scanner;

// package Basic of Programming.Programming Syntax;
/*String to long typecast
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a String S, you need to typecast this String to Long. If the typecasting is done successfully then we will print "Nice Job" otherwise "Wrong answer".
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function checkConvertion(), which contains S as parameter.

Constraints:-
1 <= |S| <= 15

The string will contain only numeric digits(1-9)
Output
You need to return the typecasted Long value. The driver code will print "Nice Job" otherwise "Wrong answer".

Note:- We are not converting this string to int here because the size of the number exceeds the int limits.
Example
Sample Input:-
43

Sample Output:-
Nice Job

Sample Input:-
2584563259874

Sample Output:-
Nice Job */

public class StringToLongTypeCast {
    static long checkConevrtion(String S)
    {
      //Enter your code here
      return Long.valueOf(S);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == checkConevrtion(Long.toString(n))){
            System.out.println("Nice Job");
        }
        else{
            System.out.println("Wrong Ans");
        }
    }
}
