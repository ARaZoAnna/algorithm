//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149831&tab=curriculum

import java.util.*;
class Solution {
	public int[] solution(int c, int r, int k){
		int[] answer = new int[2];
		int[] dr = {0, 1, 0, -1}, dc = {1, 0, -1, 0};
		int cc = r, rr = c;
		int[][] seat = new int[rr][cc];
		
		seat[0][0] = 1;
		int cnt = 1, dir = 0;

		while(cnt < k){
			if(k > c*r){
				answer[0] = -1;
				answer[1] = -1;
				break;
			}

			int nr = answer[0] + dr[dir];
			int nc = answer[1] + dc[dir];
			if(nr < 0 || nr >= rr || nc < 0 || nc >= cc || seat[nr][nc] != 0){
				dir = (dir+1) % 4;
			}else{
				cnt++;
				seat[nr][nc] = cnt;
				answer[0] = nr;
				answer[1] = nc;
			}
		}


		answer[0]++;
		answer[1]++;
		
		
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}








