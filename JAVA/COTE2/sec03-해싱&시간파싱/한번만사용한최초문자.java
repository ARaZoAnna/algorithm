//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149843&subtitleLanguage=ko

import java.util.HashMap;

class Solution {
	public int solution(String s){
		int answer = -1;
		HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < s.length(); i++){
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		for(int i = 0; i < s.length(); i++){
			char key = s.charAt(i);
			if(map.get(key) == 1){
				answer = i+1;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
