import java.util.Arrays;

/*
At least two greater elements
SchoolAccuracy: 58.49%Submissions: 31K+Points: 0
Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


Example 1:

Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.   
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector sorted values denoting the elements in array which have at-least two greater elements than themselves.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)
*/
public class AtleastTwoGreater {
    public static void divide(int arr[],int si, int ei) {
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    private static void conquer(int[] arr, int si, int mid, int ei) {
        int merge[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<= mid && idx2<= ei){
            if (arr[idx1]<=arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2<=ei){
            merge[x++] = arr[idx2++];
        }
        for (int i=0, j=si; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }

    }
    public static void main(String[] args) {
        int a[] = {3,2,4,23,1,1,2,2,476,8,97,77,66,6,554,43,3,32,22};
        divide(a,0,a.length-1);// merge sort implementation.
        int arr[] = new int[a.length-2];
        for (int i =0 ; i<a.length-2; i++){
            arr[i] = a[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
