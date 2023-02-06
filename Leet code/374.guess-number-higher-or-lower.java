/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low =0 ;
        int high =  n;
        int mid= (n)/2;
        int x = guess(mid);
        while(x!=0 && low<=high){

            if (x ==1){
                low = mid+1;
                mid = low + (high-low)/2;
                x = guess(mid);
            }
            else{
                high  = mid-1;
                mid = low + (high-low)/2;
                x = guess(mid);
            }
        }
        return mid;
    }
}
// @lc code=end

