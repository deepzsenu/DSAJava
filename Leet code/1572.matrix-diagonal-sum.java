/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum= 0 ; 
        // int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j ){
                    sum+=mat[i][j];
                }
                else if(j == m-i-1){
                    sum+=mat[i][j];
                }
            }
        }

        return sum;
    }
}
// @lc code=end

