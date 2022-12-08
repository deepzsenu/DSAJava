import java.util.Arrays;
import java.util.Scanner;

/*Newton Loves Different Cities
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N distinct cities C1, C2,. . CN on a number line and Newton is currently in city X.

Now he wants to travel to all other cities.

So he wants to choose an integer S such that he can visit all the cities starting from city X using 2 operations:
1) Subtract S from the current city number and go to the resultant city.
2) Add S to the current city number and go to the resultant city.

Find the maximum S such that newton can visit all the N cities.

(Note: He may visit other cities (not in the N cities list) as well in the process to visit all N cities)
Input
The first line of the input consists of 2 integers N and X
The next line contains N different integers C0, C1,. . CN

Constraints:
1 <= N <= 105
1 <= X <= 109
1 <= Ci <= 109
Output
Find the maximum S
Example
Sample Input 1:
3 3
1 11 13

Sample Output 1:
2

Explanation:
Setting S=2 enables you to visit all the cities as follows, and this is the maximum possible S.
Perform Move 2 to travel to coordinate 1.
Perform Move 1 to travel to coordinate 3.
Perform Move 1 to travel to coordinate 5.
Perform Move 1 to travel to coordinate 7.
Perform Move 1 to travel to coordinate 9.
Perform Move 1 to travel to coordinate 11
Perform Move 1 to travel to coordinate 13
 */
public class LoveDifferentCities {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        int sec_x = 0;
        for (int  i= 0; i<n; i++){
            if (arr[i]>sec_x && arr[i]<x){
                sec_x = arr[i];
            }
        }
        int m = x -sec_x;
        int num = max-min;
        boolean  status = false;
        while (status == false || m >=1){
            for (int i =1; i<n; i++){
                if ((arr[i]-arr[0])%m == 0){
                    status = true;
                }
                else{
                    status = false;
                    break;
                }
            }
            if (status == true){
                break;
            }
            else{
                m--;
            }
        }
        System.out.println(m);
    }
}
