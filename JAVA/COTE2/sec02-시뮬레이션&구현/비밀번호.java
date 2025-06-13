//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149834&subtitleLanguage=ko&audioLanguage=ko

import java.util.*;

class Solution {
	public int solution(int[] keypad, String password){
		int[] dr = {0,1,1,1,0,-1,-1,-1};
		int[] dc = {1,1,0,-1,-1,-1,0,1};
	
		int answer = 0;
		//비밀번호 숫자로 변환
		int len = password.length();
		int[] pw = new int[len];
		int idx = 0;
		for(char p : password.toCharArray()){
			pw[idx++] = (int)p - '0';
		}

		//키패드를 이차원 배열에 입력
		int[][] arr = new int[3][3];
		for(int i = 0; i < 9; i++){
			arr[i/3][i%3] = keypad[i];
		}
		
		//거리를 저장하는 배열 
		int[][] dist = new int[10][10];
		for(int i = 0; i < 10; i++){
			Arrays.fill(dist[i], 2);
		}
		
		for(int i = 1; i < 10; i++) dist[i][i] = 0;

		for(int r = 0; r < 3; r++){
			for(int c = 0; c < 3; c++){				
				for(int dir = 0; dir < 8; dir++){
					int nr = r + dr[dir];
					int nc = c + dc[dir];
					if(nr >= 0 && nr < 3 && nc >= 0 && nc <3){
						dist[arr[r][c]][arr[nr][nc]] = 1;
					}
				}
			}
		}		
	
		for(int i = 0; i < len-1; i++){
			answer += dist[pw[i]][pw[i+1]];
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}
