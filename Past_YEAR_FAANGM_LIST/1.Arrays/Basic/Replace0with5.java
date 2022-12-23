/*

Replace all 0's with 5
BasicAccuracy: 75.55%Submissions: 59K+Points: 1
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:

Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000 */
public class Replace0with5 {
    // method 1
    int convertfive(int num) {
        // Your code here
        int n =0;
        while(num>0){
            int rem = num%10;
            if (rem == 0){
                n = n*10+5;
            }
            else{
                n = n*10 +rem;
            }
            num = num/10;
        }
        num = 0;
        while(n>0){
            num = num*10 + (n%10);
            n = n/10;
        }
        return num;
    }
    // meth0d 2
    int convertfive2(int num) {
        // Your code here
        int changeNum = 0;
        int j = 1;
        int n = num;
        while(n>0){
            int rem = n%10;
            if (rem ==0 ){
                rem = 5;
            }
            changeNum = j*rem+changeNum;
            j = j*10;
            n = n/10;
        }
        return changeNum;
    }

    // method 3
    int convertfive3(int num) {
        // Your code here
        String n = Integer.toString(num) ;
        String changeNum = n.replace('0', '5');
        return Integer.parseInt(changeNum);
    }
}
