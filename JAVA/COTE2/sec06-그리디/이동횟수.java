//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149944&subtitleLanguage=ko

import java.util.*;
class Main {
	public int solution(int[] nums){
		int answer = 0;
		
        Arrays.sort(nums);

        int rp = nums.length - 1;
        int lp = 0;
        while(rp >= lp){
            if(nums[rp] + nums[lp] > 5){
                rp--;
                answer++;
            }else{
                rp--;
                lp++;
                answer++;
            }
            
        }
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
	}
}
