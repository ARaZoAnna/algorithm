//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149844&subtitleLanguage=ko&audioLanguage=ko

import java.util.*;
class Solution {
	public int[] solution(String s){
		int[] answer = new int[5];
		HashMap<Character, Integer> map = new HashMap<>();

		//HashMap 초기화
		for(int i = 0; i < 5; i++){
			char key = (char)(97 + i);
			map.put(key, map.getOrDefault(key, 0));
		}
		int max = Integer.MIN_VALUE;
		for(char c : s.toCharArray()){
			map.put(c, map.get(c)+1);
			if(max < map.get(c)) max = map.get(c);
		}
		int idx = 0;
		for(char key : map.keySet()){
			answer[idx++] = max - map.get(key);
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
