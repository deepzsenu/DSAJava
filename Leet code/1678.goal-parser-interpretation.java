/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */

// @lc code=start
class Solution {
    public String interpret(String command) {
        int len = command.length();
        if(len==1)return "G";
        String ans="";
        int i=0;
        while(i<len)
        {
            if(command.charAt(i)=='G'){ans+="G";i++;}
            else if(i<len-1&&command.charAt(i)== '(' && command.charAt(i+1)==')'){
               ans+="o";
               i+=2;
            }else if(i<len-3&&command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                ans+="al";
                i+=4;
            }
        }
        return ans;
    }
}
// @lc code=end

