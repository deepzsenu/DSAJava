/*
Third largest element
BasicAccuracy: 45.04%Submissions: 69K+Points: 1
Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3
largest element in the array A.

Example 1:

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
Example 2:

Input:
N = 2
A[] = {10,2}
Output: -1
Your Task:
Complete the function thirdLargest() which takes the array a[] and the size of the array,
n, as input parameters and returns the third largest element in the array. It return -1 if
there are less than 3 elements in the given array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105 */
public class FindTheThirdLargest {
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int lar = a[0];
	    int sec = -1;
	    int thr = -1;
	    for (int i = 1; i<n; i++){
	        if (lar<a[i]){
	            thr = sec;
	            sec = lar;
	            lar = a[i];
	        }
	        else if( sec<a[i]){
	            thr = sec;
	            sec = a[i];
	        }
	        else if (thr<a[i]){
	            thr = a[i];
	        }
	    }
	    return thr;
    }
}
