//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149839&tab=curriculum&subtitleLanguage=ko

import java.util.ArrayList;

class Solution {
	public int solution(int[] nums){
		int cnt = 0, max = Integer.MIN_VALUE;
		int len = nums.length;
		//꼭지 찾기
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i = 1; i < len-1; i++){
			if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) lst.add(i);
		}

		for(int peak : lst){
			cnt = 1;
			//꼭지점에서 왼쪽으로 검사
			int lp = peak;
			while(lp > 0 && nums[lp-1] < nums[lp]){
				cnt++;
				lp--;
			}
			//꼭지점에서 오른쪽으로 검사
			int rp = peak;
			while(rp < len-1 && nums[rp] > nums[rp+1]){
				cnt++;
				rp++;
			}
			max = Math.max(max, cnt);
		}

		return max;	
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}
