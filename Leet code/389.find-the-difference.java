/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        // for (int i = 0; i < s.length(); i++) {
        //     if(s.charAt(i)!= t.charAt(i)){
        //         return t.charAt(i);
        //     }
        // }
        // return t.charAt(t.length()-1);
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}
// @lc code=end

