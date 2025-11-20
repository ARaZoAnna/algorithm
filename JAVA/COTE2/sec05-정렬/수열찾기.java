//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149931&subtitleLanguage=ko

import java.util.*;
class Main {
	public int[] solution(int[] nums){
		int[] answer = new int[nums.length / 2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        Arrays.sort(nums);

        int idx = 0;
        for(int cur : nums){
            if(map.get(cur) > 0 ){
                answer[idx] = cur;
                idx++;
                map.put(cur, map.get(cur)-1);
                map.put(cur*2, map.get(cur*2)-1);
            }
        }
	
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}
