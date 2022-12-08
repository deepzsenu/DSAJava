import java.util.Scanner;

// package Basic of Programming.controlsStatment;
/*Bidding
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice, Bob and Charlie are bidding for an artifact at an auction. Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A, B, and C are distinct). According to the rules of the auction, the person who bids the highest amount will win the auction. Determine who will win the auction.
Input
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers A, B, and C, — the amount bid by Alice, Bob, and Charlie respectively.

Constraints
1 ≤ T ≤ 1000
1 ≤ A, B, C ≤ 1000
A, B, and C are distinct.
Output
For each test case, output who (out of Alice, Bob, and Charlie) will win the auction.
Example
Sample Input :
4
200 100 400
155 1000 566
736 234 470
124 67 2

Sample Output :
Charlie
Bob
Alice
Alice

Explanation :

Charlie wins the auction since he bid the highest amount.

Bob wins the auction since he bid the highest amount.

Alice wins the auction since she bid the highest amount.

Alice wins the auction since she bid the highest amount.
 */

public class Bidding {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a>b && a>c){
                System.out.println("Alice");
            }
            else if (b>c && b>a){
                System.out.println("Bob");
            }
            else if(c>b && c>a){
                System.out.println("Charlie");
            }
         }
    }
}
