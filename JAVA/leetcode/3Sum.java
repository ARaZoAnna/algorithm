//https://leetcode.com/problems/3sum/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new LinkedList<>();
        //정렬
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            
            //중복 제거
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int lt = i+1;
            int rt = nums.length - 1;
            
            while(lt < rt){
                int sum = nums[i] + nums[lt] + nums[rt];

                if(sum > 0) rt--;
                else if(sum < 0) lt++;
                else{
                    ret.add(new LinkedList<Integer>(Arrays.asList(nums[i], nums[rt], nums[lt])));
                    while(lt < rt && nums[lt] == nums[lt+1]) lt++;
                    while(lt < rt && nums[rt] == nums[rt-1]) rt--;
                    lt++;
                    rt--;
                }
            }
        }
        return ret;
    }
}
