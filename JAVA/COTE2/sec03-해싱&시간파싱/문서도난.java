//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149852&subtitleLanguage=ko

import java.util.*;
class Pair implements Comparable<Pair>{
	String name;
	int time;
	public Pair(String name, int time){
		this.name = name;
		this.time = time;
	}
	@Override
	public int compareTo(Pair o){
		return this.time - o.time;
	}

}
class Solution {
	public int toMinutes(String hour, String minutes){
		int h = Integer.parseInt(hour);
		int m = Integer.parseInt(minutes);
		return h*60 + m;
	}
	public String[] solution(String[] reports, String times){
		String[] answer = {};
		ArrayList<Pair> lst = new ArrayList<>();
		ArrayList<String> ans = new ArrayList<>();
		for(String s : reports){
			String name = s.split(" ")[0];
			String hour = s.split(" ")[1].split(":")[0];
			String minutes = s.split(" ")[1].split(":")[1];
			
			int time = toMinutes(hour, minutes);
			lst.add(new Pair(name, time));
		}
		Collections.sort(lst);

		String start = times.split(" ")[0];
		String end = times.split(" ")[1];
		int s = toMinutes(start.split(":")[0], start.split(":")[1]);
		int e = toMinutes(end.split(":")[0], end.split(":")[1]);

		for(Pair tmp : lst){
			if(s <= tmp.time && tmp.time <= e){
				ans.add(tmp.name);
			}
		}
		
		answer = new String[ans.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = ans.get(i);
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}
