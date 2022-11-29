import java.util.Scanner;

// package Basic of Programming.VariablesAndOperator;
/*Problem Statement
Nobita wants to become rich so he came up with some ideas. Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. Now Nobita wants to know how much he gains by selling 1 gadget. As we all know Nobita is weak in maths help him to find the profit he gets
Input
You don't have to worry about the input, you just have to complete the function Profit()

Constraints:-
1 <= C <= S <= 1000
Output
Print the profit Nobita gets from selling one gadget.
Example
Sample Input:-
3 5

Sample Output:-
2

Sample Input:-
9 15

Sample Output:-
6 */

public class NobitaAndProfit {
    static int Profit(int C, int S){
        //Enter your code here
        int pro = S-C;
        return pro;
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Profit(a, b));

    }
}
