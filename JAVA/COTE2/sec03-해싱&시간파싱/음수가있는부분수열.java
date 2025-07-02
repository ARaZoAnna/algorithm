//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149848&subtitleLanguage=ko

import java.util.HashMap;

class Solution {
	public int solution(int[] nums, int m){
		int answer = 0, sum = 0;
		int len = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < len; i++){
			sum += nums[i];
			if(sum-m == 0) answer++;
			else if(map.containsKey(sum-m)) answer += map.get(sum-m);
			map.put(sum, map.getOrDefault(sum, 0)+1);

		}
		
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(T.solution(new int[]{-1, 0, 1}, 0));	
		System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));	

	}
}
