//https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        // XOR
        // n ^ n = 0;
        int ret = 0;
        for(int num : nums){
            ret ^= num;
        }
        return ret;
    }
}
