/**
Five Stars
In this task, you have to print 5 stars ("*") vertically and 5 horizontally.

Input Format:
There is no input for the program.

Output Format:
* * * * *
*
*
*
*
*
Explanation:

Print 5 horizontal stars separated by 1 space followed by 5 vertical stars.

Common Mistakes
You do not need for loop here.
 */

public class FiveStar {
    public static void main(String args[]) {
        // your code here
      for (int i = 0; i<5; i++){
        System.out.print("* ");
      }
      System.out.println();
      for (int i = 0; i<5; i++){
        System.out.println("*");
      }
    }
}