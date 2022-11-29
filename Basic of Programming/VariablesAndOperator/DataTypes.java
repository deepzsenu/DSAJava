import java.util.Scanner;

/*Data types
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
You don't have to worry about input, you just have to complete the function printDataTypes()
Output
Print each element in a new line in the same order as input.

Note:- Print float round off to two decimal places and double to 4 decimal places.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c */

public class DataTypes {
    static void printDataTypes(int a, long b, float c, double d, char e) {
        System.out.println(a + "\n" + b);
        System.out.println(String.format("%.2f", c));
        System.out.println(String.format("%.4f", d));
        System.out.println(e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        float c = sc.nextFloat();
        long d = sc.nextLong();
        char e = sc.next().charAt(0);
        printDataTypes(a, b, c, d, e);

    }
}
