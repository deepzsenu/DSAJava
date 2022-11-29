import java.util.Scanner;
/*Leap Year
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year(an integer variable) as input, find if it is a leap year or not.
Note: Leap year is the year that is multiple of 4.But, multiples of 100 which are not multiples of 400 are not leap years.
Input
User Task:
Complete the function LeapYear() that takes integer n as a parameter.

Constraint:
1 <= n <= 5000
Output
If it is a leap year then print YES and if it is not a leap year, then print NO
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO */
public class LeapYear {
    public static void main(String[] args) {
        // Capture the user's input
        Scanner scanner = new Scanner(System.in);
        // Storing the captured value in a variable
        int n = scanner.nextInt();
        LeapYear(n);

    }

static void LeapYear(int year){
    //Write code here
    if((year%4 ==0 && year%100 !=0)|| year%400 ==0){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }

}
}
