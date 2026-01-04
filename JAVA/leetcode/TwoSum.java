//https://leetcode.com/problems/two-sum/

import java.util.*;
class Solution {
    int[] ans = new int[2];
    boolean flag = false;
    public void combination(int depth, int s, int[] nums, int target){
        if(depth == 2){
            int sum = 0;
            for(int a : ans) sum += nums[a];
            if(sum == target) flag = true;
            
        }else{
            for(int i = s; i < nums.length; i++){
                ans[depth] = i;
                combination(depth+1, i+1, nums, target);
                if(flag) break;
            }
        }
    }
    public int[] twoSum(int[] nums, int target) {
        combination(0, 0, nums, target);
        return ans;
    }
}
