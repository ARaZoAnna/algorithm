//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149846&subtitleLanguage=ko

import java.util.*;
class Solution {
	public int solution(String s){
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		HashSet<Integer> set = new HashSet<>();

		for(char key : map.keySet()){
			int num = map.get(key);
			while(set.contains(num)){
				num--;
				answer++;
			}
			if(num > 0) set.add(num);
			
			
		}
		
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution("aaabbbcc"));	
		System.out.println(T.solution("aaabbc"));	
		System.out.println(T.solution("aebbbbc"));	
		System.out.println(T.solution("aaabbbcccde"));	
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));	
	}
}
