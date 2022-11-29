import java.util.Scanner;

// package Basic of Programming.VariablesAndOperator;
/*Simple Input- String
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S, your task is to take input of the given string and print the same string.
Input
You don't have to worry about taking input, you just have to complete the function printString
Output
Print the string S.
Example
Sample Input:-
NewtonSchool

Sample Output:-
NewtonSchool

Sample Input:-
Hello

Sample Output:-
Hello */

public class SimpleInputString {
    static void printString(String stringVariable){
	    /* Write your code here*/
		System.out.println(stringVariable);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printString(s);

    }
}
