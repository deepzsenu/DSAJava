import java.util.Scanner;

// package Basic of Programming.Programming Syntax;
/*Swap
asked in interviews by 5 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two elements A and B, your task is to swap the given two elements.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Swap().
Output
You don't need to print anything, you just need to swap the given elements.
Example
Sample Input:-
A = 5, B = 7

Sample Output:-
A = 7, B = 5

Sample Input:-
A = 3, B = 6

Sample Output:-
A = 6, B = 3 */

public class Swap {
    static int A;
    static int B ;
    static void swap(){
        //Enter your code here  
            int temp  = A;
            A = B;
            B = temp;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        swap();
        System.out.println(A+" "+B);

    }
}
