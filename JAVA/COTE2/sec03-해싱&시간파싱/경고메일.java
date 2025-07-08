//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149854&subtitleLanguage=ko

import java.util.*;
class Info{
	String name;
	int t;
	String status;

	public Info(String name, int t, String status){
		this.name = name;
		this.t = t;
		this.status = status;
	}
}
class Solution {
	public Info parsing(String str){
		int hour = Integer.parseInt(str.split(" ")[1].split(":")[0]);
		int minutes = Integer.parseInt(str.split(" ")[1].split(":")[1]);
		return new Info(str.split(" ")[0],(hour*60 + minutes),str.split(" ")[2]);
	}
	public String[] solution(String[] reports, int time){
		String[] answer;
		HashMap<String, Integer> inT = new HashMap<>();
		HashMap<String, Integer> sumT = new HashMap<>();

		for(String str : reports){
			Info cur = parsing(str);
			if(cur.status.equals("in")){
				inT.put(cur.name, inT.getOrDefault(cur.name, 0)+cur.t);
				//inT.putIfAbsent(cur.name, cur.t);
			}else if(cur.status.equals("out")){
				int stay = cur.t - inT.get(cur.name);
				sumT.put(cur.name, sumT.getOrDefault(cur.name, 0)+stay);
				inT.put(cur.name, 0);
			}
			//System.out.println("name: " + cur.name + " inT: " + inT.get(cur.name) + " sumT: " + sumT.get(cur.name));
			
		}
		
		ArrayList<String> ans = new ArrayList<>();
		for(String key : sumT.keySet()){
			if(sumT.get(key) > time) ans.add(key);
			//System.out.println(sumT.get(key));
		}
		ans.sort((a,b)->a.compareTo(b));
		answer = new String[ans.size()];
		for(int i = 0; i < ans.size(); i++){
			answer[i] = ans.get(i);
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));	
		System.out.println(Arrays.toString(T.solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
		System.out.println(Arrays.toString(T.solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
	}
}
