//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149914&subtitleLanguage=ko

import java.util.*;
class Solution {
	public int solution(int[] nums){
		int answer = 0;

		HashSet<Integer> set = new HashSet<>();
		for(int n : nums) set.add(n);
		for(int n : set){
			int cnt = 0;
			if(set.contains(n-1)) continue;
			else{
				while(set.contains(n++)){
					cnt++;
				}
				if(answer < cnt) answer = cnt;
			}
		}

		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
		System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
		System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
	}
}
