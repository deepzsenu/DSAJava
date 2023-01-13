/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
import java.util.*;
class Solution {
    
    public void moveZeroes(int[] nums) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] == 0){
        //         count++;
        //     }
        // }
        // int c = 0;
        // int newarr[] = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] != 0 ){
        //         newarr[c] = nums[i];
        //         c++;
        //     }
        // }
        // for (int i = c; i < nums.length; i++) {
        //     newarr[i] = 0;
        // }

        // for (int i = 0; i < newarr.length; i++) {
        //     nums[i] = newarr[i];
        // }

        // enhanced the upper code.
        if (nums == null || nums.length == 0) return; 
        int k = 0;
        int n0 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0 && n0 ==0){
                k=i;
                n0 = 1;
            }
            else if(nums[i]!=0 && n0!=0){
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
        }
    }
}
// @lc code=end

