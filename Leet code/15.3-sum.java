/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> returnSet = new HashSet();
        Set<Integer> set = new HashSet();
        for(int k=0 ; k < nums.length ; k++){
            if(set.contains(k))continue;
            set.add(nums[k]);
            int left = k+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[k];
                if(sum == 0){
                    returnSet.add(Arrays.asList(nums[left] , nums[right] , nums[k]));
                    while((left < right) && nums[left] == nums[left+1])left++;
                    while((left < right) && nums[right] == nums[right-1])right--;
                    left++;
                    right++;
                }if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(returnSet);
    }
}
// @lc code=end

