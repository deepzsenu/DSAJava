import java.util.Scanner;

// package Basic of Programming.controsStatment;
/*FizzBuzz
asked in interviews by 8 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
Input
Input contains a single integer N.

Constraints:-
1 < = N < = 1000
Output
Print N space separated number or Fizz buzz according to the condition.
Example
Sample Input:-
3

Sample Output:-
1 2 Fizz

Sample Input:-
5

Sample Output:-
1 2 Fizz 4 Buzz
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<n+1; i++){
            if (i%5 ==0 && i%3 ==0){
                System.out.print("FizzBuzz ");
            }
            else if (i%5 ==0){
                System.out.print("Buzz ");
            }
            else if(i%3 ==0){
                System.out.print("Fizz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
