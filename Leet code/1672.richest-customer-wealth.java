/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        // int n = accounts[];

        for(int ele =0; ele<m; ele++){
            int n = accounts[ele].length;
            int counts=0;
            for(int am = 0 ; am<n; am++){
                counts+=accounts[ele][am];
            }
            if (counts>max){
                max = counts;
            }
        }
        return max;
    }
}
// @lc code=end

