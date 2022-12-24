import java.util.Arrays;

public class MergeSort {
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
        int arr[] = {5,4,3,7,8,3,2,1,5,6,605,4,33,44444,5422};
        int n = arr.length;
        divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
