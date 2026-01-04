//https://leetcode.com/problems/two-sum/

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);          
        }
        for(int i = 0; i < nums.length; i++){
            int check = 0;
            if(nums[i] <= target) check = target - nums[i];
            if(map.containsKey(check) && map.get(check) != i){
                answer[0] = i;
                answer[1] = map.get(check);
                break;
            }
        }
        return answer;
    }
}
