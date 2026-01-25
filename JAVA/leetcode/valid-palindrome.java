//https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {

        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int rt = res.length()-1;
        int lt = 0;
        while(lt < rt){
            if(res.charAt(lt++) != res.charAt(rt--)){
                return false;
            }

        }

        return true; 
    }
}
