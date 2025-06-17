//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149836&subtitleLanguage=ko&audioLanguage=ko

import java.util.*;
class Solution {
	public int[] solution(int[] enter, int[] exit){
		int len = enter.length;
		int[] answer = new int[len];
		int[] enterT = new int[len+1];
		int[] exitT = new int[len+1];
		boolean[] check = new boolean[len+1];

		//시간 값 넣기
		enterT[enter[0]] = 1;
		
		int time = 0;
		int out = 0;
		for(int in = 0; in < len; in++){
			check[enter[in]] = true; // 들어갔는지 확인
			time++;
			enterT[enter[in]] = time;
			while(out < len && check[exit[out]]){ // 입장했다면
				time++;
				exitT[exit[out++]] = time;
			}
			
			
		}
		
		for(int i = 1; i <= len; i++){
			int cnt = 0;
			for(int j = 1; j <= len; j++ ){
				if(i == j) continue;
				if(enterT[j] < exitT[i] && enterT[i] < exitT[j]) cnt++;
			}
			answer[i-1] = cnt;
		}
		return answer;
	}
		
	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 5, 3, 4}, new int[]{2, 3, 1, 4, 5})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 5, 7, 6, 8}, new int[]{2, 3, 5, 6, 1, 4, 8, 7})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 7, 2, 3, 5, 6}, new int[]{5, 2, 6, 1, 7, 3, 4})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3})));
	}
}
