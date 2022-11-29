import java.util.Scanner;

/*Detective Dog
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Ram has a military dog which has special ability of hearing, He can hear frequencies starting from 70Hz to 44000Hz (both inclusive). Now Ram want's to detect some unusual sounds across him. Tell "Yes" or "No" wether his dog can detect the sound or not.
Input
First line of the input contains the value of Test cases T.
Each test case consists of a single integer X - the frequency of unusual sound in Hertz.

Constraints
1 ≤ T ≤ 104
1 ≤ X ≤ 105
Output
Print Yes or No wether his dog can detect them or not for each test case.
Example
Sample Input
3
21
453
45000
Sample Output
No
Yes
No */
public class DetectiveDog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            if (n>=70 && n<= 44000){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}