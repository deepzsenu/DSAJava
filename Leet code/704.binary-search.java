/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int low =0 ;
        int high =  nums.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
// @lc code=end
