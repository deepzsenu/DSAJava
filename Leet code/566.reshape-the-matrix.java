/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length , m = mat[0].length;
        int arr[][] = new int[r][c];
        if(m*n != r*c) return mat;
        for(int i = 0; i < c*r; i++){
            arr[i/c][i%c] = mat[i/m][i%m];
        }
        return arr;
    }
}
// @lc code=end

