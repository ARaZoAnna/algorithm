//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149850&subtitleLanguage=ko

import java.util.*;
class Solution {
	public String solution(String[] votes, int k){
		String answer = " ";
		HashMap<String, HashSet<String>> voteHash = new HashMap<>();
		HashMap<String, Integer> candidate = new HashMap<>();
		HashMap<String, Integer> presents = new HashMap<>();

		for(String s : votes){
			String[] tmp = s.split(" ");
			voteHash.putIfAbsent(tmp[0], new HashSet());
			voteHash.get(tmp[0]).add(tmp[1]);
			candidate.put(tmp[1], candidate.getOrDefault(tmp[1], 0)+1);
		}

		int max = Integer.MIN_VALUE;
		for(String key : voteHash.keySet()){
			int cnt = 0;
			for(String name : voteHash.get(key)){
				if(candidate.get(name) >= k) cnt++;
			}
			presents.put(key, cnt);
			max = Math.max(max, cnt);
		}
		ArrayList<String> ans = new ArrayList<>();
		for(String n : presents.keySet()){
			if(presents.get(n) == max) ans.add(n);
		}
		ans.sort((a,b) -> a.compareTo(b));
		answer = ans.get(0);
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
	}
}
